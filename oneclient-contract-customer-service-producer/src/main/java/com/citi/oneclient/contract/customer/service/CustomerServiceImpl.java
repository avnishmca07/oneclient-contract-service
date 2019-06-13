package com.citi.oneclient.contract.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citi.oneclient.contract.customer.domain.Customer;
import com.citi.oneclient.contract.customer.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * The {@code CustomerServiceImpl} is Impl of 
 *  CustomerService Interface
 *	@see CustomerServiceImpl 
 *	@version 1.0
 *	@author Avnish Kumar
 *  @since
 */
@Service
public class CustomerServiceImpl implements CustomerService{


    @Autowired
    CustomerRepository bookRepository;


    @Override
    public Customer createNew(Customer book){
        return bookRepository.save(book);
    }

    @Override
    public Customer update(String isbn, Customer book){
        Optional<Customer> retrievedBook = bookRepository.findById(isbn);
        if (retrievedBook.isPresent()) {
            Customer b = retrievedBook.get();
            b.setAuthor(book.getAuthor());
            b.setTitle(book.getTitle());
            return bookRepository.save(b);
        }
        return null;
    }


    @Override
    public  Optional<Customer>  findByIsbn(String isbn){
        return  bookRepository.findById(isbn);

    }

    @Override
    public List<Customer> findByAuthor(String author){
        return bookRepository.findByAuthor(author).stream().collect(Collectors.toList());
    }

    @Override
    public List<Customer> findByTitleLike(String title){
        return bookRepository.findByTitleLike(title).stream().collect(Collectors.toList());
    }

    @Override
    public List<Customer> findAll(){
        return bookRepository.findAll().stream().collect(Collectors.toList());
    }

    @Override
    public void delete(Customer book){
        bookRepository.delete(book);
    }

}

