package humans;

public class Parent extends Grandparent{

    public Parent(int age, String name){
        super(age,name);
        System.out.println("Parent constructor called");
    }

    public void parentMethod(){
        System.out.println("Parent method called");
    }
}
