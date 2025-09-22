package test2;

//import com.LearnPackage.test1.animals.Cat; // gives error bcoz 'Cat' is already defined in this component

public class Cat {
    public static void main(String[] args) {
        System.out.println("hii");

        Cat cat = new Cat();
        com.LearnPackage.test1.animals.Cat cat2 = new com.LearnPackage.test1.animals.Cat();

        String str = "Nakkul"; // this 'String' class gets automatically imported // java.lang package is automatically imported

    }
}
