//calculating SI using class concept
import java.util.Scanner;
public class main29 {
    public static void main(String[] args){
        Simple ab = new Simple();
        try (Scanner sc = new Scanner(System.in)) {
            int P,N,R;
            System.out.println("Enter Principle Interest:");
            P = sc.nextInt();
            System.out.println("Enter Number of years:");
            N = sc.nextInt();
            System.out.println("Enter Rate of interest:");
            R = sc.nextInt();
            ab.Simples(P,N,R);
        }
    } 
}
class Simple{
    public void Simples(int P,int N,int R){
        System.out.println(((P*N*R)/100)+" "+"is the simple interest");
    }
}
