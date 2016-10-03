package livecoding.module4;

/**
 * Created by kartik on 10/3/16.
 */

public class Singleton {

    public static Singleton instance;

    private Singleton()
    {}

    public static Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }

}
