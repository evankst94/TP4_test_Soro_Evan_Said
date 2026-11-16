package com.example;

public class PrimeChecker {

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number > 2 && number % 2 == 0) {
            return false;
        }
        return true;
    }
}
