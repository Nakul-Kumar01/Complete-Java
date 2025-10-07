package abstraction;

public class test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sayHello();

        Animal dog1 = new Dog();  // we can take reference of Abstract class and object of child class // this is also possible
        dog1.sayHello();
    }

}
