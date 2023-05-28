package com.platzi.javatests.discounts;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PriceCalculatorShould {
    @Test
    public void totalZeroWhenThereNoArePrices() {
        PriceCalculator calculator = new PriceCalculator();
        assertThat(calculator.getTotal(), is(0.0));
    }

    @Test
    public void totalIsTheSumOfPrices() {
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(10.2);
        calculator.addPrice(15.5);
        assertThat(calculator.getTotal(), is(25.7));
    }

    @Test
    public void applyDiscountToPrices() {
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(12.5);
        calculator.addPrice(17.5);
        calculator.setDiscount(50);
        assertThat(calculator.getTotal(), is(15.0));
    }
}