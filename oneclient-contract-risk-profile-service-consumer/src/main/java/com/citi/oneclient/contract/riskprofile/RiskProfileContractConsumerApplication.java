package com.citi.oneclient.contract.riskprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * The {@code RiskProfileContractConsumerApplication} is app entry point
 *	@see RiskProfileContractConsumerApplication 
 *  @see void#main
 *	@version 1.0
 *	@author Avnish Kumar
 *  @since
 */
@SpringBootApplication
public class RiskProfileContractConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RiskProfileContractConsumerApplication.class, args);
	}

	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
