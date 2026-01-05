import Animal.Dog;

public class test {
    public static void main(String[] args) {
        /*
        ### Interfaces ###
        - class : bluePrint for object
        - Interface : bluePrint form class

        - in abstract class contains what ?? -> kya kya krna chaiye unn classes ko jo extend kregi iss class ko, ye hota hai abstract class mei
        - but in abstract class also contains regular(concrete) methods also which are not allowed in Interfaces

        - In Interfaces we hv abstaract methods and static constants
        - Interfaces have two useCases: multiple Inheritance and to achieve pure abstraction
        - in Interfaces 'public abstract' is already mentioned
        - object of interfaces are not allowed
        - class which implements the interface should override the methods of Interface or declare that class Abstract

         */

        Dog dog = new Dog();
        dog.eat();
        System.out.println(Dog.MAX_AGE);
    }
}
