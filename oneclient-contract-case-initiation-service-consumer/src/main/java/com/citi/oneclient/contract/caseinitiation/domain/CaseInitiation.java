package com.citi.oneclient.contract.caseinitiation.domain;

import com.citi.oneclient.contract.caseinitiation.client.CaseInitiationClient;

/**
 * The {@code CaseInitiation} is a Domain Model
 *	@see CaseInitiation 
 *	@version 1.0
 *	@author Avnish Kumar
 *  @since
 */
public class CaseInitiation {

    private String isbn;
    private String title;
    private String author;


    public CaseInitiation() {
    }

    public CaseInitiation(String isbn, String title, String author) {
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