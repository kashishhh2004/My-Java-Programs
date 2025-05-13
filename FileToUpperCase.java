import java.io.*;

public class FileToUpperCase {
    public static void main(String[] args) {
        String filePath = "FileSample.txt"; // Change this to your file name

        try {
            // Step 1: Read the file content
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line.toUpperCase()).append("\n");
            }
            reader.close();

            // Step 2: Write the uppercase content back to the same file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(content.toString());
            writer.close();

            System.out.println("File content converted to uppercase successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
