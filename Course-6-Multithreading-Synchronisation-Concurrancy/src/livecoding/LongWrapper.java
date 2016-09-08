package livecoding;

/**
 * Created by kartik on 9/8/16.
 */
public class LongWrapper {

    private long l;

    public LongWrapper(long l)
    {
        this.l = l;
    }

    public long getValue()
    {
        return l;
    }

    // For the RaceCondition class this implementations is both read and write -> this causes race condition.

    public void incrementValue()
    {
        l = l + 1;
    }

}
