package org.dromakin;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    public static int abs(int arg) {
        int result = arg;

        if (arg < 0) {
            result = -arg;
        }

        return result;
    }

    @Override
    public int sum(int arg0, int arg1) {
        return arg0 + arg1;
    }

    @Override
    public int mult(int arg0, int arg1) {
        boolean negative = arg0 < 0 ^ arg1 < 0;
        int result = abs(arg0);

        for (int i = 1; i < abs(arg1); i++) {
            result = sum(result, abs(arg0));
        }

        return negative ? -result : result;
    }

    @Override
    public int pow(int a, int b) {
        boolean negativePow = b < 0;
        boolean negative = a < 0;
        int result = abs(a);

        for (int i = 1; i < abs(b); i++) {
            result = mult(result, abs(a));
        }

        result = negativePow ? (1 / result) : result;

        return negative ? -result : result;
    }
}
