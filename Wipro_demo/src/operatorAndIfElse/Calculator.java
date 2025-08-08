package operatorAndIfElse;

public class Calculator {
    public static void main(String[] args) {
        int a = 10, b = 5;
        char op = '/';

        switch (op) {
            case '+': System.out.println("Sum: " + (a + b)); break;
            case '-': System.out.println("Difference: " + (a - b)); break;
            case '*': System.out.println("Product: " + (a * b)); break;
            case '/':
                if (b != 0) System.out.println("Quotient: " + (a / b));
                else System.out.println("Cannot divide by zero");
                break;
            case '%': System.out.println("Modulus: " + (a % b)); break;
            default: System.out.println("Invalid operator");
        }
    }
}

