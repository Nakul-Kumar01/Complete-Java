public class test {
    public static void main(String[] args) {

        /*
        ###  MultiThreading  ###
        - CPU : responsible for executing instructions from program
        - core : it is an individual processing unit within a cpu. Modern CPUs can hv multiple cores.
        - quard-core processor : has 4 cores, allowing it to perform 4 tasks simultaneously
        - program: set of instructions
        - process: instance of a program that is being executed
        - Thread: smallest unit of execution within a process // process can hv multiple threads, which share same resources but can run independently
        - i.e. web Browser: use multiple threads for diff. tabs, with each tab running as a separate thread.


        - MultiThreading: refers to ability to execute multiple threads within a single process concurrently.
        - Time Slicing: dividing CPU time into small intervals
        - context switching: process of saving the state of a currently running process or thread and loading the state of next one to be executed.

        - program is just a file stored on disk.
        - Process = program in execution
        - core is a real hardware unit that executes instructions
        - Inside a process: 1) There can be multiple threads  2) All threads share the same memory of the process


        - Is core having multiple threads?  Single core can perform only single task?
        - One core executes only ONE thread at a time
        - But it can switch very fast between multiple threads
        - Then how do multiple threads run on one core?  ->  by Context Switching -> OS rapidly switches: Thread A → Thread B → Thread C
        - conclusion: 1) process mei multiple threads hote hn  (say 8 thread)
                      2) phale single core hote the: ek core multiple threads mei swithing krta tha
                      3) now we hv multiple cores: (say 2 cores) , one core switches b/w 4 threads and one core switches b/w another 4 threads

        - java's multithreading are part of java.lang package
        - in single core: java's multithreading is managed by JVM and the OS, which switch b/w threads to give illusion of concurrency
        - in multicore: java's multithreading can take full adv of acailable cores. JVM can distribute threads across multiple cores, allowing true parallel execution of thread


        - when java program starts, one thread begins running immediately called main Thread, this thread is responsible for executing the main method of a program.

        - to create new thread : M-1  extend the thread class  M-2 Implement the runnable interface

        - M-1
        - run method is overridden to define the code that constitutes the new thread
        - start method is called to initiate the new thread  // simple run call kiya tho, simple method call hogi , new thread create nhi hogi

        - M-2
        - a thread object is created by passing an instance of world
         */


        System.out.println("Hello world");
        System.out.println(Thread.currentThread().getName()); // give name of current thread


//        M-1
        world w = new world();
        w.start(); //start the another thread // ek or independent kaam

//        M-2
        world02 w2 = new world02();
        Thread t2 = new Thread(w2);
        t2.start();


        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
