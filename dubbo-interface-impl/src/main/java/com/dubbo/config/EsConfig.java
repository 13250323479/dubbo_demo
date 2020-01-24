package com.dubbo.config;

import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

@Configuration
public class EsConfig {

    @Autowired
    private TransportClient client;

//    @Bean
    public ElasticsearchTemplate getElasticsearchTemplate(){
        return new ElasticsearchTemplate(client);
    }
}
