package example.calcengine;

/**
 * Created by kartik on 9/1/16.
 */
public class Subtracter extends CalculateBase {

    public Subtracter(){}
    public Subtracter(double leftVal, double rightVal)
    {
        super(leftVal,rightVal);
    }

    @Override
    public void calculate()
    {
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
