//declaring the values and finding the largest number
public class main7 {
    public static void main(String args[])
    {
        int a = 24;
        int b = 35;
        int c = 53;

        if (a>b) {
            if (a>c) {
                System.out.println(a+" "+"is the largest number");
            } else {
                System.out.println(c+" "+"is the largest number");
            }
        } else if (b>a){
            if (b>c) {
                System.out.println(b+" "+"is the largest number");
            }else {
                System.out.println(c+" "+"is the largest number");
            }
        }
    
}
}
