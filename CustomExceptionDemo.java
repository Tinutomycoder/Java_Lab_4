/*
 * Name: N V Edwin
 * Register No: 25PMC143
 * College: Marian College Kuttikanam (Autonomous)
 * Department: MCA
 */
// Level 4 – User-Defined Exceptions: 16. Invalid Age Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Entered age is invalid.");
        }
        System.out.println("Valid age entered: " + age);
    }

    public static void main(String[] args) {
        try {
            checkEligibility(-5); // Perform validation test
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}