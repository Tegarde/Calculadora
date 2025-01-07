package pt.upskill;

public class Calculadora {
    private double result;

    public Calculadora() {
        result = 0;
    }

    public double sum(double num1, int num2) {
        return num1 + num2;
    }

    public double sum(double num1) {
        return result + num1;
    }

    public double subtraction(double num1, int num2) {
        return num1 - num2;
    }
    public double subtraction(double num1) {
        return result - num1;
    }

    public double calculateProduct(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 / num2;
    }

    public double division(double num1) {
        if (num1 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return result / num1;
    }

    public void save(double result) {
        this.result = result;
    }

    public void erase(double result) {
        this.result = 0;
    }

    public double power(double x, double y) {
        return Math.pow(x, y);
    }

    public double power(double x) {
        return Math.pow(result, x);
    }

    public boolean isComposedByCubes(int num) {
        int sum = 0;
        int originalNum = num;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }
        return sum == originalNum;
    }
    
}