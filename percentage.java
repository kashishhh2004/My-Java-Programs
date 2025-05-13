import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int math, phy, chem, bio, eng;
        System.out.println("Enter math marks");
        math = sc.nextInt();
        System.out.println("Enter physics marks");
        phy = sc.nextInt();
        System.out.println("Enter chemistry marks");
        chem = sc.nextInt();
        System.out.println("Enter biology marks");
        bio = sc.nextInt();
        System.out.println("Enter english marks");
        eng = sc.nextInt();

        double total;
        total = math + phy + chem + bio + eng;
        double p = total / 500;
        double percentage = p * 100;

        System.out.println("Marks in math = " + math);
        System.out.println("Marks in physics = " + phy);
        System.out.println("Marks in chemistry = " + chem);
        System.out.println("Marks in biology = " + bio);
        System.out.println("Marks in english = " + eng);

        System.out.println("Your percentage is " + percentage + "%");
    }
}