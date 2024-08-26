package com.vimukthibw.department_service.config;

import com.vimukthibw.department_service.client.EmployeeClient;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancedExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class WebclientConfig{

    private LoadBalancedExchangeFilterFunction filterFunction;
    @Bean
    public WebClient employeeWebClient(){
        return WebClient.builder()
                       .baseUrl( "http://employee-service" )
                       .filter(filterFunction)
                        .build();
    }

    public EmployeeClient employeeClient(){
        HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory.builder( WebClientAdapter.forClient( employeeWebClient() ) ).build();
        return httpServiceProxyFactory.createClient( EmployeeClient.class );
    }
}