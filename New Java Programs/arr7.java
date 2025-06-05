//get index of repeated numbers in arrays and stop iterating when once found
import java.util.Scanner;
public class arr7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr9 = {12,34,34,56,67,67,78,21,21,23,95,90};
        System.out.println("Enter the element you want the index of:");
        int num = sc.nextInt();
        for(int i = 0;i<arr9.length;i++){
        if(num == arr9[i]){
            System.out.println("The given number is in this index"+" "+i);
            break;//you can also use return statement
        }
        }sc.close();
    }
}