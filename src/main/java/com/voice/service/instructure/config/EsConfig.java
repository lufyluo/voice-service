package com.voice.service.instructure.config;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


import java.net.InetAddress;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.voice.service.domain.repository.sound")
public class EsConfig {
    @Value("${elasticsearch.host}")
    private String EsHost;

    @Value("${elasticsearch.port}")
    private int EsPort;

    @Value("${elasticsearch.clustername}")
    private String EsClusterName;

    @Bean
    public Client client() throws Exception {
        Settings settings = Settings.builder()
                .put("cluster.name", EsClusterName)
                .build();
        //https://www.elastic.co/guide/en/elasticsearch/guide/current/_transport_client_versus_node_client.html
//        return   TransportClient.builder()
////                .settings(settings)
////                .build()
////                .addTransportAddress(
////                        new InetSocketTransportAddress(InetAddress.getByName(EsHost), EsPort));
        TransportClient client = new PreBuiltTransportClient(settings);
        return client.addTransportAddress(
                new InetSocketTransportAddress(InetAddress.getByName(EsHost), EsPort));
    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() throws Exception {
        return new ElasticsearchTemplate(client());
    }

}