//checking whether the given number is odd or even by getting input from user and print number of even and odd numbers
import java.util.Scanner;
public class main10 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        int even = 0;
        int odd = 0;
        int a,b,c,d,e;
        System.out.println("Enter your first number");
        a = sc.nextInt();
        System.out.println("Enter your second number");
        b = sc.nextInt();
        System.out.println("Enter your third number");
        c = sc.nextInt();
        System.out.println("Enter your fourth number");
        d = sc.nextInt();
        System.out.println("Enter your fifth number");
        e = sc.nextInt();

        if (a != 0 && a % 2 ==0){
            even++;
        }else{
            odd++;
        }

        if (b != 0 && b % 2 ==0){
            even++;
        }else{
            odd++;
        }

        if (c != 0 && c % 2 ==0){
            even++;
        }else{
            odd++;
        }

        if (d != 0 && d % 2 ==0){
            even++;
        }else{
            odd++;
        }

        if (e != 0 && e % 2 ==0){
            even++;
        }else{
            odd++;
        }

        System.out.println("Number of even numbers in given is"+" "+even);
        System.out.println("Number of odd numbers in given is"+" "+odd);
        }
    }

    
}
