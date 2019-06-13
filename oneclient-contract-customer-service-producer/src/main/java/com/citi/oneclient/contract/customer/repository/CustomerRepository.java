package com.citi.oneclient.contract.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citi.oneclient.contract.customer.domain.Customer;

import java.util.List;

/**
 * The {@code CustomerRepository} is Repository
 *	@see CustomerRepository 
 *	@version 1.0
 *	@author Avnish Kumar
 *  @since
 */
public interface CustomerRepository extends JpaRepository<Customer,String>{
    List<Customer> findByAuthor(String author);
    List<Customer> findByTitleLike(String title);
}
