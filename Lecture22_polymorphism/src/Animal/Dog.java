package Animal;

public class Dog extends Animal{

    @Override
    public void sayHello(){  // Dog has Override this method
        System.out.println("woof");
    }



    public void sayBye(){
        System.out.println("woof woof");
    }
}
