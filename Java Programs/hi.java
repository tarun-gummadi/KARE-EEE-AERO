//largest number among three numbers without getting from user
public class hi {
    public static void main(String args[])
    {
        int a = 53;
        int b = 35;
        int c = 40;

        if (a>b) {
            if (a>c) {
                System.out.println(a+" "+"is the largest number");
            }
        }else if (b>a){
            if (b>c){
                System.out.println(b+" "+"is the largest number");
            }
        }else {
            System.out.println(c+" "+"is the largest number");
        }
    }
    
}
