package ua.goit.testExcemples;

public class MathFunctions {
    private static final int MIN_VALUE = -100000;
    public int getAbsNumber(int number) {
        if (number <= MIN_VALUE) {
            throw new IllegalArgumentException("Number less then a " + MIN_VALUE);
        }
        return Math.abs(number);
    }

    public int add (int a, int b) {
        return a + b;
    }

    public int sub (int a, int b) {
        return a - b;
    }
}
