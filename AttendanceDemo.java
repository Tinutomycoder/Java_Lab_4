
import java.util.Scanner;

class LowAttendanceException extends RuntimeException {
    public LowAttendanceException(String message) {
        super(message);
    }
}

public class AttendanceDemo {
    public static void checkAttendance(double percentage) {
        if (percentage < 75.0) {
            throw new LowAttendanceException("Attendance is below 75%. Not allowed for exams.");
        }
        System.out.println("Hall ticket generated successfully.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter attendance percentage: ");
        double att = sc.nextDouble();
        try {
            checkAttendance(att);
        } catch (LowAttendanceException e) {
            System.out.println("Status: " + e.getMessage());
        }
        sc.close();
    }
}
