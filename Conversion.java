import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num;
        System.out.println("Enter num in kilometer");
        num = sc.nextFloat();
        float miles;
        miles = num * 0.621371f;
        System.out.println("following conversion is " + num +"  is equal to " + miles + " miles");
    }
    
}
