package example.calcengine;

/**
 * Created by kartik on 9/2/16.
 */

// All custom exceptions must inherit from global exception class

public class InvalidException extends Exception {

    // Note: In most cases, custom exceptions only has the constructors inside it.

    public InvalidException(String reason, String statement)
    {
        super(reason+": "+statement);
    }

    // Custom exceptions generally has 2 constructors one the message and other which is associated with the first one.

    public InvalidException(String reason, String statement,Throwable cause)
    {
        super(reason+": "+statement,cause);
    }


}
