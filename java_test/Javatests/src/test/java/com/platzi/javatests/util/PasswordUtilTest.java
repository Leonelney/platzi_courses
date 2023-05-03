package com.platzi.javatests.util;

import org.junit.Test;

import static com.platzi.javatests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {
    @Test
    public void WeakWhenHasLessThan8Letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void WeakWhenHasOnlyLetters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }

    @Test
    public void MediumWhenHasLettersAndNumbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcd1234"));
    }

    @Test
    public void StrongWhenHasLettersNumbersAndSymbols() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd123!"));
    }
}