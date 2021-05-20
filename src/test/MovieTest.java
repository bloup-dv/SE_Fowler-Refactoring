package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert.*;

import java.Movie;


public class MovieTest {

    private Movie underTest;

    @org.junit.Before
    void setUp() {
        underTest = new Movie("TestTitle", 0);
    }

    @Test
    public void testGetTitle() {
        assertEquals("TestTitle", underTest.getTitle());
    }

    @Test
    public void testGetPriceCode() {
        assertEquals(0, underTest.getPriceCode());
    }
}