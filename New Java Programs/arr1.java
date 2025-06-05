//arrays using different method and for loop and int values
import java.util.Scanner;
public class arr1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];//stores 5 values
        arr1[0]=35;
        arr1[1]=45;
        arr1[2]=55;
        arr1[3]=65;
        arr1[4]=75;
        System.out.println(arr1[0]);//produces values at 0th index
        int[] arr2 = {11,22,33,44,55};
        System.out.println(arr2[4]);
        arr2[3] = 66;
        int[] arr3 = new int[6];
        for(int i = 0;i<6;i++){
            System.out.println("Enter the"+" "+(i+1)+"value:"+" ");
            arr3[i]= sc.nextInt();
        }
        System.out.println("These are the values you entered:");
        for(int i=0;i<6;i++){
            System.out.print(arr3[i]);
            System.out.print(",");
        }
        int[] arr4 = new int[3];
        char[] arr5 = new char[5];
        System.out.println(" ");
        System.out.println(arr4.length);
        System.out.println(arr5.length);
        sc.close();

    }
    
}
/*35
55
Enter the 1value:
12
Enter the 2value: 
34
Enter the 3value: 
56
Enter the 4value: 
78
Enter the 5value: 
90
Enter the 6value: 
54
These are the values you entered:
12,34,56,78,90,54,*/