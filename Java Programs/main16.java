//counting and printing the sum of odd numbers upto given natural numbers
import java.util.Scanner;
public class main16 {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a;
            int sumCount=0;
            System.out.println("Enter the number:");
            a = sc.nextInt();
            for(int i=1;i<=a;i++){
                if(i%2!=0){//change to i%2==0 if want for sum of even numbers
                    sumCount = sumCount+i; 
                }
            }
            System.out.println("Total"+" "+sumCount);
        }
    }
}
