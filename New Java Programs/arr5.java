//sum of even and odd numbers in an array
public class arr5 {
    public static void main(String args[]){
        int[] arr7 = {12,34,56,67,78,21,23,95,90};
        int evensum = 0;
        int oddsum = 0;
        for(int i = 0;i<arr7.length;i++){
            if(arr7[i]!=0 && arr7[i]%2==0){
                evensum+=arr7[i];
            }else{
                oddsum+=arr7[i];
            }
        }
        System.out.println("Number of even numbers"+" "+evensum);
        System.out.println("Number of odd numbers "+" "+oddsum);   
}
}