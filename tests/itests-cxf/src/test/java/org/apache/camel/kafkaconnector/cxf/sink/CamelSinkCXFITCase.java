/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.kafkaconnector.cxf.sink;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;

import javax.xml.ws.Endpoint;

import org.apache.camel.kafkaconnector.common.AbstractKafkaTest;
import org.apache.camel.kafkaconnector.common.ConnectorPropertyFactory;
import org.apache.camel.kafkaconnector.common.clients.kafka.KafkaClient;
import org.apache.camel.kafkaconnector.common.utils.NetworkUtils;
import org.apache.camel.kafkaconnector.common.utils.TestUtils;
import org.apache.camel.kafkaconnector.cxf.source.HelloService;
import org.apache.cxf.BusFactory;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.frontend.ServerFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.fail;

public class CamelSinkCXFITCase extends AbstractKafkaTest {
    private static final Logger LOG = LoggerFactory.getLogger(CamelSinkCXFITCase.class);
      

    private final int expect = 10;
    
    private final int simplePort = NetworkUtils.getFreePort("localhost");
    private final int jaxwsPort = NetworkUtils.getFreePort("localhost");

    protected static final String ECHO_OPERATION = "echo";
    protected static final String GREET_ME_OPERATION = "greetMe";
    protected static final String TEST_MESSAGE = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
        + "<soap:Body><ns1:echo xmlns:ns1=\"http://cxf.component.camel.apache.org/\">"
        + "<arg0 xmlns=\"http://cxf.component.camel.apache.org/\">hello world</arg0>"
        + "</ns1:echo></soap:Body></soap:Envelope>";

    protected Server server;
    protected Endpoint endpoint;
    
    

    
    @Override
    protected String[] getConnectorsInTest() {
        return new String[] {"camel-cxf-kafka-connector"};
    }

    protected String getSimpleServerAddress() {
        return "http://localhost:" + simplePort + "/" + getClass().getSimpleName() + "/test";
    }

    protected String getJaxWsServerAddress() {
        return "http://localhost:" + jaxwsPort + "/" + getClass().getSimpleName() + "/test";
    }

    
    @BeforeEach
    public void setUp() throws IOException {
        // start a simple front service
        ServerFactoryBean svrBean = new ServerFactoryBean();
        svrBean.setAddress(getSimpleServerAddress());
        svrBean.setServiceClass(HelloService.class);
        svrBean.setServiceBean(new HelloServiceImpl());
        svrBean.setBus(BusFactory.getDefaultBus());
        server = svrBean.create();

        //GreeterImpl greeterImpl = new GreeterImpl();
        //endpoint = Endpoint.publish(getJaxWsServerAddress(), greeterImpl);
    }

    @AfterEach
    public void tearDown() {
        //endpoint.stop();
        server.stop();
        server.destroy();
    }


    private void putRecords() {
        KafkaClient<String, String> kafkaClient = new KafkaClient<>(getKafkaService().getBootstrapServers());

        for (int i = 0; i < expect; i++) {
            try {
                kafkaClient.produce(TestUtils.getDefaultTestTopic(this.getClass()), TEST_MESSAGE);
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            } catch (Throwable  e) {
                e.printStackTrace();
            }
        }
    }

    public void runTest(ConnectorPropertyFactory connectorPropertyFactory) throws ExecutionException, InterruptedException, TimeoutException {
        connectorPropertyFactory.log();
        getKafkaConnectService().initializeConnector(connectorPropertyFactory);
        Thread.sleep(5000);
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(this::putRecords);
        Thread.sleep(5000);
        LOG.debug("Created the consumer ... About to receive messages");
                
    }

    @Test
    @Timeout(90)
    public void testBasicSendReceiveUsingUrl() {
        try {
            

            ConnectorPropertyFactory connectorPropertyFactory = CamelSinkCXFPropertyFactory.basic()
                    .withTopics(TestUtils.getDefaultTestTopic(this.getClass()))
                    .withAddress(getSimpleServerAddress())
                    .withServiceClass("org.apache.camel.kafkaconnector.cxf.source.HelloService")
                    .withDataFormat("RAW");

            runTest(connectorPropertyFactory);
        } catch (Exception e) {
            LOG.error("CXF Sink test failed: {} {}", e.getMessage(), e);
            fail(e.getMessage(), e);
        }
    }

    protected String getSimpleEndpointUri() {
        return getSimpleServerAddress()
               + "?serviceClass=org.apache.camel.kafkaconnector.cxf.source.HelloService";
    }

    protected String getJaxwsEndpointUri() {
        return getJaxWsServerAddress() + "?serviceClass=org.apache.hello_world_soap_http.Greeter";
    }

    
}