//duplicate elements from array.
public class arr12 {
    public static void main(String[] args) {
        System.out.println("Duplicate elements are:"+" ");
        int[] arr13={12,12,12,23,34,34,56,67,67,90,110,110};
        for (int i=0;i<arr13.length;i++){
            int count = 0;
            for(int j=0;j<arr13.length;j++){
                if(arr13[i] == arr13[j]){
                count++;
            }
            }
            int seen = 0;
            for(int k = 0;k<i;k++){
                if(arr13[k]==arr13[i]){
                    seen = 1;
                    break;
                }
            }
            if(count > 1 && seen == 0){
                System.out.print(arr13[i]+" ");
            } 
    }
    }
}
