package example.calcengine;

import com.Calc;

/**
 * Created by kartik on 9/1/16.
 */
public class CalculateBase {

    private double leftVal;
    private double rightVal;
    private double result;

    public double getLeftVal()
    {
        return leftVal;
    }

    public void setLeftVal(double leftVal)
    {
        this.leftVal = leftVal;
    }

    public double getRightVal()
    {
        return rightVal;
    }

    public void setRightVal(double rightVal)
    {
        this.rightVal = rightVal;
    }

    public double getResult()
    {
        return result;
    }

    public void setResult(double result)
    {
        this.result = result;
    }

    public CalculateBase(){}
    public CalculateBase(double leftVal,double rightVal)
    {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
}
