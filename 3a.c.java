import java.util.Scanner;  // Importing the Scanner class

 class ScannerExample {
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompting the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();  // Reads an integer
        
        // Prompting the user to enter a string
        System.out.print("Enter your name: ");
        scanner.nextLine();  // Consume the leftover newline character after nextInt()
        String name = scanner.nextLine();  // Reads a string
        
        // Prompting the user to enter a float
        System.out.print("Enter your salary: ");
        float salary = scanner.nextFloat();  // Reads a float
        
        // Displaying the input values
        System.out.println("You entered:");
        System.out.println("Integer: " + number);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        
        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
