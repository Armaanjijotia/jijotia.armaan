
class Calculator {
 
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;  
        }
        return (double) a / b;
    }
}
class AdvancedCalculator extends Calculator {

    public int square(int a) {
        return a * a;
    }
    public double squareRoot(int a) {
        return Math.sqrt(a);
    }
}
class CalculatorDemo {
    public static void main(String[] args) {
        // Create an object of AdvancedCalculator
        AdvancedCalculator calc = new AdvancedCalculator();

        // Perform basic operations using Calculator methods
        System.out.println("Addition: " + calc.add(10, 20));
        System.out.println("Subtraction: " + calc.subtract(20, 10));
        System.out.println("Multiplication: " + calc.multiply(10, 20));
        System.out.println("Division: " + calc.divide(20, 5));

        // Perform advanced operations using AdvancedCalculator methods
        System.out.println("Square: " + calc.square(5));
        System.out.println("Square Root: " + calc.squareRoot(16));
    }
}
