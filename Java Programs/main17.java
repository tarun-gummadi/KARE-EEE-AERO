//factorial of a number
import java.util.Scanner;
public class main17 {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int b;
            int fact=1;
            System.out.println("Give the number:");
            b=sc.nextInt();
            for(int i=1;i<=b;i++){
                fact=fact*i;
            }
            System.out.println("The factorial is"+" "+fact);
        }
    }
}
