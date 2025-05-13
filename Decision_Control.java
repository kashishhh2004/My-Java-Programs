import java.util.Scanner;
public class Decision_Control {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int Subject1, Subject2, Subject3;
        System.out.println("Enter marks of Subject 1");
        Subject1 = sc.nextInt();
        System.out.println("Enter marks of subject 2");
        Subject2 = sc.nextInt();
        System.out.println("enter marks of subject 3");
        Subject3 = sc.nextInt();
        float total = Subject1 + Subject2 + Subject3;
        float totalpercentage = (total/300)*100;
       
        System.out.println("total marks are:" + total);
        System.out.println("percentage is:" + totalpercentage + "%");
        if(totalpercentage >= 40){
            System.out.println("you are pass");
        }
        else{
            System.out.println("you are fail");
        }
        float subject1percentage = (float)(Subject1/100.0)*100;
        float subject2percentage = (float)(Subject2/100.0)*100;
        float subject3percentage = (float)(Subject3/100.0)*100;
        System.out.println("Subject 1 percentage is :" + subject1percentage + "%");
        System.out.println("Subject 2 percentage is :" + subject2percentage + "%");
        System.out.println("Subject 3 percentage is :" + subject3percentage + "%");
        if(subject1percentage >= 33 && subject2percentage >= 33 && subject3percentage >= 33 && totalpercentage >= 40){
            System.out.println("you are pass in all subjects");
        }
        else{
            System.out.println("you are fail in one or more subjects");
        }

    }
    
}
