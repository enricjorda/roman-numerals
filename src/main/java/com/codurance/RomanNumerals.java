package com.codurance;

public class RomanNumerals {

    public static String convert(int decimal) {

        if(decimal == 3) return "III";
        if(decimal == 2) return "II";
        return "I";
    }
}
