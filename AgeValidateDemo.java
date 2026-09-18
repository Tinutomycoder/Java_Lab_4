
import java.util.Scanner;

public class AgeValidateDemo {
    public static void checkAge(int age) {
        if (age < 18) {
            // Manually throw runtime exception
            throw new IllegalArgumentException("Age must be 18 or older to vote.");
        }
        System.out.println("Access granted. You are eligible to vote.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            checkAge(age); // Call validation
        } catch (IllegalArgumentException e) {
            System.out.println("Registration Rejected: " + e.getMessage());
        }
        sc.close();
    }
}
