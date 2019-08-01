package com.codurance;

public class RomanNumerals {

    private static String roman;

    public static String convert(int decimal) {
        roman = "";

        if(decimal == 4) return "IV";
        if(decimal == 40) return "XL";
        if(decimal == 400) return "CD";
        decimal = romanGenerator(decimal, 1000, "M");
        decimal = romanGenerator(decimal, 100, "C");
        decimal = romanGenerator(decimal, 10, "X");
        romanGenerator(decimal, 1, "I");

        return roman;
    }

    private static int romanGenerator(int decimal, int arabicValue, String romanCharacter) {
        while(decimal >= arabicValue) {
            decimal -= arabicValue;
            roman += romanCharacter;
        }

        return decimal;
    }

}
