package com.campaign.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

    private String AUTH_CONTEXT_PATH="campaign-auth";


	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(AUTH_CONTEXT_PATH, r -> r.path("/"+AUTH_CONTEXT_PATH+"/**").uri("lb://"+AUTH_CONTEXT_PATH))
				.build();
	}

}
