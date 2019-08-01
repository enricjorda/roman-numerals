package com.codurance;

public class RomanNumerals {

    private static String roman;

    public static String convert(int decimal) {
         roman = "";

        while(decimal >= 1000) {
            decimal -= 1000;
            roman += "M";
        }

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
