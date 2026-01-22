public class test03 extends Thread {


    public test03(String name){  // giving the name to the Thread
        super(name);
    }

    @Override
    public void run() {

        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " count: " + i);

        }
    }

    public static void main(String[] args) {


        /*
        - Methods we hv learned: start , run , sleep , join , setPriority

        - we can set the priority of the thread( by default 5 hoti hai)


         */

//        test03 t1 = new test03("Nakul");
//        t1.start();



    }
}
