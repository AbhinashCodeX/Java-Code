import java.util.Scanner;

// Custom Exception
class InvalidAgeExceptions extends Exception {
    public InvalidAgeExceptions(String message) {
        super(message);
    }
}

public class Ex2 {

    // Age validation method
    static void checkAge(int age) throws InvalidAgeExceptions {
        if (age < 18) {
            throw new InvalidAgeExceptions("Age must be 18 or older");
        } else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First input
        try {
            System.out.print("Enter first age: ");
            int age1 = sc.nextInt();
            checkAge(age1);
        } catch (InvalidAgeExceptions e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Second input
        try {
            System.out.print("Enter second age: ");
            int age2 = sc.nextInt();
            checkAge(age2);
        } catch (InvalidAgeExceptions e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        sc.close();
    }
}

