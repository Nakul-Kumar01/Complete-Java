package humans;

public class Child extends Parent {

    public Child(int age, String name){
//        super(); // by default present hai, likhne ki jarurt nhi hai // always first statement in constructor(since, parent ka constructor initialise hona chaiye phale)
     super(age,name);
/*
 super -> parent class
 super() -> parent class ke constructor ko call kiya
*/
        System.out.println("Child class Constructor");
    }

    public void childMethod(){
        super.parentMethod(); // we can call parent class methods also // it is not neccessary to write this line on top
        System.out.println("Child method called");
    }

}
