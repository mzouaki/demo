package com.example.springboot.demo.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import com.example.fakeapi.ApiClient;
import com.example.fakeapi.api.BooksApi;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Value("${URI}")
    public String uri;  
    @Bean
    public BooksApi restTemplate() {
        ApiClient defaultClient = new ApiClient();
        defaultClient.setBasePath(this.uri);
        return new BooksApi(defaultClient);
    }

}
