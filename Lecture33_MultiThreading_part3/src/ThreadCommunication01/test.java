package ThreadCommunication01;


class SharedResource{

    private  int data;

    private  boolean hasData;

    public synchronized void produce(int val){
         while(hasData){
             try{
                 wait();
             } catch (Exception e) {
                 Thread.currentThread().interrupt();
             }
         }
         data = val;
         hasData = true;
        System.out.println("Produced: " + val);
         notify();
    }
    public synchronized int consume(){
        while(!hasData){
            try{
                wait();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        notify();
        System.out.println("Consumed: " + data);
        return data;
    }
}


class Producer implements Runnable{

    private SharedResource resource;

    public Producer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            resource.produce(i);
        }
    }
}

class Consumer implements Runnable{

    private SharedResource resource;

    public Consumer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            int value = resource.consume();
        }
    }
}

public class test {
    public static void main(String[] args) {
        /*
        ########  Thread Communication
        - if it not present then consumer thread has to continuously check producer thread whethrer product is available or not(cpu wastage)
        - what if producer thread will automatically notify the consumer thread if product is ready

        - wait()
        - notify() : if product is ready then notify to single thread
        - notifyAll() : if product is ready then notify to all thread
        these are not synchronised therefore add synchronised in the method u are using
         */

        SharedResource resource = new SharedResource();
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}
