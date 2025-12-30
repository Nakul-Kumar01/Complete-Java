package school;

public class Student02_ques {
    // *** question: if we want that creating only one instance is allowed, not more than one

    private static Student02_ques st;  // instance of same class // by default value is null

    private Student02_ques(){

    }

    public static Student02_ques getInstance(){
        if(st == null){   // run only one time , after that 'st' will not be null anymore
            st = new Student02_ques();  // can access private constructor becoz it is within same class
        }
        return st;
    }
}
