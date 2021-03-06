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
package org.apache.camel.kafkaconnector.ehcache;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelEhcacheSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_EHCACHE_PATH_CACHE_NAME_CONF = "camel.sink.path.cacheName";
    public static final String CAMEL_SINK_EHCACHE_PATH_CACHE_NAME_DOC = "the cache name";
    public static final String CAMEL_SINK_EHCACHE_PATH_CACHE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_CACHE_MANAGER_CONF = "camel.sink.endpoint.cacheManager";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_CACHE_MANAGER_DOC = "The cache manager";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_CACHE_MANAGER_DEFAULT = null;
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_CACHE_MANAGER_CONFIGURATION_CONF = "camel.sink.endpoint.cacheManagerConfiguration";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_CACHE_MANAGER_CONFIGURATION_DOC = "The cache manager configuration";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_CACHE_MANAGER_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_CONFIGURATION_URI_CONF = "camel.sink.endpoint.configurationUri";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_CONFIGURATION_URI_DOC = "URI pointing to the Ehcache XML configuration file's location";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_CONFIGURATION_URI_DEFAULT = null;
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_CREATE_CACHE_IF_NOT_EXIST_CONF = "camel.sink.endpoint.createCacheIfNotExist";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_CREATE_CACHE_IF_NOT_EXIST_DOC = "Configure if a cache need to be created if it does exist or can't be pre-configured.";
    public static final Boolean CAMEL_SINK_EHCACHE_ENDPOINT_CREATE_CACHE_IF_NOT_EXIST_DEFAULT = true;
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_ACTION_CONF = "camel.sink.endpoint.action";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_ACTION_DOC = "To configure the default cache action. If an action is set in the message header, then the operation from the header takes precedence.";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_ACTION_DEFAULT = null;
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_KEY_CONF = "camel.sink.endpoint.key";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_KEY_DOC = "To configure the default action key. If a key is set in the message header, then the key from the header takes precedence.";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_EHCACHE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_CONFIGURATION_CONF = "camel.sink.endpoint.configuration";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_CONFIGURATION_DOC = "The default cache configuration to be used to create caches.";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_CONFIGURATIONS_CONF = "camel.sink.endpoint.configurations";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_CONFIGURATIONS_DOC = "A map of cache configuration to be used to create caches.";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_CONFIGURATIONS_DEFAULT = null;
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_KEY_TYPE_CONF = "camel.sink.endpoint.keyType";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_KEY_TYPE_DOC = "The cache key type, default java.lang.Object";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_KEY_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_EHCACHE_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_VALUE_TYPE_CONF = "camel.sink.endpoint.valueType";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_VALUE_TYPE_DOC = "The cache value type, default java.lang.Object";
    public static final String CAMEL_SINK_EHCACHE_ENDPOINT_VALUE_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_CACHE_MANAGER_CONF = "camel.component.ehcache.cacheManager";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_CACHE_MANAGER_DOC = "The cache manager";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_CACHE_MANAGER_DEFAULT = null;
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_CACHE_MANAGER_CONFIGURATION_CONF = "camel.component.ehcache.cacheManagerConfiguration";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_CACHE_MANAGER_CONFIGURATION_DOC = "The cache manager configuration";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_CACHE_MANAGER_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_CONFIGURATION_URI_CONF = "camel.component.ehcache.configurationUri";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_CONFIGURATION_URI_DOC = "URI pointing to the Ehcache XML configuration file's location";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_CONFIGURATION_URI_DEFAULT = null;
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_CREATE_CACHE_IF_NOT_EXIST_CONF = "camel.component.ehcache.createCacheIfNotExist";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_CREATE_CACHE_IF_NOT_EXIST_DOC = "Configure if a cache need to be created if it does exist or can't be pre-configured.";
    public static final Boolean CAMEL_SINK_EHCACHE_COMPONENT_CREATE_CACHE_IF_NOT_EXIST_DEFAULT = true;
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_ACTION_CONF = "camel.component.ehcache.action";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_ACTION_DOC = "To configure the default cache action. If an action is set in the message header, then the operation from the header takes precedence.";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_ACTION_DEFAULT = null;
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_KEY_CONF = "camel.component.ehcache.key";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_KEY_DOC = "To configure the default action key. If a key is set in the message header, then the key from the header takes precedence.";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.ehcache.lazyStartProducer";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_EHCACHE_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.ehcache.autowiredEnabled";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_EHCACHE_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_CONFIGURATION_CONF = "camel.component.ehcache.configuration";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_CONFIGURATION_DOC = "The default cache configuration to be used to create caches.";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_CONFIGURATIONS_CONF = "camel.component.ehcache.configurations";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_CONFIGURATIONS_DOC = "A map of cache configuration to be used to create caches.";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_CONFIGURATIONS_DEFAULT = null;
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_KEY_TYPE_CONF = "camel.component.ehcache.keyType";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_KEY_TYPE_DOC = "The cache key type, default java.lang.Object";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_KEY_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_VALUE_TYPE_CONF = "camel.component.ehcache.valueType";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_VALUE_TYPE_DOC = "The cache value type, default java.lang.Object";
    public static final String CAMEL_SINK_EHCACHE_COMPONENT_VALUE_TYPE_DEFAULT = null;

    public CamelEhcacheSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelEhcacheSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_EHCACHE_PATH_CACHE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_PATH_CACHE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_EHCACHE_PATH_CACHE_NAME_DOC);
        conf.define(CAMEL_SINK_EHCACHE_ENDPOINT_CACHE_MANAGER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_ENDPOINT_CACHE_MANAGER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_ENDPOINT_CACHE_MANAGER_DOC);
        conf.define(CAMEL_SINK_EHCACHE_ENDPOINT_CACHE_MANAGER_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_ENDPOINT_CACHE_MANAGER_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_ENDPOINT_CACHE_MANAGER_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_EHCACHE_ENDPOINT_CONFIGURATION_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_ENDPOINT_CONFIGURATION_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_ENDPOINT_CONFIGURATION_URI_DOC);
        conf.define(CAMEL_SINK_EHCACHE_ENDPOINT_CREATE_CACHE_IF_NOT_EXIST_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_EHCACHE_ENDPOINT_CREATE_CACHE_IF_NOT_EXIST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_ENDPOINT_CREATE_CACHE_IF_NOT_EXIST_DOC);
        conf.define(CAMEL_SINK_EHCACHE_ENDPOINT_ACTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_ENDPOINT_ACTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_ENDPOINT_ACTION_DOC);
        conf.define(CAMEL_SINK_EHCACHE_ENDPOINT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_ENDPOINT_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_ENDPOINT_KEY_DOC);
        conf.define(CAMEL_SINK_EHCACHE_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_EHCACHE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_EHCACHE_ENDPOINT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_ENDPOINT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_ENDPOINT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_EHCACHE_ENDPOINT_CONFIGURATIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_ENDPOINT_CONFIGURATIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_ENDPOINT_CONFIGURATIONS_DOC);
        conf.define(CAMEL_SINK_EHCACHE_ENDPOINT_KEY_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_ENDPOINT_KEY_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_ENDPOINT_KEY_TYPE_DOC);
        conf.define(CAMEL_SINK_EHCACHE_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_EHCACHE_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_EHCACHE_ENDPOINT_VALUE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_ENDPOINT_VALUE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_ENDPOINT_VALUE_TYPE_DOC);
        conf.define(CAMEL_SINK_EHCACHE_COMPONENT_CACHE_MANAGER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_COMPONENT_CACHE_MANAGER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_COMPONENT_CACHE_MANAGER_DOC);
        conf.define(CAMEL_SINK_EHCACHE_COMPONENT_CACHE_MANAGER_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_COMPONENT_CACHE_MANAGER_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_COMPONENT_CACHE_MANAGER_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_EHCACHE_COMPONENT_CONFIGURATION_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_COMPONENT_CONFIGURATION_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_COMPONENT_CONFIGURATION_URI_DOC);
        conf.define(CAMEL_SINK_EHCACHE_COMPONENT_CREATE_CACHE_IF_NOT_EXIST_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_EHCACHE_COMPONENT_CREATE_CACHE_IF_NOT_EXIST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_COMPONENT_CREATE_CACHE_IF_NOT_EXIST_DOC);
        conf.define(CAMEL_SINK_EHCACHE_COMPONENT_ACTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_COMPONENT_ACTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_COMPONENT_ACTION_DOC);
        conf.define(CAMEL_SINK_EHCACHE_COMPONENT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_COMPONENT_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_COMPONENT_KEY_DOC);
        conf.define(CAMEL_SINK_EHCACHE_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_EHCACHE_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_EHCACHE_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_EHCACHE_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_EHCACHE_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_EHCACHE_COMPONENT_CONFIGURATIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_COMPONENT_CONFIGURATIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_COMPONENT_CONFIGURATIONS_DOC);
        conf.define(CAMEL_SINK_EHCACHE_COMPONENT_KEY_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_COMPONENT_KEY_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_COMPONENT_KEY_TYPE_DOC);
        conf.define(CAMEL_SINK_EHCACHE_COMPONENT_VALUE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_EHCACHE_COMPONENT_VALUE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_EHCACHE_COMPONENT_VALUE_TYPE_DOC);
        return conf;
    }
}