package abstraction;

public abstract class Animal {

/*
  - whenever you doesn't want to define any method -> Declare it Abstract.
  - to declare any method Abstract, first class should be abstract -> now class is Abstract Class
  - Abstract class can contain both Abstract method as well as non Abstract method
  - child class which will inherite Abstract class : Class 'Dog' must either be declared abstract or override abstract methods in 'Animal'
  - object of Abstract class is not allowed.
  - but we can use Abstract class for reference , Animal dog1 = new Dog();  // aisa hi krte hai for building applications WHY??
  - Clients focus on what an object does, not how it does it // client can access only override methods
  - also Animal is very genric term, how it will 'say Hello' : so we define abstract method in abstract class(Animal), and their implementation in child class(Dog)
  - *** Abstract classes should not hv public constructors. Constructors of abstract classes can only be called in constructors of their subclasses(making object is not possible). so there is no point in making them public. the protected modifier should be enough

  - In abstract class:
     - we can use static variable : Shared across all subclasses, Accessed using class name
     - we can use Static methods : Cannot be abstract, Cannot be overridden, only hidden , Called using class name
     - we can use Static blocks : Executes once when class is loaded

     - Static abstract methods is NOT allowed bcoz: abstract requires overriding -> static methods cannot be overridden
 */

    protected Animal(){

    }


    protected abstract void sayHello();  //Abstract Method
    // abstract method ko private kr nhi skte kyoki firr override kaise hoga
    // *** default(package private) kiya tho child mei override nhi hoga
    // *** protected : it will be fine so that we can override in child class
    // public krne ka mtlb nhi bnta, kyoki object tho create hi nhi hota abstract method ka

    // *** hence, Abstract class mei hmm Constructor and abstract methods ko protected krte hn


    public void sleep(){    // Normal Method (concrete method)
        System.out.println("zzz...");
    }

    public static void main(String[] args) {

    }
}
