package ExecutorFramework03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class test01 {

    public static void main(String[] args) {
        /*
        ################   Executors Framework
        - abstracting the complexities involved in creating and managing threads
        - Before it : manual thread management, resource management


        - without Multithreading aprox 9 sec are required , but now 1-2 sec for finding Factorials
        - but here we are manually creating threads


        - BY Executor Framework:
        - jo bhi kaam krvana hai exector.submit() me daal doo : yahi kaam abb 3 threads se bhi krr skte hai(by reusing the threads)
        - executor.shutdown() : new task ko submit nhi krega, and it will start shutdown, ye main thread ko wait nhi krvae ga bss abb new task ko submit nhi krega and shutdown of all threads is started after completion on tasks given to threads
        - executor.shutdownNow() : turnt hi shutdown kr do

        - Future<?>  :  agr  kuch return kra hai task ne tho vo store krne ke liye

         */


//        long startTime = System.currentTimeMillis();
//
//        Thread[] threads = new Thread[9];
//
//        for(int i=1;i<10;i++){
//            int finalI = i;
//            threads[i-1] = new Thread(
//                    () -> {
//                        long result = factorial(finalI);
//                        System.out.println(result);
//                    }
//            );
//            threads[i-1].start();
//        }
//
//
//        for(Thread thread : threads){
//            try{
//                thread.join();
//            }
//            catch (InterruptedException e){
//                Thread.currentThread().interrupt();
//            }
//        }
//
//        System.out.println("total time: " + (System.currentTimeMillis()-startTime));

        // by Executor Framework
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i=1;i<10;i++){
            int finalI = i;

            Future<?> submit = executor.submit(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });

        }
        executor.shutdown();

        // ye phale hi print ho jaega
//        System.out.println("total time: " + (System.currentTimeMillis()-startTime));


        try{
            executor.awaitTermination(5, TimeUnit.SECONDS); // this will wait until the task gets completes // maximum 5 sec tk wait krega
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println("total time: " + (System.currentTimeMillis()-startTime));

        // working of future  // to get datatype and variable automatically use alt+Enter
        ExecutorService executor1 = Executors.newSingleThreadExecutor();
        Future<Integer> res = executor1.submit(() -> 42);
        executor1.shutdown();
        try {
            System.out.println(res.get());  // hving various methods like res.done() // whether task is completed or not
        }
        catch (Exception e){

        }

    }



     // High computation work
     public static long factorial(int n) {
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        long res = 1;

        for(int i=n;i>=1;--i) res *= i;

        return res;
    }
}
