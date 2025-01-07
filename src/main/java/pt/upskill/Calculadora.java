package pt.upskill;

public class Calculadora {
    private double result;

    public Calculadora() {
        result = 0;
    }

    public double subtraction(double num1, int num2) {
        return num1 - num2;
    }
    public double subtraction(double num1) {
        return result - num1;
    }

    public void save(double result){
        this.result = result;
    }

    public void erase(double result) {
        this.result = 0;
    }
}
