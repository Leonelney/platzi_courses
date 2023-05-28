package com.platzi.javatests.romanNumerals;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RomanNumeralShould {
    @Test
    public void whenIsLessThan4000() {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThat(romanNumeral.arabicToRoman(1), is("I"));
        assertThat(romanNumeral.arabicToRoman(2), is("II"));
        assertThat(romanNumeral.arabicToRoman(3), is("III"));
        assertThat(romanNumeral.arabicToRoman(4), is("IV"));
        assertThat(romanNumeral.arabicToRoman(5), is("V"));
        assertThat(romanNumeral.arabicToRoman(7), is("VII"));
        assertThat(romanNumeral.arabicToRoman(8), is("VIII"));
        assertThat(romanNumeral.arabicToRoman(9), is("IX"));
        assertThat(romanNumeral.arabicToRoman(10), is("X"));
        assertThat(romanNumeral.arabicToRoman(11), is("XI"));
        assertThat(romanNumeral.arabicToRoman(14), is("XIV"));
        assertThat(romanNumeral.arabicToRoman(15), is("XV"));
        assertThat(romanNumeral.arabicToRoman(16), is("XVI"));
        assertThat(romanNumeral.arabicToRoman(19), is("XIX"));
        assertThat(romanNumeral.arabicToRoman(24), is("XXIV"));
        assertThat(romanNumeral.arabicToRoman(40), is("XL"));
        assertThat(romanNumeral.arabicToRoman(49), is("XLIX"));
        assertThat(romanNumeral.arabicToRoman(50), is("L"));
        assertThat(romanNumeral.arabicToRoman(51), is("LI"));
        assertThat(romanNumeral.arabicToRoman(55), is("LV"));
        assertThat(romanNumeral.arabicToRoman(56), is("LVI"));
        assertThat(romanNumeral.arabicToRoman(60), is("LX"));
        assertThat(romanNumeral.arabicToRoman(70), is("LXX"));
        assertThat(romanNumeral.arabicToRoman(80), is("LXXX"));
        assertThat(romanNumeral.arabicToRoman(81), is("LXXXI"));
        assertThat(romanNumeral.arabicToRoman(85), is("LXXXV"));
        assertThat(romanNumeral.arabicToRoman(86), is("LXXXVI"));
        assertThat(romanNumeral.arabicToRoman(90), is("XC"));
        assertThat(romanNumeral.arabicToRoman(99), is("XCIX"));
        assertThat(romanNumeral.arabicToRoman(126), is("CXXVI"));
        assertThat(romanNumeral.arabicToRoman(400), is("CD"));
        assertThat(romanNumeral.arabicToRoman(900), is("CM"));
        assertThat(romanNumeral.arabicToRoman(2507), is("MMDVII"));
    }

    @Test
    public void whenIsGratherThan4000() {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThat(romanNumeral.arabicToRoman(4000), is("The number must be less than 4000"));
    }
}