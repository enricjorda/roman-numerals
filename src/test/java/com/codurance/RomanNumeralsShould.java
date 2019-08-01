package com.codurance;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsShould {

    @Test
    public void convert_1_to_I() {

        Assert.assertEquals("I", RomanNumerals.convert(1));
    }
}
