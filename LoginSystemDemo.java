/*
 * Name: N V Edwin
 * Register No: 25PMC143
 * College: Marian College Kuttikanam (Autonomous)
 * Department: MCA
 */
// Level 6 – Comprehensive Exercises: 27. Login System
import java.util.Scanner;

class InvalidLoginException extends Exception {
    public InvalidLoginException(String msg) { super(msg); }
}

public class LoginSystemDemo {
    public static void login(String user, String pass) throws InvalidLoginException {
        if (!"admin".equals(user) || !"marian123".equals(pass)) {
            throw new InvalidLoginException("Incorrect username or password.");
        }
        System.out.println("Login Successful! Welcome to Marian System.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();
        try {
            login(username, password);
        } catch (InvalidLoginException e) {
            System.out.println("Authentication Error: " + e.getMessage());
        }
        sc.close();
    }
}