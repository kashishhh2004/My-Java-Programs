import java.io.*;
import java.util.*;

public class SimpleFileSorter {
    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        ArrayList<String> lines = new ArrayList<>();

        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }

        Collections.sort(lines);

        System.out.println("Sorted lines:");
        for (String line : lines) {
            System.out.println(line);
        }

        sc.close();
    }
}

