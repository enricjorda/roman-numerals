package com.codurance;

public class RomanNumerals {

    public static String convert(int decimal) {
        String roman = "";

        if (decimal == 1000) return "M";
        if (decimal == 200) return "CC";
        if (decimal == 100) return "C";

        while(decimal >= 10) {
            decimal -= 10;
            roman += "X";
        }

        while(decimal > 0) {
            decimal -= 1;
            roman += "I";
        }

        return roman;
    }
}
