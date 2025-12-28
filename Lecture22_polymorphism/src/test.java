import Animal.Animal;
import Animal.Dog;
import Animal.Cat;

public class test {
    public static void main(String[] args) {
        // Runtime Polymorphism:-

        Animal myAnimal = new Animal(); // 'new' keyword is necessary in java to create object

        myAnimal.sayHello(); // ...

        // reference of Animal(parent) and object of Dog(child)   // possible hai // called 'UpCasting'
        // rule: with parent reference storing child object, only those methods can be access from child object which are common in both parent and child
        // in c++, this will print ... , to resolve this we hv virtual keyword their
        // but in java it will run method of Dog
        Animal dog = new Dog(); // at runtime, it is decided by jvm that dog has reference of object of Dog // this is runtime polymorphism(method overriding)
        dog.sayHello();
//        dog.sayBye();  // *** not possible, according to the rule ***

        Animal cat = new Cat();
        cat.sayHello();  // hence, same methods but different result


        Dog myDog = (Dog)dog; // since 'dog' stores object of Dog class, therefore we hv downCast the 'dog' into 'myDog' // called 'DownCasting'



    }
}
