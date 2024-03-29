package com.citi.oneclient.contract.riskprofile.test;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.citi.oneclient.contract.riskprofile.controller.RiskProfileConsumerController;

/**
 * The {@code RiskProfileControllerIntegrationTest} is Consumer Contract
 * Test class to test contract of business profile Service as a producer
 *	@see RiskProfileControllerIntegrationTest 
 *  @see void#given_WhenPassEvenNumberInQueryParam_ThenReturnEven
 *	@version 1.0
 *	@author Avnish Kumar
 *  @since
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
@AutoConfigureStubRunner(
  stubsMode = StubRunnerProperties.StubsMode.LOCAL,
  ids = "com.citi.oneclient:oneclient-contract-business-profile-service-producer:+:stubs:8090")
public class RiskProfileControllerIntegrationTest {
	
	 @Autowired
	    private MockMvc mockMvc;
	 
	    @Test
	    public void given_WhenPassEvenNumberInQueryParam_ThenReturnEven()
	      throws Exception {
	  
	        mockMvc.perform(MockMvcRequestBuilders.get("/calculate?number=2")
	          .contentType(MediaType.APPLICATION_JSON))
	          .andExpect(status().isOk())
	          .andExpect(content().string("Even"));
	    }

}
