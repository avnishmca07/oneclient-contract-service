package com.citi.oneclient.contract.customer.service;

import java.util.List;
import java.util.Optional;

import com.citi.oneclient.contract.customer.domain.Customer;
import com.citi.oneclient.contract.customer.repository.CustomerRepository;

/**
 * The {@code CustomerService} is customer Interface
 *	@see CustomerService 
 *	@version 1.0
 *	@author Avnish Kumar
 *  @since
 */
public interface CustomerService {

    Customer createNew(Customer bookDTO);

    Customer update(String isbn, Customer book);

    Optional<Customer> findByIsbn(String isbn);

    List<Customer> findByAuthor(String author);

    List<Customer> findByTitleLike(String title);

    List<Customer> findAll();

    void delete(Customer book);
}