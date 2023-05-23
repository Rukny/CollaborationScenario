public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int sum = add(num1, num2);
        System.out.println("Sum: " + sum);

        int difference = subtract(num1, num2);
        System.out.println("Difference: " + difference);

        int product = multiply(num1, num2);
        System.out.println("Product: " + product);

        double quotient = divide(num1, num2);
        System.out.println("Quotient: " + quotient);
    }
}
