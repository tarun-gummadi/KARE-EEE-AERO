//Placement question
//a super class having n number of child class
import java.util.Scanner;
public class main33 {
    public static void main(String args[]){
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter 0 for Circle and 1 for square:");
                int num = sc.nextInt();
                Circle ci = new Circle();
                Square sq = new Square();
                if(num == 0){
                    System.out.println("Enter Radius of circle:");
                    int r = sc.nextInt();
                    ci.getperimeter(r);
                    ci.getarea(r);
                }
                else if(num == 1){
                    System.out.println("Enter side of square:");
                    int a = sc.nextInt();
                    sq.getperimeter(a);
                    sq.getarea(a);
                }
                else{
                    System.out.println("Invalid input");
                }
            }
    }
}
class Shape{
    public void diff(){  
        System.out.println("We have different Shapes");  
    }
}
class Circle extends Shape{
    public void getperimeter(int r){
        double peri = (2*3.14*r);
        System.out.println("Perimeter of Circle ="+" "+peri);
    }
    public void getarea(int r){
        double area = (3.14*r*r);
        System.out.println("Area of Circle ="+" "+area);
    }
}
class Square extends Shape{
    public void getperimeter(int a){
        double peri =  (4 * a);
        System.out.println("Perimeter of Square ="+" "+peri);
    }
    public void getarea(int a){
        double area = (a*a);
        System.out.println("Area of Square ="+" "+area);
    }
}