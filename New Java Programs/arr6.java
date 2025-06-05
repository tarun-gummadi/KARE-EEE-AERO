//to get index by element in array
import java.util.Scanner;
public class arr6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr8 = {12,34,56,67,78,21,23,95,90};
        System.out.println("Enter the element you want the index of:");
        int num = sc.nextInt();
        for(int i = 0;i<arr8.length;i++){
        if(num == arr8[i]){
            System.out.println("The given number is in this index"+" "+i);
        }
        }sc.close();
    }  
}