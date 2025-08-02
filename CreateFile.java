import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("example.txt");
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }
    }
}
