import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write("Hello, world!\nThis is a test file.");
            System.out.println("Written to file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}
