//sir code for second smallest element in an array
public class sort6 {
    public static void main(String[] args) {
        int[] arr14 = {36,7,19,84,84,43,45,50,50,90,88,29};
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
        int min = arr14[0];
        for(int i =0;i<arr14.length;i++ ){
            if(min == arr14[i]){
                count++;
            }
        }
        if(count == 1){
            System.out.println("The Second Smallest is:"+" "+arr14[count]);
        }
        else if(count>1){
            System.out.println("The Second Smallest is"+" "+arr14[count]);
        }
        else{
            System.out.println("The Program ends");

        }
    }
    
}
