import java.util.Scanner;
public class Incometax {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the income");
    float income = sc.nextInt();
    if(income < 250000){
        System.out.println("no tax applicable");
    }
    else if(income >= 250000 && income < 500000){
        System.out.println(" tax of 5% is applicable");
    }
    else if( income >= 500000 && income < 1000000){
        System.out.println("tax of 20% is payble");
    }
    else{
        System.out.println("tax of 30% is applicable");
    }
  }
    
}
