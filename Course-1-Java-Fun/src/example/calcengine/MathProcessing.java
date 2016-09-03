package example.calcengine;

/**
 * Created by kartik on 9/2/16.
 */
public interface MathProcessing {

    String SEPERATOR = " ";
    String getKeyword();         // add
    char getSymbol();            // +
    double doCalculation(double leftVal, double rightVal);
}
