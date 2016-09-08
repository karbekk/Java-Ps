package synchronisation;

/**
 * Created by kartik on 9/8/16.
 *
 * Dedicated object to hold the key
 *
 */
public class Synckey {

    private final Object key = new Object();

    public void init()
    {
        synchronized (key)
        {
            // do stuff here
        }
    }

}
