package com.example.cucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.RomanNumerals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RomanNumeralsSteps {

    private RomanNumerals romanNumerals;
    private String result;

    @Given("I have a Roman numeral converter")
    public void i_have_a_roman_numeral_converter() {
        romanNumerals = new RomanNumerals();
    }

    @When("I convert {int} to Roman numerals")
    public void i_convert_to_roman_numerals(Integer number) {
        result = romanNumerals.toRoman(number);
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expected) {
        assertEquals(expected, result,
                "Expected Roman numeral to be " + expected + " but was " + result);
    }
}
