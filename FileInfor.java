import java.io.File;

public class FileInfor {
    public static void main(String[] args) {
        File file = new File("example.txt");
        if (file.exists()) {
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Size: " + file.length());
        } else {
            System.out.println("File not found.");
        }
    }
}
