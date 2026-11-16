package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, Fizz",
            "5, Buzz"
    })
    public void testExamples(int number, String expected) {
        assertEquals(expected, fizzBuzz.convert(number));
    }
}
