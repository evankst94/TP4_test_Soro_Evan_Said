package com.example;

public class RomanNumerals {

    private static final int[] VALUES = {10, 9, 5, 4, 1};
    private static final String[] SYMBOLS = {"X", "IX", "V", "IV", "I"};

    public String toRoman(int number) {
        StringBuilder roman = new StringBuilder();
        int remaining = number;
        for (int i = 0; i < VALUES.length; i++) {
            while (remaining >= VALUES[i]) {
                roman.append(SYMBOLS[i]);
                remaining -= VALUES[i];
            }
        }
        return roman.toString();
    }
}
