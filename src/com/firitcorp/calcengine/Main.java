package com.firitcorp.calcengine;

public class Main {

    public static void main(String[] args) {
	    // Version 1:
        /*
        double val1 = 100, val2 = 0, result;
	    char opCode = 'd';
	    */

        // Version 2: Using arrays
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        // Do a loop
        for (int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;

                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;

                case 'd':
                    if (rightVals[i] != 0.0d)
                        results[i] = leftVals[i] / rightVals[i];
                    else
                        results[i] = 0.0d;
                        // Version 1:
                        //System.out.println("WARNING: Cannot divide by zero!");
                    break;

                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                default:
                    results[i] = 0.0d;
                    // Version 1:
                    // System.out.println("Bad opCode!");
                    break;
            }

        }

        // Display output
        for (int i = 0; i < results.length; i++)
        {
            System.out.println(opCodes[i] + " result is: " + results[i]);
        }
    }
}
