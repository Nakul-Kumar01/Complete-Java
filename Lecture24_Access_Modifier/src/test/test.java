package test;

import school.Student;
import school.Student02_ques;
import zoo.Dog;

public class test {
    public static void main(String[] args) {
        /*
        - public : now that member can be accessible from antwhere
        - private: now that member is accessible in its class only
        - default: only accessible in given package


        - *** if we make private constructor, then we cannot make object of that class , only static method can be called using class
        - hmm nhi chate ki koi iss class ka object banaye and only use static methods of this class then declare private Constructor or thode bhot orr useCase hote hn


        - *** class can only hv public as well as default access modifier

        //   🔒 default (package-private)
        //        Accessible only within the same package (by inheritance and by object reference BOTH)
        //        ❌ Not accessible outside the package (even by subclasses)
        //
        //   🛡️ protected
        //        Accessible within the same package (like default : by inheritance and by object reference BOTH)
        //        ✅ Accessible in subclasses outside the package, But only through inheritance, not with object reference


        - protected in C++:
        ✅ Can be accessed inside the class
        ✅ Can be accessed inside derived (child) classes
        ❌ Cannot be accessed using an object reference, even inside a derived class


        - important points:
         - static method cannot be override, therefore we cannot use static abstract method
         - class can only have public as well as default access modifier
         - if constructor of a class is private then we were not able to make object of that class from outside of that class // sirf class ke andrr se hi bana skte hn
         */


        Student student= new Student();
        student.age = 12;
        student.name = "rahul";
//        student.cgpa = 8;  // since cgpa method is accessible only in the same package in which it is created


        // only one object is allowed
        // Student02 st1 = new Student02();   // not allowed due to private constructor
        Student02_ques st2 = Student02_ques.getInstance();  // always return same constructor


        Dog dog = new Dog("Bob","africa");
        dog.makeSound();
//        dog.changeSound("woof");  // changeSound has protected access in 'zoo.Dog'
//        System.out.println(dog.region); // default access


    }
}
