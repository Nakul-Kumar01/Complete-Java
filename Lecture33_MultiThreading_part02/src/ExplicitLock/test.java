package ExplicitLock;

public class test {

    public static void main(String[] args) {

        /*
        - here if t1 thread has accessed the withdrawal method first(say), then t1 thread has taken much time, now thread t2 has to wait for much time
        - to resolve this problem we have Explicit Lock

        - Lock is Interface and ReentrantLock is a class Implemented Lock Interface
        - lock.tryLock() : Acquires the lock if it is available and returns immediately with the value true. If the lock is not available then this method will return immediately with the value false.
        - lock.tryLock(1000, TimeUnit.MILLISECONDS) : dusri thread 1 sec tk wait kregi agr lock free ho jae to varna return hojaegi with value false
        - lock.unlock()  : release the lock
        - lock.lock()  (not used much) : synchronise ki trha hai // dusri thread wait krti rahegi ki kbb lock release hogi...

        - new ReentrantLock(true) :  this will maintain the fairness of Locks -> jo phale lock ke pass aaya uss thread ko Lock mil jaega

        - why we preffer ExplicitLock over synchronised Locks ???
           - in synchronised : No fairness gurrentee , hving indefinite blocking , enable Read/write Locking(by taking 2 locks)
         */

        // without Explicit Lock:
//        BankAccount sbi = new BankAccount();
//        Runnable task = new Runnable() {  // we are making Thread by runnable Interface now
//            // this is anonymous class // hmne alg se class banake usse runnable interface ko Implement nhi kiya
//            @Override
//            public void run() {
//                 sbi.withdraw(50);
//            }
//        };

//        Thread t1 = new Thread(task, "Thread 1");
//        Thread t2 = new Thread(task, "Thread 2");
//        t1.start();
//        t2.start();


        // by Explicit Lock:
        BankAccount02 sbi = new BankAccount02();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                 sbi.withdraw(50);
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();


        // #### Read/write Locking
        // synchronised cannot be able to distinguise b/w read and write operation
        // ReadWriteLock (interface) : allow multiple threads to read untile unless any thread is writing
        // readLock.lock() : this will only allow reading if writeLock.lock() is not aquire by any thread
        // see the example from yourself
    }
}
