package com.packagetest;

public class TeenNumberChecker {
    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        if (thirdNumber >= firstNumber && thirdNumber <= secondNumber) {
            return true;
        } else {
            return false;
        }
    }
}
