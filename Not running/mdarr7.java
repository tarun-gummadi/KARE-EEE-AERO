//maximum element in a each row of a md array
import java.util.Scanner;

public class mdarr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int s1 = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int s2 = sc.nextInt();
        int[][] arr18 = new int[s1][s2];
        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s2; j++) {
                System.out.print("Enter value at [" + i + "][" + j + "]: ");
                arr18[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nThe entered matrix is:");
        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s2; j++) {
                System.out.print(arr18[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maximum elements in each row:");
        for (int i = 0; i < s1; i++) {
            int max = arr18[i][0]; 
            for (int j = 1; j < s2; j++) {
                if (arr18[i][j] > max) {
                    max = arr18[i][j];
                }
            }
            System.out.println("Row " + i + " max: " + max);
        }

        sc.close();
    }
}
