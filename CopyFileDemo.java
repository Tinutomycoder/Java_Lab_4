
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
    public static void main(String[] args) {
        // Automatically handles streams closing via try-with-resources
        try (FileInputStream in = new FileInputStream("source.txt");
             FileOutputStream out = new FileOutputStream("dest.txt")) {
            int data;
            while ((data = in.read()) != -1) { // Read from source
                out.write(data); // Write to destination
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            // Handle file input/output failures
            System.out.println("File operation error: " + e.getMessage());
        }
    }
}
