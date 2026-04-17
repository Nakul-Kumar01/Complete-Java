package ExecutorFramework03;

import java.util.concurrent.*;

public class test01 {

    public static void main(String[] args) throws InterruptedException {
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


        - callable Interface vs runnable Interface
| Feature          | Runnable     | Callable       |
| ---------------- | ------------ | ---------------------- |
| Return value     | ❌ No         | ✅ Yes (Future<?>    |
| Method           | `run()`      | `call()`               |
| Throws exception | ❌ No         | ✅ Yes                |
| Package          | `java.lang`  | `java.util.concurrent` |
| Usage            | Simple tasks | Tasks needing result   |


           - use Runnable when u not want to return any thing
           - use Callable when u want to return any thing

           -*** executor can accept both runnable as well as callable interface Implementation


           - task in executor.submit() is not executed my main thread , it is done by threads in thread Pool
           - but when we use ans.get() then main thread will wait for completion
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

            Future<?> submit = executor.submit(() -> {   // abb jo ye task hai issko main thread execute nhi krega
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



        // callable vs runnable
        ExecutorService executor2 = Executors.newSingleThreadExecutor();
//        Future<String> ans = executor2.submit(() -> "hello"); // working fine // here submit is accepting callable task(since lambda fn is returning something)
//        Runnable runnable = () -> "hello";   // runnable task does not return something, but callable task can return
        Callable callable = () -> "hello";
        Future<String> ans = executor2.submit(callable);

        Future<?> ans2 = executor2.submit(()-> System.out.println("nakul"),"is successfull"); // after successfull completion of runnable method, it will return this result
        executor2.shutdown();



        // understanding the flow :
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> submit = executorService.submit(() -> 1 + 2);  // this task will be executed by 2 threads in Pool, main thread will not wait
        Integer i =0;
        try{
             i = submit.get();    // but here main thread needs to wait for completion of task given to 2 threads
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("sum is " + i);
        executorService.shutdown();
        System.out.println(executorService.isShutdown());  // true
        System.out.println(executorService.isTerminated());// why returning false ?? -> abhi shutdown kiya, then turnt print krva diya , kuch time tho dete!! (add Thread.sleep(1) )
        // Returns true if all tasks have completed following shut down
         // Note that isTerminated is never true unless either shutdown or shutdownNow was called first.

        Thread.sleep(1);
        System.out.println(executorService.isTerminated()); // now give true

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
