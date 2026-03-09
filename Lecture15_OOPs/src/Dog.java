public class Dog extends Animal {

    public void makeSound(){
        System.out.println("woof!");
    }
}


/*
- Can we have multiple public classes in a single file?  No , Also, the file name must match the public class name.
- Can we have multiple public methods in a class?  Yes
- Can we have multiple classes in one file? Yes, but only one can be public.
- Can we have multiple public classes in a package?  Yes , A package can contain many public classes, but each must be in its own file.
- Can we have multiple main() methods in one class? Yes, Java allows multiple main methods if their parameters are different (method overloading).
- Can we have main() method in multiple classes?  Yes, But when running you must specify the class.
- Does main() method have to be public? Yes, JVM must access it from outside the class.
 */