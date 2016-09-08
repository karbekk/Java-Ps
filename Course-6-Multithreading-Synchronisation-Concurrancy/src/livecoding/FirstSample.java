package livecoding;

/**
 * Created by kartik on 9/8/16.
 */
public class FirstSample {

        public static void main(String[] args) throws InterruptedException {
            LongWrapper longWrapper = new LongWrapper(0L);

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i<500;i++)
                    {
                        longWrapper.incrementValue();
                    }
                }
            };

            Thread t = new Thread(runnable);

                t.start();

            // default method
                t.join();

            System.out.println("Value = "+ longWrapper.getValue());


        }


}
