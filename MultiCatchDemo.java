/*
 * Name: N V Edwin
 * Register No: 25PMC143
 * College: Marian College Kuttikanam (Autonomous)
 * Department: MCA
 */
// Level 1 – Built-in Exceptions: 4. Multiple Exception Handling
import java.util.Scanner;

public class MultiCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30};
        try {
            System.out.print("Enter array index (0-2): ");
            int index = sc.nextInt(); // Read index
            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt(); // Read divisor
            
            int result = numbers[index] / divisor; // Core operation
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle invalid index
            System.out.println("Error: Invalid array index.");
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        }
        sc.close();
    }
}