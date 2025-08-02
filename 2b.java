class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two floating-point numbers
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling the add method with two integers
        System.out.println("Sum of two integers: " + calc.add(10, 20));

        // Calling the add method with three integers
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));

        // Calling the add method with two doubles
        System.out.println("Sum of two doubles: " + calc.add(10.5, 20.5));
    }
}
