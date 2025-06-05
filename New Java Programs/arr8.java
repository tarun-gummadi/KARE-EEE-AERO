//copy of array elements from one array to another
public class arr8 {
    public static void main(String[] args) {
        int[] arr9={23,44,55,76,98,12};
        int[] arr10 = new int[arr9.length];
        for(int i = 0;i<arr9.length;i++){
            arr10[i] = arr9[i];
            System.out.println(arr10[i]);
        }

    }
    
}
