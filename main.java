import java.util.Scanner;

class Calculator {
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
    public static int power(int a, int b) {
        int result = 1;
        for(int i = 0; i<b; i++) {
            result*=a;
        }
        return result;
    }
    public static int modulo(int a, int b) {
        return a % b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printLn("Enter your numbers here: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = add(num1, num2);
        System.out.println("sum: " + sum);

        int difference = subtract(num1, num2);
        System.out.println("difference: " + difference);

        int product = multiply(num1, num2);
        System.out.println("product: " + product);

        double quotient = divide(num1, num2);
        System.out.println("Quotient: " + quotient);
        
        double modulo = modulo(num1, num2);
        System.out.println("Modulo: " + modulo);

        int power = power(num1, num2);
        System.out.println("Power: " + power);
    }
}
