
public class Student {

    String name;
    int rollNumber;
    private int age;


     // if we overload the constructor, then default constructor will not form automatically
    public Student(){   // we have overloaded the Default constructor
        this.age = 0;
    }

    public Student(String name, int rollNumber, int age){   // we have overloaded the Default constructor
        this.age = age;
        this.name = name;
        this.rollNumber = rollNumber;
    }


    public void setAge(int age){
        if(age<0) System.out.println("Invalid age");
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == "") System.out.println("Invalid name");
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        if(rollNumber <= 0) System.out.println("Invalid RollNumber");
        this.rollNumber = rollNumber;
    }
}