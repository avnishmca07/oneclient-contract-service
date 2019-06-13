package com.citi.oneclient.contract.caseinitiation.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.citi.oneclient.contract.caseinitiation.CaseInitiationServiceContractConsumerApplication;
import com.citi.oneclient.contract.caseinitiation.domain.CaseInitiation;

/**
 * The {@code CaseInitiationClient} is Interface to 
 * communicate with Customer Service
 *	@see CaseInitiationClient 
 *	@see CaseInitiation#getBook
 *  @see CaseInitiation#createBook
 *	@version 1.0
 *	@author Avnish Kumar
 *  @since
 */
@FeignClient("customerservice")
public interface CaseInitiationClient {

    @RequestMapping(method = RequestMethod.GET, path = "/api/books/{isbn}", consumes = MediaType.APPLICATION_JSON_VALUE)
    CaseInitiation getBook(@PathVariable("isbn") String isbn);

    @RequestMapping(method = RequestMethod.POST, path = "/api/books", consumes = MediaType.APPLICATION_JSON_VALUE)
    CaseInitiation createBook(@RequestBody CaseInitiation book);


}
