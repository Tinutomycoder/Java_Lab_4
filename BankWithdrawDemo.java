/*
 * Name: N V Edwin
 * Register No: 25PMC143
 * College: Marian College Kuttikanam (Autonomous)
 * Department: MCA
 */
// Level 3 – Throw and Throws: 15. Bank Withdrawal
import java.util.Scanner;

public class BankWithdrawDemo {
    // Ducking the checked exception up the call stack
    public static void withdraw(double balance, double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient balance available.");
        }
        System.out.println("Withdrawal successful! Remaining: $" + (balance - amount));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.00;
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        try {
            withdraw(balance, amount); // Must be guarded by try-catch
        } catch (Exception e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }
        sc.close();
    }
}