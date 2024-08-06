package com.campaign.configs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CampaignAppConfigsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampaignAppConfigsApplication.class, args);
	}

}
