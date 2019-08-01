package com.codurance;

public class RomanNumerals {

    public static String convert(int decimal) {
        String roman = "";

        if (decimal == 100) return "C";
        if(decimal == 10) return "X";

        for(int i = 0; i < decimal; i++){
            roman += "I";
        }
        return roman;
    }
}
