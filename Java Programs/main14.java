//cube of number given by user
import java.util.Scanner;
public class main14 {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a;
            System.out.println("Enter the value of integer: ");
            a = sc.nextInt();
            for (int i=1;i<=a;i++){
                System.out.println(i*i*i);
            }
        }

    }

    
}
