package synchronisation;

/**
 * Created by kartik on 9/8/16.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton()
    {

    }

    public static synchronized Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;

    }
}
