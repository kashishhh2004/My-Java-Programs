import java.util.Scanner;

// Custom exception class
class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}

public class CustomExceptionWithInput {

    // Method that throws custom exception
    public static void checkAge(int age) throws AgeNotValidException {
        if (age < 18) {
            // throw keyword used to manually throw exception
            throw new AgeNotValidException("Age is not valid for voting.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // for input

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt(); // user input

            // try block to check for exception
            checkAge(age);

        } catch (AgeNotValidException e) {
            // catch block to handle the custom exception
            System.out.println("Caught Exception: " + e.getMessage());
        } catch (Exception e) {
            // optional: catch other unexpected exceptions
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            // finally block always runs
            System.out.println("Voting eligibility check complete.");
            scanner.close(); // closing the scanner
        }
    }
}
