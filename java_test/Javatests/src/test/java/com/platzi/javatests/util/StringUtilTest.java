package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    // no se suele usar el metodo main, se pone el nombre de la clase que estamos probando
    // y hacemos una notación @Test para indicar que es un método de testing
    @Test
    public void TestRepeatMultiple() {
        // JUnit: verifica que el resultado se igual a un valor especifico
        Assert.assertEquals("HolaHolaHola", StringUtil.repeat("Hola", 3));
    }

    // lo normal es que cada validación este en una función propia
    @Test
    public void TestRepeatOnce() {
        // JUnit: verifica que el resultado se igual a un valor especifico
        Assert.assertEquals("Hola", StringUtil.repeat("Hola", 1));
    }

    @Test
    public void TestRepeatZero() {
        // JUnit: verifica que el resultado se igual a un valor especifico
        Assert.assertEquals("", StringUtil.repeat("Hola", 0));
    }

    // en este caso no sabemos que resultado estamos esperando por lo que indicamos que
    // tipo de error puede ocurrir
    @Test(expected = IllegalArgumentException.class)
    public void TestRepeatNegative() {
        StringUtil.repeat("Hola", -1);
    }

    // función isEmptyTest
    @Test
    public void TestIsNotEmpty(){
        Assert.assertFalse(StringUtil.isEmpty("hola mundo"));
    }@Test
    public void TestIsEmptyLengthZero(){
        Assert.assertTrue(StringUtil.isEmpty(""));
    }@Test
    public void TestIsEmptyNull(){
        Assert.assertTrue(StringUtil.isEmpty(null));
    }@Test
    public void TestIsEmptySpaces(){
        Assert.assertTrue(StringUtil.isEmpty("    "));
    }
}