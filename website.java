import java.util.Scanner;
public class website{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the url of your website");
        String url = sc.nextLine();
        if(url.endsWith(".com")){
            System.out.println("this is a commercial website");
        }
        else if(url.endsWith(".org")){
            System.out.println("this is an organixational website");
        }
        else if(url.endsWith(".in")){
            System.out.println("this is an indian website");
        }
        else{
            System.out.println("this is not a known website");
        }
    }
}