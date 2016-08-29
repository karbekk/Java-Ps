package example.calcengine;

/**
 * Created by kartik on 8/29/16.
 */
public class MathEquation {

    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    public double getLeftVal()
    {
        return leftVal;
    }

    public double getRightVal()
    {
        return rightVal;
    }

    public char   getOpCode()
    {
        return opCode;
    }

    public void   setLeftVal(double leftVal)
    {
        this.leftVal = leftVal;
    }

    public void   setRightVal(double rightVal)
    {
        this.rightVal = rightVal;
    }

    public void   setOpCode(char opCode)
    {
        this.opCode = opCode;
    }

    public double getResult()
    {
        return  result;
    }

    public void execute()
    {
        switch (opCode) {

            case 'a':
                result = leftVal + rightVal;
                break;

            case 's':
                result = leftVal - rightVal;
                break;

            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;

            case 'm':
                result = leftVal * rightVal;
                break;

            default:
                System.out.print("Error");
                result = 0.0d;
                break;
        }

    }

}
