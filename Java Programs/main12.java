//leap year or not
import java.util.Scanner;
public class main12 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){;
        int a;
        System.out.println("Enter a year:");
        a = sc.nextInt();

        if(a % 4 == 0 && (a % 100 !=0 || (a % 100==0 && a % 400==0))){
            System.out.println("The given year is leap year");
        }else {
            System.out.println("The given number is not a leap year");
        }
    }
}
}