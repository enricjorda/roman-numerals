package com.codurance;

public class RomanNumerals {

    private static String roman;
    private enum Arabic2Roman{
        I(1),
        V(5);

        int arabic;
        Arabic2Roman(int i){
            this.arabic = i;
        }

        public int getArabic() {
            return arabic;
        }
    }

    public static String convert(int decimal) {
        roman = "";

        decimal = romanGenerator(decimal, 1000, "M");
        decimal = romanGenerator(decimal, 400, "CD");
        decimal = romanGenerator(decimal, 100, "C");
        decimal = romanGenerator(decimal, 50, "L");
        decimal = romanGenerator(decimal, 40, "XL");
        decimal = romanGenerator(decimal, 10, "X");
        decimal = romanGenerator(decimal, 5, "V");
        decimal = romanGenerator(decimal, 4, "IV");

        romanGenerator(decimal, Arabic2Roman.V.getArabic(), Arabic2Roman.V.toString());
        romanGenerator(decimal, Arabic2Roman.I.getArabic(), Arabic2Roman.I.toString());
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
