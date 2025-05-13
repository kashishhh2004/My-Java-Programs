import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try {
            // Create BufferedReader object to read input from the console
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Ask user to enter something
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            // Display the input
            System.out.println("Hello, " + name + "!");

        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        }
    }
}
