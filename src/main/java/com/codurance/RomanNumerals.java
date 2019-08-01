package com.codurance;

public class RomanNumerals {

    public static String convert(int decimal) {
        String roman = "";
        for(int i = 0; i < decimal; i++){
            roman += "I";
        }
        return roman;
    }
}
