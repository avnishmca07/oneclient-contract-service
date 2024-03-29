package com.citi.oneclient.contract.riskprofile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.citi.oneclient.contract.riskprofile.RiskProfileContractConsumerApplication;

/**
 * The {@code RiskProfileConsumerController} is REST Controller
 *	@see RiskProfileConsumerController 
 *  @see String#checkriskControl
 *	@version 1.0
 *	@author Avnish Kumar
 *  @since
 */
@RestController
public class RiskProfileConsumerController {

	 @Autowired
	    private RestTemplate restTemplate;
	 
	    @GetMapping("/calculate")
	    public String checkriskControl(@RequestParam("number") Integer number) {
	        HttpHeaders httpHeaders = new HttpHeaders();
	        httpHeaders.add("Content-Type", "application/json");
	 
	        ResponseEntity<String> responseEntity = restTemplate.exchange(
	          "http://localhost:8090/validate/prime-number?number=" + number,
	          HttpMethod.GET,
	          new HttpEntity<>(httpHeaders),
	          String.class);
	 
	        return responseEntity.getBody();
	    }
}
