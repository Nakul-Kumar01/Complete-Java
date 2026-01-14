public class test {
    public static void main(String[] args) {
        /*
        Types of Errors:
         - Syntax Error
         - Logical Error
         - Runtime Error

        - Program will crash during runtime error i.e divide by 0
        - Exception : event that disrupts the normal flow of program. it is an object which is thrown at runtime
        - Exception handling is a way to handle the runtime errors so that normal flow of the application can be maintained

         */

        
    }

    public static void divide(){
        try{
            int a=3,b=0;
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
