//largest among three numbers getting input from user
import java.util.Scanner;

public class main6 {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a,b,c;
            System.out.println("Enter first number");
            a = sc.nextInt();
            System.out.println("Enter second number");
            b = sc.nextInt();
            System.out.println("Enter third number");
            c = sc.nextInt();

            if(a>b && a>c){
                System.out.println("First number is largest");
            }else if (b>a && b>c){
                System.out.println("Second number is largest");
            }else if (c>a && c>b){
                System.out.println("Third number is largest");
            }else if (a==b && b==c){
                System.out.println("All the given numbers are equal");
            }else {
                System.out.println("Invalid input given by user");
            }
        }

    }
    
}
