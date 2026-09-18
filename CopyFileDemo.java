/*
 * Name: N V Edwin
 * Register No: 25PMC143
 * College: Marian College Kuttikanam (Autonomous)
 * Department: MCA
 */
// Level 2 – File Handling Exceptions: 8. Copy a File
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