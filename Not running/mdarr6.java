//to print upper and lower triangle of the md array
import java.util.Scanner;
public class mdarr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        int[][] arr19 = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.println("Enter the "+i+","+j+" value=");
                arr19[i][j] = sc.nextInt();
            }
            
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i<=j){//use i>=j for printing lower traingle
                    System.out.print(arr19[i][j]+" ");
                }else{
                    System.out.print("");
                }
            }System.out.println();
        }
        sc.close();
    }
    
}
