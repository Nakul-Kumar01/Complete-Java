package test2;

//import test1.Cat; // gives error bcoz 'Cat' is already defined in this component

public class Cat {
    public static void main(String[] args) {
        System.out.println("hii");

        Cat cat = new Cat();
        test1.Cat cat2 = new test1.Cat();

        String str = "Nakkul"; // this 'String' class gets automatically imported // java.lang package is automatically imported

    }
}
