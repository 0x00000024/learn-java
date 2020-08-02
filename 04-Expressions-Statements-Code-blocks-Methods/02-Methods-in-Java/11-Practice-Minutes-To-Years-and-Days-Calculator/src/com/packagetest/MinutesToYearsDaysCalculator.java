package com.packagetest;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {

        if (minutes < 0.0d) {
            System.out.println("Invalid Value");
        } else {

            int years = (int) (minutes / 60.0d / 24.0d / 365.0d);
            int days = (int) (minutes / 60.0d / 24.0d % 365.0d);

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
