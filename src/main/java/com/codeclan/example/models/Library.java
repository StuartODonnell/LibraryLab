package com.codeclan.example.models;

import java.util.List;

public class Library {

    private int id;
    private String name;
    private List<Book> books;

    public Library() {
    }

    public Library(String name) {
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

    public void addBooks(Book book){
        this.books.add(book);
    }

    public void removeBooks(Book book){
        this.books.remove(book);
    }

}
