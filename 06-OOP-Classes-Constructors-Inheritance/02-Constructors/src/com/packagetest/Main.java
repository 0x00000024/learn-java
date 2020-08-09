package com.packagetest;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Account bobsAccount = new Account();

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 20000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}