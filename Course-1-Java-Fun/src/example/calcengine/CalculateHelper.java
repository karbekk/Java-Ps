package example.calcengine;

/**
 * Created by kartik on 9/2/16.
 */
public class CalculateHelper {

    MathCommand command;
    double leftValue;
    double rightValue;
    double result;


    // Parse the string from main

    public void process(String statement)
    {
        // add 1.0 2.0

        String[] parts = statement.split(" ");
        String commandString = parts[0];             // add
        leftValue = Double.parseDouble(parts[1]);    // 1.0
        rightValue = Double.parseDouble(parts[2]);   // 2.0

    }

    private void setCommandFromString(String commandString)
    {
        if(commandString.equalsIgnoreCase(MathCommand.Add.toString()))
    }
}
