import School.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Types of Errors:
         - Syntax Error
         - Logical Error
         - Runtime Error

        - Program will crash during runtime error i.e divide by 0
        - Exception : event that disrupts the normal flow of program. it is an object which is thrown at runtime
        - Exception handling is a way to handle the runtime errors so that normal flow of the application can be maintained, vrna program bich mei hi terminate hojaega
        - we can use multiple catch functions
        - in a catch function we can write multiple Exception but they should be disjoint(koi ek dusre ka parent nhi hona chaiye)

        Note: 1) all classes which we define or pre-made extends Object class directly or indirectly
              2) Throwable class extends Object class
              3) Error and Exception class both extends throwable class


        - unchecked Exception : does not check in compile time i.e. Arithematic Exception
        - checked Exception : check in compile time i.e. ioException

        - by adding exception in method signature by using throws we don't handle the exception , bss hmm compiler ko alert kr rahe hn ki iss method me exception aaskta hai
        - *** throws: alert kr deta hai ki iss method mei koi Exception aa skta hai and agr koi Exception aaya tho usse parent method mei bhaj dega , agrr parent method mei bhi handle nhi hua tho program will terminate
        - hence throws will transfer Exception to parent method
        - throw : when we have to explicitly throw an Exception

        - Finally: this method will run always whether exception occur or not


        - try-with-resources : new way to write try/catch/finally // no need to create the finally method

        - Custom Exception : extends Exception class

        - RULE: we have to handle the Exception using try/catch somewhere in the program, else program will terminate there only // throws sirf alert krta hai and parent method ko exception pass kr deta hai
         */

//        System.out.println(divide(4,1));
//        System.out.println(divide(8,0));
//        System.out.println(divide(6,3));



//        level1(); // we don't handle exception here, therefore there will be 'stack tray' in terminal which is explaining the Exception from where it arises


        try{
            level1();
        }
        catch (Exception e){
            StackTraceElement[] stackTrace = e.getStackTrace();
            for(int i=0;i<stackTrace.length;i++){  // yaha hmmne khud stackTray print krvali
                System.out.println(stackTrace[i]);
            }
        }

        // this is checked Exception
//        FileReader file = new FileReader("a.txt"); // M-1: use try Catch // M-2: add Exception to method signature


//        method2(); // since, we don't handle the exception therefore program terminated
        System.out.println("hii");


        divide(1,0);


        // ### try-with-resources
        // ---- with simple try/catch/finally ----
//        BufferedReader reader = null;
//        try{
//            reader = new BufferedReader(new FileReader("ex.txt"));
//            String line;
//            while((line = reader.readLine()) != null){
//                System.out.println(line);
//            }
//        } catch (IOException e){
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("closing the reader...");
//        }

        // with try-with-resources // no need to write finally
        try(BufferedReader reader = new BufferedReader(new FileReader("ex.txt"))){ // jo object hmm yaha create krenge vo automatically close ho jaega // also this class inside the paranthesis should Implement AutoClose Interface i.e. BufferedReader is Implementing the AutoClose Interface
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println(e);
        }
        finally {
            System.out.println("closing the reader...");
        }


        // ### custom Exception
        try{
            throw new customException();
        }
        catch (Exception e){
            System.out.println("-->" + e);  // this will print Exception name also, bcoz, Throwable class have toString method which prints the detailed message
                                            // but since Exception class extends the Throwable class, therefore you can override the toString method
        }
    }

    public static int divide(int a,int b){
        try{
//            Student st = null;
//            st.setId(123);
//            System.out.println(st.getId());
            return (a/b);
        }
        catch (ArithmeticException | IndexOutOfBoundsException e){ // agr aise likha hai tho koi kisika parent nhi hona chaiye(you cannot write RuntimeException) // since, RuntimeException is parent of ArithmeticException then we can also use RuntimeException here
            System.out.println(e); // by the toString method in Throwable Class
            return -1;
        }

        catch(Exception e){   // or baki k exception yaha handle ho jaenge
            System.out.println(e);
            return -1;
        }
        finally {
            System.out.println("Done");
        }
    }

    public static void level3(){
        int[] array = new int[5];
        array[5] = 10;   // this will give IndexOutOfBoundException
    }

    public static void level2(){ // exception is passed to this method
        level3();
    }

    public static void level1(){//then, exception is passed to this method // and this will pass to main method // agr vaha pr bhi handle nhi hua then program will terminate
        level2();
    }


    public static void method1() throws FileNotFoundException {
       try{
           FileReader file = new FileReader("a.txt");
       }
       catch (FileNotFoundException e){
           System.out.println("File Not Found");
           throw new FileNotFoundException("oops glti hogyi"); // yaha hmm kuch message bhi likh skte hn
       }
    }

    public static void method2() throws FileNotFoundException {
        method1();
//        throw new FileNotFoundException(); // since, this is checked Exception therefore isko bhi hmme handle krna padega, vrna program bich mei hi terminate hojaega
//        throw new ArithmeticException();  // this is unchecked Exception therefore it does not need throws in signature, but to handle it either we use throws to handle in parent or we can use try/catch in this method itself
    }

}
