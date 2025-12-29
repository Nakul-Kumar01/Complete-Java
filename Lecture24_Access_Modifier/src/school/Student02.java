package school;

public class Student02 {
    // *** question: if we want that creating only one instance is allowed, not more than one

    private static Student02 st;  // instance of same class // by default value is null

    private Student02(){

    }

    public static Student02 getInstance(){
        if(st == null){   // run only one time , after that 'st' will not be null anymore
            st = new Student02();  // can access private constructor becoz it is within same class
        }
        return st;
    }
}
