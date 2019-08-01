package com.codurance;

public class RomanNumerals {

    public static String convert(int decimal) {
        String roman = "";
        if (decimal == 1000) return "M";
        if (decimal == 100) return "C";
        if (decimal == 10) return "X";

        if (decimal == 20) return "XX";

        for(int i = 0; i < decimal; i++){
            roman += "I";
        }
        return roman;
    }
}
