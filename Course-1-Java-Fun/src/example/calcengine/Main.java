package example.calcengine;

/**
 * Created by kartik on 8/28/16.
 */

public class Main {

    public static void main(String[] args) {

        double[] leftvals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightvals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];
//
//        double val1 = 100.0d;
//        double val2 = 0.0d;
//        double result;
//
//        char opCode = 'd';

        for (int i = 0; i < opCodes.length; i++) {
            if (opCodes[i] == 'a') {
                results[i] = leftvals[i] + rightvals[i];
            } else if (opCodes[i] == 's') {
                results[i] = leftvals[i] - rightvals[i];
            } else if (opCodes[i] == 'd') {

                results[i] = rightvals[i] != 0.0d ? leftvals[i] / rightvals[i] : 0.0d;
//            if (val2!=0) {
//                result = val1 / val2;
//            }
//            else
//            {
//                result = 0.0d;
//            }
            } else if (opCodes[i] == 'm') {
                results[i] = leftvals[i] * rightvals[i];
            } else {
                System.out.print("Error");
                results[i] = 0.0d;
            }

        }
        for (double theResult : results) {
            System.out.println(theResult);
        }
    }
}
