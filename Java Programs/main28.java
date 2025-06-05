//finding the smallest number by using class concept
import java.util.Scanner;
public class main28 {
    public static void main(String[] args){
        Small ab = new Small();
        try (Scanner sc = new Scanner(System.in)) {
            int a,b,c;
            System.out.println("Enter first number:");
            a = sc.nextInt();
            System.out.println("Enter Second number:");
            b = sc.nextInt();
            System.out.println("Enter Third number:");
            c = sc.nextInt();
            ab.Smalls(a,b,c);
        }
    } 
}
class Small{
    public void Smalls(int a,int b,int c){
        if(a<b && a<c){
            System.out.println(a+" "+"is the smallest");
        }else if(b<a && b<c){
            System.out.println(b+" "+"is the smallest");
        }else if(c<a && c<b) {
            System.out.println(c+" "+"is the smallest");
        }else{
            System.out.println("Invalid Input");
        }
    }
}
