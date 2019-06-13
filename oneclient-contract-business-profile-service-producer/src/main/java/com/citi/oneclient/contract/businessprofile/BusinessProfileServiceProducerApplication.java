package com.citi.oneclient.contract.businessprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.citi.oneclient.contract.businessprofile.controller.BusinessProfileServiceProducerController;

/**
 * The {@code BusinessProfileServiceProducerApplication} is application entry point
 *	@see BusinessProfileServiceProducerApplication 
 *	@see void#main
 *	@version 1.0
 *	@author Avnish Kumar
 *  @since
 */
@SpringBootApplication
public class BusinessProfileServiceProducerApplication {

	/**
     * @param  args
     *    A String array
     */
	public static void main(String[] args) {
		SpringApplication.run(BusinessProfileServiceProducerApplication.class, args);
	}

}
