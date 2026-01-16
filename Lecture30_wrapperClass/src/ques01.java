public class ques01 {

    public static void main(String[] args) {
        Student st = new Student();  // 1) 'st' is storing address of object
        st.id = 1;
        fun(st); // 2) sending the refference
        System.out.println(st.id);  // 5) what will this print??
        fun2(st);
        System.out.println(st.id);  // 6) here id get changed
    }

    private static void fun(Student a){  // 3) refference get stored in "new variable"
        Student student = new Student();
        student.id = 2;
        a = student;  // 4) abb ye new variable 'a' is pointing to any new Student
    }

    private static void fun2(Student a){
        a.id = 2;
    }


}

class  Student{
    public  int id ;
}
