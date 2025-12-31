import Vehicles.Car;

import java.util.Calendar;

public class test {
    public static void main(String[] args) {
        /*
    - Final Keyword:
       - used with variables, methods, class but having different meaning
       -*** when used 'static final' cannot use constructor for initialisation // we use static Block for that
       -*** when we use satic and final keyword seperately then final field is either initialised directly or by Constructor // and for satic field we use 1) Direct initialization  2) Static block (BEST) 3) constructor (not recommended, bcoz initialised again and again)
       - using with:
         - variable - does not change value of variable // constant krr diya
         - method - we cannot Override this Method
         - class - now this class is not extendable // koi dusri class extend nhi krr skti


       -** Can we use final with Constructor ??  not allowed, bcoz final is used to prevent inheritance, but constructor tho inherite hote hi nhi hai
     */

        Car c = new Car();
        Car c2 = new Car(); // we hv initialised final field in constructor
        System.out.println(Car.a);
    }
}
