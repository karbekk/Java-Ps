package example.calcengine;

/**
 * Created by kartik on 9/1/16.
 */
public class Divider extends CalculateBase{

    public Divider(){}
    public Divider(double leftVal, double rightVal)
    {
        super(leftVal,rightVal);
    }

    @Override
    public void calculate()
    {
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }
}
