package livecoding.module1;

/**
 * Created by kartik on 9/11/16.
 */
public class RunningA {

    public static void main(String[] args) throws InterruptedException
    {
        A a = new A();


        Runnable r1 = () -> a.a();
        Runnable r2 = () -> a.b();

        Thread t1 = new Thread(r1);
        t1.start();

        Thread t2 = new Thread(r2);
        t2.start();

        // Stop both the threads using join methods

        t1.join();
        t2.join();
    }


}
