//getting 5 numbers from user using for loop and printing number of even and odd numbers
import java.util.Scanner;
public class main11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int number = input.nextInt();

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        input.close();
    }
}
