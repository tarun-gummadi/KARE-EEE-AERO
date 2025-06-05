//multiplication table of a integer upto 10
import java.util.Scanner;
public class main15 {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a;
            System.out.println("Enter the number:");
            a = sc.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(a+"*"+i+"="+(a*i));
            }
        }
    }

    
}
