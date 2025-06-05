//three numbers that produces sum when added
import java.util.Scanner;
public class sort8 {
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
                for(int a = k+1;a < arraysize;a++){
                    if(arr15[j]+arr15[k]+arr15[a] == sum){
                    count+=3;
                    System.out.println(arr15[j]+"+"+arr15[k]+"+"+arr15[a]);
                }
            }
            }
        }
        System.out.println("Array has"+" "+count+" "+"pairs of elements with sum of"+" "+sum);
        sc.close();   
    }
    
}
