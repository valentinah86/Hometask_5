package Calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        double x = 0.0;
        double y;
        char operation = ' ';
        int State = 0;
        String value = "";
        Calculation calc = new Calculation();


        while (!value.equals("quit")) {

            switch (State) {

                case 0:
                    System.out.println("Insert first value");
                    value = str.next();
                    if (value.equals("quit"))
                    {
                        break;
                    }
                    else if (NumericValues(value))
                    {
                        x = Double.parseDouble(value);
                        State = 1;
                        break;
                    }
                    else {
                        System.out.println("Please, insert any numeric value or type 'quit' to close app");
                        State = 0;
                        break;
                    }
                case 1:
                    System.out.println("Insert needed operation");
                    value = str.next();
                    if (value.equals("quit")){
                        System.exit(0);
                    }
                    else {
                        if (value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/"))
                        {
                            operation = value.charAt(0);
                            State = 2;
                            break;
                        }
                        else {
                            System.out.println("Incorrect operation. Please, type correct symbol or type 'quit' to close the app");
                            State = 1;
                            break;
                        }
                    }
                case 2:
                    System.out.println("Insert second value");
                    value = str.next();
                    if (value.equals("quit")){
                       System.exit(0);
                    }
                    else if (NumericValues(value)) {
                        y = Double.parseDouble(value);
                        switch (operation) {

                            case '+':
                                System.out.println("Result =  " + calc.summarize(x, y));
                                break;

                            case '-':
                                System.out.println("Result = " + calc.subtract(x, y));
                                break;

                            case '*':
                                System.out.println("Result = " + calc.multiply(x, y));
                                break;

                            case '/':

                                try {
                                    System.out.println("Result =" + calc.divide(x, y));
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                                break;
                        }
                        State = 0;
                    }
                    else {
                        System.out.println("Please, insert any numeric value or type 'quit' to close app");
                        State = 2;
                        break;
                    }

            }
        }
    }

    static private boolean NumericValues (String X) throws NumberFormatException {
        try {
            Double.parseDouble(X);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

}


