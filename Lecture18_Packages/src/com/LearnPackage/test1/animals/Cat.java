package com.LearnPackage.test1.animals;  //Due to this -> when jvm execute this file, first it will find test1 package, then it will execute this component
// classPath should be outter to the package path i.e. for test1 package, classPath should be 'src' // since, jvm starts finding 'test1 package' from src folder


public class Cat {
    public static void main(String[] args) {
        System.out.println("animal is cat");

    }
}
