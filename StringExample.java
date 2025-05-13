public class StringExample {
    public static void main(String[] args) {
        char[] name = {'D', 'i', 'a', 'b', 'l', 'o'};
        String welcomeMsg = new String(name);  
        System.out.println("Welcome " + welcomeMsg);
    }
}