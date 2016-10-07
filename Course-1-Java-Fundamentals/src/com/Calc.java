package com;

/**
 * Created by kartik on 8/22/16.
 */
public class Calc {

    public static void main(String args[]) {
        // double val1= 100.0d;
        // double val2= 50.0d;
        // double result;
        // char opCode =  'd';

        double[] leftvals = {100.0d, 23.0d, 30.0d};
        double[] rightvals = {300.0d, 53.0d, 10.0d};
        char[] opCodes = {'d', 'a', 's'};

        double[] results = new double[opCodes.length];


        for (int i = 0; i < opCodes.length; i++) {
//            if (opCodes[i]=='d')
//                results[i] = leftvals[i] + rightvals[i];
//            else if (opCodes[i]=='a')
//                results[i] = leftvals[i] - rightvals[i];
//            else {
//                results[i]=100000.0d;
//            }
//        }
//        System.out.println(results);
//        for (double myResult: results)
//        {
//            System.out.println(myResult);
//            System.out.println("Hello");
//            System.out.print("HI");
//
//        }


            switch (opCodes[i])
            {
                case 'd':
                    results[i] = leftvals[i] + rightvals[i];
                    break;
                case 'a':
                    results[i] = leftvals[i] - rightvals[i];
                    break;
                case 's':
                    results[i] = leftvals[i] * rightvals[i];
                    break;
                default:
                    System.out.print("Invalid code");
                    results[i] = 0.0d;
                    break;
            }
            System.out.println(results[i]);

        }
        System.out.println();
        for (double myValue : results)
        {
            System.out.println(myValue);
        }

    }
}
