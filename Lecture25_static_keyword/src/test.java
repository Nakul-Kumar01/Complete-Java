import School.Student;

public class test {
    public static void main(String[] args) {
        /*
        - Static keyword:
            - used with variables, methods, blocks and nested classes
            - belongs to class rather than instances of the class
         */

        Student st = new Student();
        st.age = 12; // we are accessing non-static with the help of instance of class
    }
}
