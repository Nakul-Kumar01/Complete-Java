package abstraction;

public abstract class Animal {

/*
  - whenever you doesn't want to define any method -> Declare it Abstract
  - to declare any method Abstract, first class should be abstract -> now class is Abstract Class
  - Abstract class can contain both Abstract method as well as non Abstract method
  - child class which will inherite Abstract class : Class 'Dog' must either be declared abstract or override abstract methods in 'Animal'
  - object of Abstract class is not allowed.
  - but we can use Abstract class for reference , Animal dog1 = new Dog();  // aisa hi krte hai for building applications WHY???
  - Clients focus on what an object does, not how it does it // client can access only override methods
  - also Animal is very genric term, how it will 'say Hello' : so we define abstract method in abstract class(Animal), and their implementation in child class(Dog)
  - Abstract classes should not hv public constructors. Constructors of abstract classes can only be called in constructors of their subclasses(making object is not possible). so there is no point in making them public. the protected modifier should be enough
 */

    public abstract void sayHello();  //Abstract Method

    public void sleep(){    // Normal Method (concrete method)
        System.out.println("zzz...");
    }

    public static void main(String[] args) {

    }
}
