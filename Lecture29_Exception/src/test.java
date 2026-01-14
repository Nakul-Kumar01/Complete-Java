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


        Note: 1) all classes which we define or pre-made extends Object class directly or indirectly
              2) Throwable class extends Object class
              3) Error and Exception class both extends throwable class

         */

        System.out.println(divide(4,1));
        System.out.println(divide(8,0));
        System.out.println(divide(6,3));
    }

    public static int divide(int a,int b){
        try{
            return (a/b);
        }
        catch (ArithmeticException e){
            System.out.println(e); // by the toString method in Throwable Class
            return -1;
        }
    }
}
