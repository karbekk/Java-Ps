package example.calcengine;

/**
 * Created by kartik on 9/1/16.
 */
public class Adder extends CalculateBase{
    public Adder(){}

    // This method calls the constructor of the base class
    public Adder(double leftVal, double rightVal)
    {
        super(leftVal,rightVal);
    }

    // Implementing the abstract method in child class

    public void calculate()
    {

    }
}
