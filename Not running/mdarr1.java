//multi dimensional array and to print diagonal elements
import java.util.Scanner;
public class mdarr1 {
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
        for(int k = 0;k<s1;k++){
            for(int j = 0;j<s2;j++){
                if(k==j){
                    System.out.print(arr18[k][j]);
                    System.out.print(" ");
                }
            }
            System.out.println();      
        }sc.close();
            
    }
        
}