package com.packagetest;

public class Main {

    public static void main(String[] args) {

        double tmp1 = 20.00d;
        double tmp2 = 80.00d;
        double tmp3 = (tmp1 + tmp2) * 100.00d;
        double tmp4 = tmp3 % 40.00d;

        boolean tmp5 = (tmp4 == 0) ? true : false;

        System.out.println(tmp5);
        if (!tmp5) {
            System.out.println("Got some remainder");
        }

    }
}