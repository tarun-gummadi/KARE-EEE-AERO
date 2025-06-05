//count number of even and odd numbers in array
public class arr4 {
    public static void main(String args[]){
        int[] arr7 = {12,34,56,67,78,21,23,95,90};
        int even = 0;
        int odd = 0;
        for(int i = 0;i<arr7.length;i++){
            if(arr7[i]!=0 && arr7[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Number of even numbers"+" "+even);
        System.out.println("Number of odd numbers "+" "+odd);   
}}