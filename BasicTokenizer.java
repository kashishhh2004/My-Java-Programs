public class BasicTokenizer {
    public static void main(String[] args) {
        // Long input string
        String text = "hello my name is kashish, i am from cse department second year. this is my java program";

        // Split the string by space
        String[] tokens = text.split(" ");

        // Display each token
        System.out.println("Tokens:");
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
