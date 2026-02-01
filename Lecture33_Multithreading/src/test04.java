public class test04 extends  Thread{
    public test04(String name) {
        super(name);
    }

    @Override
    public void run() {

//        for(int i=0;i<10;i++){
//            System.out.println(Thread.currentThread().getName() + " is running");
//            Thread.yield();
//        }


        while (true){
            System.out.println("Hello world");
        }
    }

    public static void main(String[] args) {

        /*

         - Methods we hv learned: start , run , sleep , join , setPriority, Interrupt , yield, setDaemon

         - yield : we give hint to scheduler that you can give chance to other threads now // scheduler can ignore this hint also

         - user Thread : Thread which are performing the main task( jo hm abhi tk use krte aare hn)
         - Daemon Thread : Thread which run in background // jvm does not wait for them : if all userThread are finished then jvm will also terminate these Deamon Thread
         */

//        test04 t1 = new test04("t1");
//        test04 t2 = new test04("t2");
//        t1.start();
//        t2.start();



        test04 t1 = new test04("t1");
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main Done"); // here main thread finished, no userThread left now : therefore jvm will terminate Deamon Thread automatically


    }
}
