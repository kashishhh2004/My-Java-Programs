import java.util.Scanner;
public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_num;
        int num = 5;
        System.out.println("enter number entered by user");
        user_num = sc.nextInt();
        String res;
        res = (num > user_num)?"number greater then user entered number" : "number less then user entered number";
        System.out.println(res);
    }
    
}
