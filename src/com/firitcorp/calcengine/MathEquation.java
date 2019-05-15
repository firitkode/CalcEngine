package com.firitcorp.calcengine;

public class MathEquation {
    // --- Version 3: Using classes (no accessors and mutators)
    /*
    public double leftVal;
    public double rightVal;
    public char opCode;
    public double result;
    */
    // -----------------------------------------------------------------------------------------------------------------

    // --- Version 3a: Using classes with accessors and mutators -------------------------------------------------------
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    // Accessors
    public double getLeftVal() {return leftVal;}
    public double getRightVal() {return rightVal;}
    public double getOpCode() {return opCode;}
    public double getResult() {return result;}
    // Mutators
    public void setLeftVal(double leftVal){this.leftVal = leftVal;}
    public void setRightVal(double rightVal){this.rightVal = rightVal;}
    public void setOpCode(char opCode){this.opCode = opCode;}
    // -----------------------------------------------------------------------------------------------------------------

    public void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;

            case 's':
                result = leftVal - rightVal;
                break;

            case 'd':
                if (rightVal != 0.0d)
                    result = leftVal / rightVal;
                else
                    result = 0.0d;
                // Version 1:
                //System.out.println("WARNING: Cannot divide by zero!");
                break;

            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                result = 0.0d;
                break;
        }
    }
}
