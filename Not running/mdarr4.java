//sum of the even numbers and odd numbers
import java.util.Scanner;
public class mdarr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:"+" ");
        int s1 = sc.nextInt();
        System.out.println("Enter number of column:"+" ");
        int s2 = sc.nextInt();
        int [][] arr18 = new int[s1][s2];
        for(int i = 0;i<s1;i++){
            for(int j = 0;j<s2;j++){
                System.out.println("Enter the"+i+","+j+"value:"+" ");
                arr18[i][j]=sc.nextInt();
            }
        }
        for(int k = 0;k<s1;k++){
            for(int j = 0;j<s2;j++){
                System.out.print(arr18[k][j]);
                System.err.print(" ");
            }
            System.out.println();      
        }
        int count = 0;
        int sum = 0;
        for(int k = 0;k<s1;k++){
            for(int j = 0;j<s2;j++){
                if(arr18[k][j]%2==0){
                    count+=arr18[k][j];
                }else{
                    sum+=arr18[k][j];
                    
                }
            }      
        }
        System.out.println("The sum of odd numbers in this array is "+sum);
        System.out.println("The sum of even numbers in this array is "+count);
        sc.close();
            
    }
        
}
