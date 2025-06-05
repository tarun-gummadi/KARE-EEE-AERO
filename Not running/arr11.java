//unique elements from array.
public class arr11{
    public static void main(String[] args) {
        int[] arr13={12,34,12,34,23,23,34,56,67};
        for (int i=0;i<arr13.length;i++){
            int count = 0;
            for(int j=0;j<arr13.length;j++){
                if(arr13[i] == arr13[j]){
                count++;
            }
            }
            if(count == 1){
                System.out.println("The Unique elements are:"+" "+arr13[i]+" ");
            }else if(count > 1){
                System.out.println("The Duplicate elements are:"+" "+arr13[i]+" ");
            }
    }
}
}
//if the else condition is removed this program is for unique elements