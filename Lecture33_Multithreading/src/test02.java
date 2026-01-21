public class test02 extends  Thread {

    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        /*
        - Note : override methods mei hm throws use nhi kr skte

         */

        test02 t1 = new test02();
        t1.start();
        Thread.sleep(100);
    }
}
