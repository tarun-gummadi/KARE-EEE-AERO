//cube of a number usin while loop
import java.util.Scanner;
public class main18 {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a;
            System.out.println("Enter the value of integer: ");
            a = sc.nextInt();
            int i =1;
            while (i<=a){
                System.out.println(i*i*i);
                i++;
            }
        }

    }

    
}
