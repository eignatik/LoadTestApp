package org.loadx.application.http;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpConfiguration {

    @Bean
    public WebsitesHttpConnector websitesHttpConnector() {
        return WebsitesHttpConnector.createDefault();
    }

}