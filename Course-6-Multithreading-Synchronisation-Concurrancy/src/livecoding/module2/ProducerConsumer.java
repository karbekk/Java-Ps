package livecoding.module2;

/**
 * Created by kartik on 9/20/16.
 */
public class ProducerConsumer {

    private static Object lock = new Object();

    private static int[] buffer;
    private static int count;

    static class Producer{
        void produce()
        {
            synchronized (lock){
            if (isFull(buffer)){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                buffer[count++]=1;
                lock.notifyAll();
            }
        }
    }

    static class Consumer{
        void consume()
        {
            synchronized (lock){
            if(isEmpty(buffer)){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            buffer[--count]=0;
            lock.notifyAll();
            }
    }
    }


    static boolean isFull(int[] buffer)
    {
        return count == buffer.length;
    }

    static boolean isEmpty(int[] buffer)
    {
        return count == 0;
    }

    public static void main(String... strings) throws InterruptedException
    {
        buffer = new int[10];
        count = 0;

        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        Runnable produceTask = () -> {
            for (int i=0;i<50;i++)
            {
                producer.produce();
            }
            System.out.println("Done Producing");
        };

        Runnable consumeTask = () -> {
            for (int i=0;i<50;i++)
            {
                consumer.consume();
            }
            System.out.println("Done Consuming");
        };

        Thread consumerThread = new Thread(consumeTask);
        Thread producerThread = new Thread(produceTask);

        consumerThread.start();
        producerThread.start();

        consumerThread.join();
        producerThread.join();

        System.out.println("Data in the buffer is:"+ count);

    }

}