public class MathOperations {

    // Addition
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed");
        }
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Division by zero is not allowed");
        }
        return a / b;
    }

    // Optionally, you can add overloaded methods for other types if needed

    public static void main(String[] args) {
        MathOperations calculator = new MathOperations();

        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(5, 3));
        System.out.println("Division: " + calculator.divide(5, 3));

        System.out.println("Addition: " + calculator.add(5.5, 3.2));
        System.out.println("Subtraction: " + calculator.subtract(5.5, 3.2));
        System.out.println("Multiplication: " + calculator.multiply(5.5, 3.2));
        System.out.println("Division: " + calculator.divide(5.5, 3.2));
    }
}
