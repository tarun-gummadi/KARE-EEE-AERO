//sorting of array in ascending and descending order
import java.util.Scanner;
public class sort1 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int[] arr14 = {36,7,19,84,43,29};
    for(int i =0;i<arr14.length;i++){
        int temp;
        for(int j = i+1;j<arr14.length;j++){
            if(arr14[i]>arr14[j]){//if instead of > you used < you will get sorted in descending order
                temp = arr14[i];
                arr14[i] = arr14[j];
                arr14[j] = temp;
            }
        }
    }
    for(int k = 0;k<arr14.length;k++){
        System.out.println(arr14[k]);
    }sc.close();
}
}