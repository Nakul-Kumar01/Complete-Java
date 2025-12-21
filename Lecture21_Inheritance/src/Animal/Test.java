package Animal;
// process:
// 1) when i run this file, first jvm will come inside this package(animal) starting from root package(which is src)
// 2) now it will search for class Test inside package Animal
// 3) since, jvm is searching from package Animal, therefore we not need to import the classes of this package
// 4) if we are using classes of other package then we need to import these classes using import also those classes should be public


// agrr koi class same package mei hai tho usse import krne ki jarurt nhi hai
import humans.Child; // in differrent package, therefore, import it



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
   2) MultiLevel
   3) Hierarchical

   - Java does not allow multiInheritance bcoz to avoid ambiguity // for this we have interfaces


   super keyword:
   - we can call parent class constructor, parameterised constructor
   - we can also call parent class methods or data members


   new
   - object is created in heap memory
   - it is created at runTime not at compile time // Dynamic memory allocation
   - runtime mtlb: jbb javac krte hn tbb memory nhi milti, java krke run krte hn tbb memory allocate hoti hai


   @Override
   - good practice to write before the method which we are overriding
   - code will work fine without this annotation also
   - but if we use this before our method, then it will give error if the method does not override any parent class method
   - basically it ensures that the method will override any parent class method
*/

        Child child = new Child(16,"rohan");  // first GrandParent constructor is called
        System.out.println(child.getName());
    }
}
