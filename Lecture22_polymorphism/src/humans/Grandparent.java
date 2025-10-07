package humans;

public class Grandparent {
   public int age;
   public String name;
    public Grandparent(int age, String name){
        this.age = age;  // this: refers to current instance, which is of child, therefore we hv set the age and name of child not for GrandParent
        this.name = name;
        System.out.println("GrandParent constructor called");
    }

//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }


}
