package com.packagetest;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("IndependenceDay");
    }

    //TODO
    @Override
    public String plot() {
        return super.plot();
    }
}

public class Main {

    public static void main(String[] args) {
    }
}