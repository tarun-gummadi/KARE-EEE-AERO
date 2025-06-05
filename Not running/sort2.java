//finding largest and smallest number in an array
import java.util.Scanner;
public class sort2 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int[] arr14 = {36,7,19,84,43,29};
    int max = arr14[0];
    int min = arr14[0];
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
    }
    for(int i =0;i<arr14.length;i++){
        if(arr14[i]>max){
            max = arr14[i];
        }
        if(arr14[i]<min){
            min = arr14[i];
        }
    }
    System.out.println("Largest number in array"+" "+max);
    System.out.println("Smallest number in array"+" "+min);
    sc.close();
}
}
//If done with descending order sorting and finding smallest and largest value
/* if(arr14[i]<arr[j]){
temp = arr14[i];
                arr14[i] = arr14[j];
                arr14[j] = temp;
            }
        }
    }
    for(int k = 0;k<arr14.length;k++){
        System.out.println(arr14[k]);
    }
    System.out.println("Smallest number in an array is:"+arr14[arr14.length-1]);
    System.out.println("largest number in an array is:"+arr14[0]); * 
} */