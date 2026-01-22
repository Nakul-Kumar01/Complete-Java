public class test03 extends Thread {


    public test03(String name){  // giving the name to the Thread
        super(name);
    }

    @Override
    public void run() {

//        for (int i=0;i<5;i++){
//            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " count: " + i);
//
//        }


        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {


        /*
        - Methods we hv learned: start , run , sleep , join , setPriority, Interrupt , yield

        - we can set the priority of the thread( by default 5 hoti hai)
        - setPriority se hmm jvm and OS ko hint de skte hn ki isski priority high rakna // abb high hogi ya nhi hogi depends on the program and no. of cores // multiCores mei fark pata nhi chalega

        - Interrupt : jo bhi Thread kr raha hai usse Interrupt kr do
         */

//        test03 t1 = new test03("Nakul");
//        t1.start();

//          test03 l = new test03("Low Priority Thread");
//          test03 m = new test03("Medium Priority Thread");
//          test03 h = new test03("High Priority Thread");
//
//          l.setPriority(Thread.MIN_PRIORITY);
//          m.setPriority(Thread.NORM_PRIORITY);
//          h.setPriority(Thread.MAX_PRIORITY);

        test03 t1 = new test03("nakul");
        t1.start();
        t1.interrupt(); // give sleep Interrupted

    }
}
