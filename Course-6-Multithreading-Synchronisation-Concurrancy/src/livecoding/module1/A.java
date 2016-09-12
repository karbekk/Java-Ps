package livecoding.module1;

/**
 * Created by kartik on 9/11/16.
 */
public class A {

    public Object key1 = new Object();
    public Object key2 = new Object();

    public void a()
    {
        synchronized (key1)
        {
            System.out.println("["+Thread.currentThread().getName()+"] I am in a()");
            b();
        }
    }

    public void b()
    {
        synchronized (key2)
        {
            System.out.println("["+Thread.currentThread().getName()+"] I am in b()");
            c();
        }
    }

    public void c()
    {
        synchronized (key1)
        {
            System.out.println("["+Thread.currentThread().getName()+"] I am in c()");
        }
    }

}
