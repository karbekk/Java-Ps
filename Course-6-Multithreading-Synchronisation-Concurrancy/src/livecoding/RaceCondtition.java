package livecoding;

/**
 * Created by kartik on 9/8/16.
 */
public class RaceCondtition {

    public static void main(String[] args) throws InterruptedException {
        LongWrapper longWrapper = new LongWrapper(0L);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
               for (int i = 0; i<1000;i++)
               {
                   longWrapper.incrementValue();
               }
            }
        };

        Thread[] threads = new Thread[1000];
            for (int i=0;i<threads.length;i++)
            {
                threads[i] = new Thread(runnable);
                threads[i].start();
            }

        for (int i=0;i<threads.length;i++)
        {
            threads[i].join();
        }

        System.out.println("Value = "+ longWrapper.getValue());


    }
}
