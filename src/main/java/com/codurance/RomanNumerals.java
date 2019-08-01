package com.codurance;

public class RomanNumerals {

    private static String roman;
    private enum Arabic2Roman{
        M(1000),
        D(500),
        CD(400),
        C(100),
        L(50),
        XL(40),
        X(10),
        V(5),
        IV(4),
        I(1);

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

        for (Arabic2Roman number : Arabic2Roman.values()) {
            decimal = romanGenerator(decimal, number.getArabic(), number.toString());
        }

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
