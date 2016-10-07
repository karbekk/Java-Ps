package example.calcengine;

/**
 * Created by kartik on 9/1/16.
 */

public class Adder extends CalculateBase implements MathProcessing{
    public Adder(){}

    // This method calls the constructor of the base class
    public Adder(double leftVal, double rightVal)
    {
        super(leftVal,rightVal);
    }

    // Implementing the abstract method in child class

    @Override
    public void calculate()
    {
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }

    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {

        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }
}
