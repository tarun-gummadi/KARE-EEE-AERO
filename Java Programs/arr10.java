//reversing the elements in one array and copy to another array
public class arr10 {
    public static void main(String[] args) {
        int[] arr11={23,44,55,76,98,12};
        int[] arr12 = new int[arr11.length];
        for(int i = arr11.length - 1;i>=0;i--){
            arr12[i] = arr11[i];
            System.out.println(arr12[i]);
        }
    }   
}