//getting the grade of a student
import java.util.Scanner;
public class main8 {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a;
            System.out.println("Enter your Mark:");
            a = sc.nextInt();

            if (a>90) {
                System.out.println("You have obtained A grade");  
            }else if (a>80 && a<=90){
                System.out.println("You have obtained B grade");
            }else if (a>70 && a<=80){
                System.out.println("You have obtained C grade");
            }else if (a>=60 && a<=70){
                System.out.println("You have obtained D grade");
            }else {
                System.out.println("You have Failed in this exam");
            }
        }
    }
}