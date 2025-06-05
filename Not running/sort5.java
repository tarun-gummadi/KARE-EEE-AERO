//sir code for second largest element in an array
public class sort5 {
    public static void main(String[] args) {
        int[] arr14 = {36,7,19,84,84,43,45,50,50,90,89,88,29};
        int temp;
        for(int i =0;i<arr14.length;i++){
            for(int j =i+1;j<arr14.length;j++){
                if(arr14[i]>arr14[j]){
                    temp = arr14[i];
                    arr14[i]=arr14[j];
                    arr14[j]=temp;
                }
            }
        }
        int count = 0;
        int max = arr14[arr14.length-1];
        for(int i =0;i<arr14.length;i++ ){
            if(max == arr14[i]){
                count++;
            }
        }
        if(count == 1){
            System.out.println("The Second Largest:"+" "+arr14[arr14.length-2]);
        }
        else if(count>1){
            System.out.println("The Second Largest is"+" "+arr14[arr14.length-2]);
        }
        else{
            System.out.println("The Program ends");

        }
    }
    
}
