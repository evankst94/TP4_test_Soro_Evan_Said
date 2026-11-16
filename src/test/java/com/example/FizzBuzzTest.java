package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void test1Returns1() {
        assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    public void test2Returns2() {
        assertEquals("2", fizzBuzz.convert(2));
    }

    @Test
    public void test3ReturnsFizz() {
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    public void test5ReturnsBuzz() {
        assertEquals("Buzz", fizzBuzz.convert(5));
    }
}
