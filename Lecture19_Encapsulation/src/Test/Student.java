package Test;

public class Student {
    // Encapsulation: Grouping of Data and behaviors  +  Restrict direct external access to sensitive fields to prevent invalid or unsafe operations.

     String name;
     int rollNumber;
     private int age;  // Restricting its access

     public void setAge(int age){
         if(age<0) System.out.println("Invalid age");;  // now, we are able to add conditions
         this.age = age;   // this -> points to current object
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
