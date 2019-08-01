package com.codurance;

public class ArabicToRomanNumeralsConverter {

    private static String romanNumber;

    public static String convertToRoman(int arabicNumber) {
        romanNumber = "";

        for (ArabicToRoman number : ArabicToRoman.values()) {
            arabicNumber = addRomanCharacters(arabicNumber, number.getArabic(), number.toString());
        }
        return romanNumber;
    }

    private static int addRomanCharacters(int currentNumber, int arabicNumber, String romanCharacter) {
        while(currentNumber >= arabicNumber) {
            currentNumber -= arabicNumber;
            romanNumber += romanCharacter;
        }

        return currentNumber;
    }

    private enum ArabicToRoman {
        M(1000),
        CM(900),
        D(500),
        CD(400),
        C(100),
        XC(90),
        L(50),
        XL(40),
        X(10),
        IX(9),
        V(5),
        IV(4),
        I(1);

        int arabic;
        ArabicToRoman(int i){
            this.arabic = i;
        }

        public int getArabic() {
            return arabic;
        }
    }
}


