package com.codurance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsShould {

    @Test
    public void convert_1_to_I() {

        assertEquals("I", RomanNumerals.convert(1));
    }

    @Test
    public void convert_2_to_II() {

        assertEquals("II", RomanNumerals.convert(2));
    }

    @Test
    public void convert_3_to_III() {

        assertEquals("III", RomanNumerals.convert(3));
    }

    @Test
    public void convert_10_to_X() {

        assertEquals("X", RomanNumerals.convert(10));
    }

    @Test
    public void convert_100_to_C() {

        assertEquals("C", RomanNumerals.convert(100));
    }
}
