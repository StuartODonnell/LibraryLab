package com.codeclan.example;

import com.codeclan.example.models.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BookTest {

    Book book;

    @Before
    public void setup(){
        book = new Book("Lord of the Rings: Fellowship of the Ring", "J.R.R. Tolkien");
    }

    @Test
    public void canGetName(){
        assertEquals("Lord of the Rings: Fellowship of the Ring", book.getTitle());
    }

    @Test
    public void canGetTitle(){
        assertEquals("J.R.R. Tolkien", book.getAuthor());
    }
}
