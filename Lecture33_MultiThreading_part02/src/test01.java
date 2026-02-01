public class test01 {
    public static void main(String[] args) {

        /*
        // why this does not give 6000??
        - bcoz ek hii time pe dono thread ne counter ki same value utha li
        - ek time pe ek hi thread access kre kisi method ko : use 'synchronized' to that method
        - if you want only some part of code to be synchronized then use synchronized block
             *** synchronized (this) means:  "Only one thread at a time can execute this block for the same object."
             - if having different object: tbb to koi chinta hi nhi hai : Both threads run at the same time, No synchronization between them

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
