class Calculator {

    // Overloaded method with two integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three integer parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with two double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Calling the overloaded methods
        System.out.println(calc.add(5, 10));        // Outputs: 15
        System.out.println(calc.add(5, 10, 15));    // Outputs: 30
        System.out.println(calc.add(5.5, 10.5));    // Outputs: 16.0
    }
}
