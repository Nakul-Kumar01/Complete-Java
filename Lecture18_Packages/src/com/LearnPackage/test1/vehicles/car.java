package com.LearnPackage.test1.vehicles;

public class car {

    public static void main(String[] args) {
        // to create instance of nested class, first we have to create instance of parent class
        Cycle cycle = new Cycle();

        Cycle.myCycle mycycle = cycle.new myCycle(); // instance of nested object
    }
}
