public class Car02 {
    public static void main(String[] args) {
        Car01 car = new Car01();
//        car.color = "Blue";
//        car.speed = 40;
//        car.brand = "Tata";
//        car.year = 2024; // it is private
//        car.model = "Safari";

        car.accelerate(1);
//        System.out.println(car.speed);


/*
    In Opps we deals with classes and objects
      4 pillers of opps:
      1) Encapsulation -> bundle data & methods + data hiding(by getter and setter)
      2) Inheritance: by extends
      3) polymorphism
      4) Abstraction
 */


        Animal dog = new Dog();  // object is of Dog, but refference is of Animal // this is polymorphism
        // you can treat object of subClass as an instance of parent class
        dog.makeSound();
    }
}
