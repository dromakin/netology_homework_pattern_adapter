package org.dromakin;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return arg0 + arg1;
    }

    @Override
    public int mult(int arg0, int arg1) {
        int result = arg0;

        for (int i = 1; i < arg1; i++) {
            result = sum(result, arg0);
        }

        return result;
    }

    @Override
    public int pow(int a, int b) {
        int result = a;

        for (int i = 1; i < b; i++) {
            result = mult(result, a);
        }

        return result;
    }
}
