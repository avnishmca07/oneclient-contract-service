package com.citi.oneclient.contract.caseinitiation.test;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit4.SpringRunner;

import com.citi.oneclient.contract.caseinitiation.client.CaseInitiationClient;
import com.citi.oneclient.contract.caseinitiation.domain.CaseInitiation;

/**
 * The {@code CaseInitiationClientTest} is a Consumer Contract 
 *  test class for Customer Service Producer  
 *	@see CaseInitiationClientTest 
 *  @see void#getBookByisbnCompliesToContract
 *  @see void#createBookCompliesToContract
 *	@version 1.0
 *	@author Avnish Kumar
 *  @since
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(
        ids = "com.citi.oneclient:oneclient-contract-customer-service-producer:+:stubs:9080",
        stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class CaseInitiationClientTest {

    @Autowired
    private CaseInitiationClient caseInitiationClient;

    /**
     * getBookByisbnCompliesToContract to 
     * validate contract for get case Initiation
     *  with id 123
     */
    @Test
    public void getBookByisbnCompliesToContract() {
        CaseInitiation book = caseInitiationClient.getBook("123");
        Assertions.assertThat(book.getIsbn()).isEqualToIgnoringCase("123");
    }

    /**
     * createBookCompliesToContract to 
     * validate contract for create case Initiation
     *  with id 123
     */
    @Test
    public void createBookCompliesToContract() {
        CaseInitiation caseInitiation= new CaseInitiation("123", "Ferok Book", "Fero Hero");
        CaseInitiation createdCase = caseInitiationClient.createBook(caseInitiation);
        Assertions.assertThat(createdCase.getIsbn()).isEqualToIgnoringCase("123");
    }
}
