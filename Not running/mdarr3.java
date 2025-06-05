//to get anti diagonal elements in an md array
import java.util.Scanner;
public class mdarr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number dimension of the matrix:"+" ");
        int s1 = sc.nextInt();
        int [][] arr18 = new int[s1][s1];
        for(int i = 0;i<s1;i++){
            for(int j = 0;j<s1;j++){
                System.out.println("Enter the"+i+","+j+"value:"+" ");
                arr18[i][j]=sc.nextInt();
            }
        }
        for(int k = 0;k<s1;k++){
            for(int j = 0;j<s1;j++){
                System.out.print(arr18[k][j]);
                System.err.print(" ");
            }
            System.out.println();      
        }
        System.out.println("Anti-diagonal elements:");
        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s1; j++) {
                if (i + j == s1 - 1) {
                    System.out.print(arr18[i][j] + " ");
                }
            }System.out.println();
        }    sc.close(); 
        }       
    }