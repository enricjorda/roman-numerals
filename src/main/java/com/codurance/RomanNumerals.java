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

        romanGenerator(decimal, 1, "I");

        return roman;
    }

    private static void romanGenerator(int decimal, int valor, String character) {
        while(decimal >= valor) {
            decimal -= valor;
            roman += character;
        }
    }

}
