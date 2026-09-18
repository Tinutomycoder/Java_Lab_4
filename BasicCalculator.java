
import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int n1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int n2 = sc.nextInt();
            System.out.print("Enter operation (/, *): ");
            char op = sc.next().charAt(0);

            if (op == '/') {
                System.out.println("Result: " + (n1 / n2)); // Potential ArithmeticException
            } else if (op == '*') {
                System.out.println("Result: " + (n1 * n2));
            } else {
                System.out.println("Unsupported Operator.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numbers only.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Math error occurred. Check divisor.");
        }
        sc.close();
    }
}
