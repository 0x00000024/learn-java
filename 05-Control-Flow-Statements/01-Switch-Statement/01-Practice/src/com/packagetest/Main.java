package com.packagetest;

public class Main {

    public static void main(String[] args) {
        printDayofTheWeek(-1);
        printDayofTheWeek(0);
        printDayofTheWeek(1);
        printDayofTheWeek(2);
        printDayofTheWeek(3);
        printDayofTheWeek(4);
        printDayofTheWeek(5);
        printDayofTheWeek(6);
        printDayofTheWeek(7);
    }

    private static void printDayofTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}