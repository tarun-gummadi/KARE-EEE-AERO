//Real Scenario problem
import java.util.Scanner;
public class sort9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Input");
        }
        int[] age = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("Enter the age"+" ");
            age[i]= sc.nextInt();
            if(age[i]>0){
                continue;
            }else if(age[i]<=0){
                System.out.println("Invalid Input");
                System.out.println("Enter a valid age");
            }
        }
        int min = age[0];
        int max = age[n-1];
        for(int i =0;i<n;i++){
        int temp;
        for(int j = i+1;j<n;j++){
            if(age[i]>age[j]){
                temp = age[i];
                age[i] = age[j];
                age[j] = temp;
            }
        }
    }
    for(int k = 0;k<n;k++){
        System.out.println(age[k]);
    }
    for(int s = 0;s<n;s++){
        if(age[s]>max){
            max = age[s];
        }
        if(age[s]<min){
            min = age[s];
        }
    }
    System.out.println("No.of old people "+" "+max);
    System.out.println("No.of Younger people"+" "+min);
    sc.close();
    }
    
}
