public class test02 extends  Thread {

    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        /*
        - Note : override methods mei hm throws use nhi kr skte

        - in java we hv Thread State: New, Runnable, Timed_wating, terminated

        - Thread vs Runnable in Java : since , multiple Inheritance is not in java, therefore, when child class is inheriting parent class then we cannot extend child class, but can Implement Runnable Interface
        - Methods we hv learned: start , run , sleep , join , setPriority
         */

        test02 t1 = new test02();
        t1.start();
        Thread.sleep(100);  // stops main Thread for 100 millisecond
        System.out.println(Thread.currentThread().getState());
        System.out.println(t1.getState());
        t1.join(); // t1 ke finish hone ka wait kr rahe hn
        System.out.println(t1.getState()); // due to t1.join() main thread wait for completion of t1 // therefore it gives Terminated // eles give TIMED_WAITING


    }
}
