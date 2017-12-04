package Calculator;

public class Calculation {

    private double result = 0.0;

    public double summarize(double a, double b) {
        result = a + b;
        return result;
    }


    public double divide(double a, double b) throws IllegalAccessException {
        if (b==0){throw new IllegalArgumentException("Division by zero!");}
        else  result = a/b;
        return result;
    }


    public double multiply(double a, double b) {
        result =  a * b;
        return result;
    }


    public double subtract(double a, double b) {
        result = a - b;
        return result;
    }

}
