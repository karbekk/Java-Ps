package livecoding.module4;

import livecoding.module1.*;

/**
 * Created by kartik on 10/3/16.
 */
public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {
        livecoding.module1.LongWrapper longWrapper = new livecoding.module1.LongWrapper(0L);

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
