package com.platzi.javatests.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzShould {
    @Test
    public void returnFizzWhenTheNumberIsDivisibleBy3() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertThat(fizzbuzz.fizzBuzz(3), is("Fizz"));
        assertThat(fizzbuzz.fizzBuzz(6), is("Fizz"));
    }

    @Test
    public void returnBuzzWhenTheNumberIsDivisibleBy5() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertThat(fizzbuzz.fizzBuzz(5), is("Buzz"));
        assertThat(fizzbuzz.fizzBuzz(10), is("Buzz"));
    }

    @Test
    public void returnFizzBuzzWhenTheNumberIsDivisibleBy3And5() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertThat(fizzbuzz.fizzBuzz(15), is("FizzBuzz"));
        assertThat(fizzbuzz.fizzBuzz(30), is("FizzBuzz"));
    }

    @Test
    public void returnTheNumberWhenTheNumberIsNotDivisibleBy3And5() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertThat(fizzbuzz.fizzBuzz(2), is("2"));
        assertThat(fizzbuzz.fizzBuzz(16), is("16"));
    }
}