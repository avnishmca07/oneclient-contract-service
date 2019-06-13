package com.citi.oneclient.contract.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.citi.oneclient.contract.customer.CustomerContractProducerApplication;
import com.citi.oneclient.contract.customer.domain.Customer;
import com.citi.oneclient.contract.customer.service.CustomerService;

import java.util.List;
import java.util.Optional;

/**
 * The {@code CustomerController} is Rest Controller
 *	@see CustomerController 
 *	@see void#main
 *	@version 1.0
 *	@author Avnish Kumar
 *  @since
 */
@RestController
@RequestMapping("/api/books")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    
    /**
     * @param  book
     *    A Request Customer type Param
     */
    @RequestMapping(
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createBook(@RequestBody Customer book) {
         return customerService.createNew(book);
    }

    
    /**
     * @param  isbn
     *        A String type Param
     * @param  book
     *    A Customer type Param
     */
    @RequestMapping(value = "/{isbn}",
            method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Customer updateBook(@PathVariable String isbn, @RequestBody Customer book) {

        return customerService.update(isbn,book);
    }

    /**
     * @param  isbn
     *        A String type Param
     * 
     */
    @RequestMapping(value = "/{isbn}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Optional<Customer> getByIsbn(@PathVariable String isbn) {
        return customerService.findByIsbn(isbn);
    }

    /**
     * @param  author
     *        A String type Param with required = true
     */
    @RequestMapping(
            params = {"author"},
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Customer> getByAuthor(@RequestParam(value = "author",required = true) String author){
        return customerService.findByAuthor(author);
    }

    /**
     * @param  title
     *       A String type Param with required = true
     * 
     */
    @RequestMapping(
            params = {"title"},
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Customer> getByTitle(@RequestParam(value = "title",required = true) String title){
        return customerService.findByTitleLike(title);
    }


    /**
     * getAll() to get 
     * all customers
     * 
     */
    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Customer> getAll() {
        return customerService.findAll();
    }
}
