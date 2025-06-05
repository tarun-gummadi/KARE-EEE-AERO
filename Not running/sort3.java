//finding second largest number in an array
public class sort3 {
    public static void main(String[] args) {
    int[] arr14 = {36,7,19,84,84,43,45,50,50,90,88,29};
    int max = arr14[0];
    int secondMax = arr14[0];
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
        if (arr14[i] > max){
            secondMax = max;
            max = arr14[i];
        }
        else if (arr14[i]>secondMax && arr14[i] != max){
            secondMax = arr14[i];
        }
    }
    if(secondMax == arr14[0]){
        System.out.println("There is no second largest number");
    }
    else{
        System.out.println("The second largest number is:"+" "+secondMax);
    }   
}
}