public class test04 extends  Thread{
    public test04(String name) {
        super(name);
    }

    @Override
    public void run() {

        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();
        }
    }

    public static void main(String[] args) {

        /*

         - Methods we hv learned: start , run , sleep , join , setPriority, Interrupt , yield, setDaemon

         - yield : we give hint to scheduler that you can give chance to other threads now // scheduler can ignore this hint also
         */

        test04 t1 = new test04("t1");
        test04 t2 = new test04("t2");
        t1.start();
        t2.start();


    }
}
