//average of array values
public class arr3 {
    public static void main(String args[]){
        int[] arr6 = {12,34,56,67,78,21,23,95,90};
        double sum =0;
        for(int i = 0;i<arr6.length;i++){
            sum += arr6[i];  
        }
        System.out.println("Total:"+sum);
        System.out.println("Average:"+(sum/arr6.length));
    }
    
}