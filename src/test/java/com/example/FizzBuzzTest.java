package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, Fizz",
            "5, Buzz",
            "15, FizzBuzz",
            "30, FizzBuzz"
    })
    public void testExamples(int number, String expected) {
        assertEquals(expected, fizzBuzz.convert(number));
    }

    // ---- Checking all numbers up to 100 (generated with AI, then reviewed) ----

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57,
            63, 66, 69, 72, 78, 81, 84, 87, 93, 96, 99})
    public void testMultiplesOf3OnlyReturnFizz(int number) {
        assertEquals("Fizz", fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100})
    public void testMultiplesOf5OnlyReturnBuzz(int number) {
        assertEquals("Buzz", fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 75, 90})
    public void testMultiplesOf3And5ReturnFizzBuzz(int number) {
        assertEquals("FizzBuzz", fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7, 8, 11, 13, 14, 16, 17, 19, 22, 23, 26, 28, 29, 31, 32,
            34, 37, 38, 41, 43, 44, 46, 47, 49, 52, 53, 56, 58, 59, 61, 62, 64, 67, 68, 71,
            73, 74, 76, 77, 79, 82, 83, 86, 88, 89, 91, 92, 94, 97, 98})
    public void testOtherNumbersReturnThemselves(int number) {
        assertEquals(String.valueOf(number), fizzBuzz.convert(number));
    }
}
