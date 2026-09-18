/*
 * Name: N V Edwin
 * Register No: 25PMC143
 * College: Marian College Kuttikanam (Autonomous)
 * Department: MCA
 */
// Level 1 – Built-in Exceptions: 1. Division by Zero
import java.util.Scanner;

public class DivisionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt(); // Read input
            System.out.print("Enter denominator: ");
            int den = sc.nextInt();
            
            int result = num / den; // Perform division
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Cannot divide by zero.");
        }
        sc.close();
    }
}