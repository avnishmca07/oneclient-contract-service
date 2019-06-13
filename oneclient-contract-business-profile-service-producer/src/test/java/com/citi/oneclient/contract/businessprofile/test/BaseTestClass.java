package com.citi.oneclient.contract.businessprofile.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;

import com.citi.oneclient.contract.businessprofile.controller.BusinessProfileServiceProducerController;

import io.restassured.module.mockmvc.RestAssuredMockMvc;


/**
 * The {@code BaseTestClass} is Base test class
 *	@see BaseTestClass 
 *	@see void#setup
 *	@version 1.0
 *	@author Avnish Kumar
 *  @since
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@DirtiesContext
@AutoConfigureMessageVerifier
public class BaseTestClass {

	@Autowired
    private BusinessProfileServiceProducerController producerController;
 

	/**
     * setup() for setting up mock Builder
     *    
     */
    @Before
    public void setup() {
        StandaloneMockMvcBuilder standaloneMockMvcBuilder 
          = MockMvcBuilders.standaloneSetup(producerController);
        RestAssuredMockMvc.standaloneSetup(standaloneMockMvcBuilder);
    }
}
