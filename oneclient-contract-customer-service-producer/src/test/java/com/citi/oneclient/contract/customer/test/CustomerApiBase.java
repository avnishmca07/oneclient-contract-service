package com.citi.oneclient.contract.customer.test;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;

import com.citi.oneclient.contract.customer.controller.CustomerController;
import com.citi.oneclient.contract.customer.domain.Customer;
import com.citi.oneclient.contract.customer.repository.CustomerRepository;
import com.citi.oneclient.contract.customer.service.CustomerService;
import com.citi.oneclient.contract.customer.service.CustomerServiceImpl;

import java.util.Optional;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

/**
 * The {@code CustomerApiBase} is Base Test class 
 *	@see CustomerApiBase 
 *	@version 1.0
 *	@author Avnish Kumar
 *  @since
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class CustomerApiBase {

    @Autowired
    CustomerController customerController;

    @MockBean
    private CustomerRepository repository;

    @Before
    public void setup() {
        Customer book= new Customer("123", "Ferok Book", "Fero Hero");
        when(repository.findById(any(String.class))).thenReturn(Optional.of(book));
        when(repository.save(any(Customer.class))).thenReturn(book);

        StandaloneMockMvcBuilder standaloneMockMvcBuilder = MockMvcBuilders.standaloneSetup(customerController);
        RestAssuredMockMvc.standaloneSetup(standaloneMockMvcBuilder);
    }

}
