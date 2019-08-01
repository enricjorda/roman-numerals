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

    @Test
    public void convert_1000_to_M() {

        assertEquals("M", RomanNumerals.convert(1000));
    }

    @Test
    public void convert_20_to_XX() {

        assertEquals("XX", RomanNumerals.convert(20));
    }

    @Test
    public void convert_30_to_XXX() {

        assertEquals("XXX", RomanNumerals.convert(30));
    }

    @Test
    public void convert_200_to_CC() {

        assertEquals("CC", RomanNumerals.convert(200));
    }

    @Test
    public void convert_300_to_CCC() {

        assertEquals("CCC", RomanNumerals.convert(300));
    }

    @Test
    public void convert_3000_to_MMM() {

        assertEquals("MMM", RomanNumerals.convert(3000));
    }

    @Test
    public void convert_4_to_IV() {
        assertEquals("IV", RomanNumerals.convert(4));
    }

    @Test
    public void convert_40_to_XL() {
        assertEquals("XL", RomanNumerals.convert(40));
    }

    @Test
    public void convert_400_to_CD() {
        assertEquals("CD", RomanNumerals.convert(400));
    }

    @Test
    public void convert_5_to_V() {
        assertEquals("V", RomanNumerals.convert(5));
    }

    @Test
    public void convert_50_to_L() {
        assertEquals("L", RomanNumerals.convert(50));
    }
}
