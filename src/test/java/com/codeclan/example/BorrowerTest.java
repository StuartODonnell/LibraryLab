package com.codeclan.example;

import com.codeclan.example.models.Borrower;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower1;

    @Before
    public void setUp(){
        borrower1 = new Borrower("Connor");
    }

    @Test
    public void getName() {
        assertEquals("Connor", borrower1.getName());
    }
}
