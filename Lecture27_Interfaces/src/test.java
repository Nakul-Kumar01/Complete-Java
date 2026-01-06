import Animal.Animal;
import Animal.Dog;
import Animal.Cat;
import Phone.SmartPhone;


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


        - after java 8 : interfaces can have static methods and default method also
        - static method useCase : use to tell about interface
        - default method : cannot be call through interface, can be call through instance of class which will implement the interface
        - default method useCase : if you want to add something in interface without adding something // hrr child class mei implement nhi krna padega
        - we can also use 'this' keyword in default method, since instance se call hua hai

        // Conclusion:
        - Hence, interface contains : static constants + abstract methods + static methods + default methods
        - it is used for pure abstraction and to achive multiple inheritance


        - can we delare main method in inteface ???  yes , it will work fine, since JVM ko bss main method chaiye


        - difference between Interface and Abstract class :
        - abstract class contains instance variable, to initialise these variable we hv constructor also  // but not in interfaces
        - one class extends only one abstract class // but one class can implement multiple interfaces

        // Conclusion:
        - Abstract Class
          - Can have abstract + non-abstract (concrete) methods
          - Can have instance variables
          - Can have constructors
          - A class can extend only one abstract class (single inheritance)
          - Methods can have any access modifier (private, protected, default, public)

        - Interface
          - All methods are public & abstract by default
          - Variables are public static final (constants only)
          - No constructors
          - Supports multiple inheritance
          - Used to achieve 100% abstraction and define capability/contract


         */

        Dog dog = new Dog();
        dog.eat();
        System.out.println(Dog.MAX_AGE);
        System.out.println(Animal.MAX_AGE); // accessible through Interface
        Animal.info(); // static method

        Cat cat = new Cat();
        cat.run(); // calling default method // will call eat method of cat through 'this'
        dog.run(); // will call eat method of cat through 'this'


        // multiple inheritance:
        SmartPhone sp = new SmartPhone();
        sp.makeCall("123456");
    }
}
