//pairs that that produces sum when added
import java.util.Scanner;
public class sort7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraysize = sc.nextInt();
        int[] arr15 = new int[arraysize];
        for(int i = 0;i<arraysize;i++){
            System.out.println("Enter the"+" "+(i+1)+"value:"+" ");
            //System.out.print(" ");
            arr15[i]= sc.nextInt();
        }
        int sum = sc.nextInt();
        int count = 0;
        for(int j =0;j<arraysize;j++){
            for(int k = j+1;k<arraysize;k++){
                if(arr15[j]+arr15[k]==sum){
                    count+=2;
                }
            }
        }
        System.out.println("Array has"+" "+count+" "+"of elements with sum of"+" "+sum);
        sc.close();   
    }
    
}
