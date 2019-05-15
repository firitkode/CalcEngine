package com.firitcorp.calcengine;

public class Main {

    public static void main(String[] args) {
	    // --- Version 1: Basic ----------------------------------------------------------------------------------------
        /*
        double val1 = 100.0d, val2 = 0.0d, result;
	    char opCode = 'd';

	    switch (opCode) {
            case 'a':
                result = val1 + val2;
                break;

            case 's':
                result = val1 - val2;
                break;

            case 'd':
                if (val2 != 0.0d)
                    result = val1 / val2;
                else
                    result = 0.0d;
                break;

            case 'm':
                result = val1 * val2;
                break;
            default:
                result = 0.0d;
                break;
        }

        System.out.println("Result = " + result);
        */
        // -------------------------------------------------------------------------------------------------------------

        // --- Version 2: Using arrays ---------------------------------------------------------------------------------
        /*
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
        */
        // -------------------------------------------------------------------------------------------------------------

        // --- Version 3: Using classes --------------------------------------------------------------------------------
        /*
        // Declare
        MathEquation[] equations = new MathEquation[4];

        // Declare individual equations
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(225.0d, 17.0d, 's');
        equations[3] = create(11.0d, 30.0d, 'm');

        // Loop through each MathEquation and execute
        for (MathEquation equation : equations) {
            equation.execute();

            System.out.println(equation.opCode + " Result = " + equation.result);
        }
        */
        // -------------------------------------------------------------------------------------------------------------

        // --- Version 3: Using classes w/ Accessors and Mutators ------------------------------------------------------
        // Declare
        MathEquation[] equations = new MathEquation[4];

        // Declare individual equations
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(225.0d, 17.0d, 's');
        equations[3] = create(11.0d, 30.0d, 'm');

        // Loop through each MathEquation and execute
        for (MathEquation equation : equations) {
            equation.execute();

            System.out.println(equation.getOpCode() + " Result = " + equation.getResult());
        }
        // -------------------------------------------------------------------------------------------------------------
    }

    // --- Version 3: Using Classes (comment-block if not using this) --------------------------------------------------
    /*
    public static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation equation = new MathEquation();

        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;

        return equation;
    }
    */
    // -----------------------------------------------------------------------------------------------------------------

    // --- Version 3a: Using Classes w/ Accessors and Mutators (comment-block if not using this) -----------------------
    public static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation equation = new MathEquation();

        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);

        return equation;
    }
    // -----------------------------------------------------------------------------------------------------------------
}
