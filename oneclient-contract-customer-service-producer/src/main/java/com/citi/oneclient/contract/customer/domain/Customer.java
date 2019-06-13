package com.citi.oneclient.contract.customer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.citi.oneclient.contract.customer.controller.CustomerController;


/**
 * The {@code Customer} is Domain Models
 *	@see Customer 
 *	@version 1.0
 *	@author Avnish Kumar
 *  @since
 */
@Entity
@Table(name = "book")
public class Customer {

    @Id
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;


    public Customer() {
    }

    public Customer(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}