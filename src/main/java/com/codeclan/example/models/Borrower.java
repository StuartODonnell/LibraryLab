package com.codeclan.example.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "borrowers")
public class Borrower {

    private int id;
    private String name;
    private List<Book> books;

    public Borrower() {
    }

    public Borrower(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "borrower")
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        this.books.add(book);

    }

    public void removebook(Book book){
        this.books.remove(book);
    }

}
