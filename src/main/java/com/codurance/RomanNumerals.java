package com.codurance;

public class RomanNumerals {

    public static String convert(int decimal) {
        String roman = "";

        if (decimal == 3000) return "MMM";
        if (decimal == 2000) return "MM";
        if (decimal == 1000) return "M";

        while(decimal >= 100) {
            decimal -= 100;
            roman += "C";
        }

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
