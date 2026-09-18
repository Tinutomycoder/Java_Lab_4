/*
 * Name: N V Edwin
 * Register No: 25PMC143
 * College: Marian College Kuttikanam (Autonomous)
 * Department: MCA
 */
// Level 2 – File Handling Exceptions: 6. Open a File
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenFileDemo {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            // Attempt to open and read file
            Scanner fileScanner = new Scanner(file);
            System.out.println("File opened successfully.");
            fileScanner.close();
        } catch (FileNotFoundException e) {
            // Handle missing file
            System.out.println("Error: The file test.txt does not exist.");
        }
    }
}