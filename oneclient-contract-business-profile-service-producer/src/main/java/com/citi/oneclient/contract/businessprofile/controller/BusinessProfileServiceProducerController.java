package com.citi.oneclient.contract.businessprofile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The {@code BusinessProfileServiceProducerController} is Rest Controller
 *	@see BusinessProfileServiceProducerController 
 *	@see String#isNumberPrime
 *	@version 1.0
 *	@author Avnish Kumar
 *  @since
 */

@RestController
public class BusinessProfileServiceProducerController {

	/**
     * @param  number
     *    A Request Param
     */
	
	@GetMapping("/validate/prime-number")
    public String isNumberPrime(@RequestParam("number") String number) {
        return Integer.parseInt(number) % 2 == 0 ? "Even" : "Odd";
    }
}
