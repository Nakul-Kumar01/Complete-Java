import School.Student;

public class test {
    public static void main(String[] args) {  // we hv used static here, bcoz JVM will direclty call this without creating object of test class by test.main()
        /*
        - Static keyword:
            - used with variables, methods, blocks and nested classes and Not with Classes
            - belongs to class rather than instances of the class
            - memory is initialised only once
            - static element cannot call non-static element, but non-static element can use static elements
            - can we use static elements with objects also or only with class name ??? // we can use both method


            - *** when we use Static with any element then we cannot override that element, this is the only reason we cannot use abstract keyword with static keyword
              , bcoz abstract method needs to be override in child class or child class need to be abstract as well.

            - why static method cannot be overriden???

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
