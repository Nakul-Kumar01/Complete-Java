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
         */
    }
}
