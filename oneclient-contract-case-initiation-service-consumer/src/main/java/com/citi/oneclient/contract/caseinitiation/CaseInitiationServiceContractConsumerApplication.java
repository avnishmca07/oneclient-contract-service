package com.citi.oneclient.contract.caseinitiation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.citi.oneclient.contract.businessprofile.test.BaseTestClass;

/**
 * The {@code CaseInitiationServiceContractConsumerApplication} is app entry point
 *	@see CaseInitiationServiceContractConsumerApplication 
 *	@see void#main
 *	@version 1.0
 *	@author Avnish Kumar
 *  @since
 */

@SpringBootApplication
@EnableFeignClients
public class CaseInitiationServiceContractConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaseInitiationServiceContractConsumerApplication.class, args);
	}
}
