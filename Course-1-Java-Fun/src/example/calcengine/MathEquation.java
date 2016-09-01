package example.calcengine;

/**
 * Created by kartik on 8/29/16.
 */
public class MathEquation {

    // Instance Variables
    private double leftVal;
    private double rightVal;
    private char opCode='a';
    private double result;


    //Accessors and Mutators

    public double getLeftVal()
    {
        return leftVal;
    }
    public void   setLeftVal(double leftVal)
    {
        this.leftVal = leftVal;
    }
    public double getRightVal()
    {
        return rightVal;
    }
    public void   setRightVal(double rightVal)
    {
        this.rightVal = rightVal;
    }
    public char   getOpCode()
    {
        return opCode;
    }
    public void   setOpCode(char opCode)
    {
        this.opCode = opCode;
    }

    public double getResult()
    {
        return  result;
    }


    // Constructors
    //Default constructor

    public MathEquation() {}

    public MathEquation(char opCode)
    {
        this.opCode = opCode;
    }

    // Constructor with opcode called from above constructor
    public MathEquation(char opCode, double leftVal, double rightVal)
    {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    //Adding the customized constructor through overloading

    public void execute(double leftVal, double rightVal)
    {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }

    public void execute(int leftVal, int rightVal)
    {
        // The int is converted into double here as leftval and rightval are declared as double here.

        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();

        // to get int result cast the resulted double to int.

        result = (int) result;

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
