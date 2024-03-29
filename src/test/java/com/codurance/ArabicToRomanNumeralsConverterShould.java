package com.codurance;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArabicToRomanNumeralsConverterShould {

    @ParameterizedTest
    @CsvSource(
            {
                "1,I",
                "10,X",
                "100,C",
                "1000,M",
                "2,II",
                "20,XX",
                "200,CC",
                "2000,MM",
                "3,III",
                "30,XXX",
                "300,CCC",
                "3000,MMM",
                "4,IV",
                "40,XL",
                "400,CD",
                "5,V",
                "50,L",
                "500,D",
                "6,VI",
                "60,LX",
                "600,DC",
                "7,VII",
                "70,LXX",
                "700,DCC",
                "8,VIII",
                "80,LXXX",
                "800,DCCC",
                "9,IX",
                "90,XC",
                "900,CM",
                "1990,MCMXC",
                "2008,MMVIII",
                "99,XCIX",
                "47,XLVII",
                "3888,MMMDCCCLXXXVIII"
            })
    public void convert_arabic_to_roman(int arabic, String roman) {
        assertEquals(roman, ArabicToRomanNumeralsConverter.convertToRoman(arabic));
    }
}
