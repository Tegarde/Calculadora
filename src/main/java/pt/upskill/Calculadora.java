package pt.upskill;

public class Calculadora {
    private double result;

    public Calculadora() {
        result = 0;
    }

    public void sum(int a, int b) {
        result = a + b;
    }
    public void sum(int a) {
        result += 0;
    }

    public void save(double result){
        this.result = result;
    }
}
