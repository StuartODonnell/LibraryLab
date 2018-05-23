package com.codeclan.example.models;

import java.util.List;

public class Borrower {

    private int id;
    private String name;
    private List<Book> books;

    public Borrower() {
    }

    public Borrower(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
