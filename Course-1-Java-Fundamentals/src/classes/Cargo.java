package classes;

/**
 * Created by kartik on 8/24/16.
 */
public class Cargo extends Flight {

    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;

    public void addPackage(float h, float w, float d)
    {
        double size = h * w * d;
        if (hasCargoSpace(size))
        {
            usedCargoSpace += size;
        }
        else
        {
            handlenospace();
        }

    }


    private boolean hasCargoSpace(double size)
    {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    private void handlenospace()
    {
        System.out.println("No space");
    }
}
