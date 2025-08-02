import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for user input for name, roll number, and field of interest
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read the name
        
        System.out.print("Enter your roll number: ");
        int rollNumber = scanner.nextInt();  // Read the roll number
        
        // Consume the newline character left by nextInt()
        scanner.nextLine(); 
        
        System.out.print("Enter your field of interest: ");
        String fieldOfInterest = scanner.nextLine();  // Read the field of interest

        // Print the desired output
        System.out.println("My name is " + name + " and my roll number is " + rollNumber + ". My field of interest are " + fieldOfInterest + ".");

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
