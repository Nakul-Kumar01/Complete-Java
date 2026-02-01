public class MyThread  extends Thread{

    public Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0;i<3000;i++){
            counter.increment();
        }
    }
}
