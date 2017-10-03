package com.example.devfesttanzania;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nsubuga on 9/16/2017.
 */
public class CalculatorTest {
    Calculator cal;
    @Before
    public void setUp(){
        cal = new Calculator();
    }
    @Test
    public void add() throws Exception {
        assertEquals(7, cal.add(3,4));
    }

    @Test
    public void subtract() throws Exception {
        assertEquals(13,cal.subrack(20,7));
    }

    @Test
    public void multiply() throws Exception {
        assertEquals(24, cal.multiply(4,6));
    }

    @Test
    public void divide() throws Exception {
        assertEquals(4F, cal.divide(40,10));
    }

}