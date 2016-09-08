package livecoding;

/**
 * Created by kartik on 9/8/16.
 */
public class FirstRunnable {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println("I am running in thread " + name);
            }
        };
        Thread t = new Thread(runnable);

        // This ll call the thread method
        t.start();

        // This will call the main thread run not the thread.

        //t.run();
    }
}
