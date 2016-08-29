package example.calcengine;

/**
 * Created by kartik on 8/29/16.
 */
public class MathEquation {

    public double leftVal;
    public double rightVal;
    public char opCode;
    public double result;


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
