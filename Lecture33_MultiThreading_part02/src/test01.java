public class test01 {
    public static void main(String[] args) {

        /*
        // why this does not give 6000??
        - bcoz ek hii time pe dono thread ne counter ki same value utha li  // this is called race condition (when 2 or more threads access the same resource at same time)
        - ek time pe ek hi thread access kre kisi method ko : use 'synchronized' to that method (since this is shared resources called critical section)
        - if you want only some part of code to be synchronized then use synchronized block
             *** synchronized (this) means:  "Only one thread at a time can execute this block for the same object."
             - *** if having different object: tbb to koi chinta hi nhi hai : Both threads run at the same time, No synchronization between them : bcoz, Lock is per object, Different objects = different locks

        - There are 2 types of Locks:
           1) Intrinsic : these locks are buitin into every object in java. when u use synchronized keyword you are using these automatic locks
           2) Explicit :
         */
        Counter counter = new Counter();

        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch (Exception e){

        }
        System.out.println(counter.getCount()); // why this does not give 6000??

    }
}
