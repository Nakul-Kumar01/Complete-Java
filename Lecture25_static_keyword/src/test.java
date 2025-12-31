import School.Student;

public class test {
    public static void main(String[] args) {  // we hv used static here, bcoz JVM will direclty call this without creating object of test class by test.main()
        /*
        - Static keyword:
            - used with variables, methods, blocks and nested classes and Not with Classes
            - belongs to class rather than instances of the class
            - memory is initialised only once, before any instance is created static variables get initialised
            - *** static element cannot call or use non-static element, but non-static element can use static elements
            - can we use static elements with objects also or only with class name ??? // we can use both method
            - this and super cannot be used in static context

            - *** when we use Static with any element then we cannot override that element, this is the only reason we cannot use abstract keyword with static keyword
              ,bcoz abstract method needs to be override in child class or child class need to be abstract as well.

            - useCase: we define frequently used methods in utils class as static i.e min/max . so that we can use them directly by utils.min(a,b)
            - Static Block: executes when class gets load in memory
               - need?? to initialise static variables. Hm vaise tho initialise krhi skte hn, but agr kuch logic ya if/else use krne ho tho we use static block



            - why static method cannot be overriden???
                - Static methods cannot be overridden because overriding depends on objects and runtime polymorphism,
                  while static methods belong to the class and are resolved at compile time.

            - can we initialise static variable in constructor in java??
                - Yes, it is possible, but it is NOT recommended.
                - Every time an object is created, constructor runs and Static variable will be reinitialized again and again
                - Best Ways to Initialize Static Variables: 1) Direct initialization  2) Static block (BEST)
                - You cannot use constructor to initialize 'final static constants' , bcoz -> "Bhai ye ek hi barr create hoga oor Constant hoga" // in Lecture26
                - when we use single keyword static or final anyOne then we can use Constructor for initialisation
         */

        Student st = new Student();
        st.setAge(12); // we are accessing non-static with the help of instance of class

        Student st2 = new Student();
        System.out.println(Student.count);  // static elements belong to class, therefore we are accessing through class name // all objects are sharing this static variable
        System.out.println(Student.class); // gives class name metadata
        Student.getCount();
        st.getCount(); // also allowed


//        sum(1,2); // Non-static method 'sum(int, int)' cannot be referenced from a static context
    }

    public int sum(int a, int b){
        return a+b;
    }
}
