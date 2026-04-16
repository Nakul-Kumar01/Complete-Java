package LambdaExpression02;

public class test {
    public static void main(String[] args) {
        /*

        Functional Interface : Interface hving single abstract method
        - Runnable : it is functional Interface

        - Lambda expression : Anonymous Function hai // used to implement functional interface
                       - it is a short way to implement any functional interface




        // #########  Thread Pool  ############
        Collection of pre-Initialised threads ready to perform a task
        - agr koi task hai, tho new thread create krne ki bajae : thread pool create kr lenge, or jarurtt pdne prr inhe hi use kr lenge
        why??
        - Resource management
        - response time increases : since no need to create thread again and again
        - control over thread count
         */


        // Thread by anonymous class by implementing Runnable Interface
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        };
//        Thread t1 = new Thread(runnable);
//        t1.start();


        // Thread by anonymous function by implementing Runnable Interface
        Runnable runnable = ()->{
            System.out.println("Hello");
        };
        Thread t1 = new Thread(runnable);
        t1.start();

        // in short :
        Thread t2 = new Thread(() -> System.out.println("Hello"));   // lambda expression ko hmm kisi bhi functional interface ke refference mei
        t2.start();


    }
}
