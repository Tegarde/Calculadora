package pt.upskill.domain;

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

    public double calculateProduct(double num1) {
        return num1 * result;
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

    public void erase() {
        this.result = 0;
    }

    public double power(double x, double y) {
        return Math.pow(x, y);
    }

    public double power(double x) {
        return Math.pow(result, x);
    }

    public int calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
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

    public double binaryToDecimal(String binaryString){
        return Integer.parseInt(binaryString, 2);
    }

    public int decimalToBinary(int decimal) {
        String binary = Integer.toBinaryString(decimal);
        return Integer.parseInt(binary);
    }

    public String intToHex(double num) {
        return Integer.toHexString((int) num);
    }

    public boolean isPrime(int num1) {
        if (num1 <= 1) {
            return false;
        }

        for (int i = 2; i < num1; i++)
        {
            if((num1% i) == 0)
            {
                return false;
            }
        }
        return true;
    }

}