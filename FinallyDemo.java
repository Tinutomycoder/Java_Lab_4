
import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("Square: " + (num * num));
        } catch (Exception e) {
            System.out.println("Error: Invalid input format.");
        } finally {
            // This always runs
            System.out.println("Closing Scanner resources.");
            sc.close();
        }
    }
}
