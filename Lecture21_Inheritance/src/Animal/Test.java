package Animal;

public class Test {

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.age = 19; // Dog is inheriting the properties of Animal
        System.out.println(dog.age);

        dog.setAge(2);
        System.out.println(dog.age);
        dog.sayHello(); // method of Dog will be called, since Dog has override this method
/*
   types of Inheritance:
   1) single
   2) Multiple
   3) heraical
   4)
   */
    }
}
