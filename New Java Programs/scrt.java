//last question
import java.util.Scanner;
public class scrt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter C for Circle, S for Square, T for Triangle, and R for Rectangle:");
        char num = sc.nextLine().charAt(0);

        if (num == 'S' || num == 's') {
            System.out.println("You are directed to calculate area and perimeter of Square");
            System.out.print("Enter side of square: ");
            int s = sc.nextInt();
            square se = new square();
            se.peri(s);
            se.area(s);
        } else if (num == 'C' || num == 'c') {
            System.out.println("You are directed to calculate area and perimeter of Circle");
            System.out.print("Enter radius of circle: ");
            int r = sc.nextInt();
            circle ce = new circle();
            ce.peri(r);
            ce.area(r);
        } else if (num == 'R' || num == 'r') {
            System.out.println("You are directed to calculate area and perimeter of Rectangle");
            System.out.print("Enter length of rectangle: ");
            int l = sc.nextInt();
            System.out.print("Enter width of rectangle: ");
            int w = sc.nextInt();
            rectangle re = new rectangle();
            re.peri(l, w);
            re.area(l, w);
        } else if (num == 'T' || num == 't') {
            System.out.println("You are directed to calculate area and perimeter of Triangle");
            System.out.print("Enter base of triangle: ");
            int b = sc.nextInt();
            System.out.print("Enter base and height of triangle: ");
            int h = sc.nextInt();
            System.out.print("Enter other first side of triangle: ");
            int side2 = sc.nextInt();
            System.out.print("Enter other second side of triangle: ");
            int side3 = sc.nextInt();
            triangle te = new triangle();
            te.peri(b, side2, side3);
            te.area(b, h);
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
abstract class shape{
    public abstract void peri(int x);
    public abstract void area(int x);
}
abstract class shape1{
    public abstract void peri(int x,int y);
    public abstract void area(int x,int y);
}
abstract class shape2{
    public abstract void peri(int x,int y,int z);
    public abstract void area(int x,int y);
}
class circle extends shape {
    public void peri(int r) {
        double peri = 2 * 3.14 * r;
        System.out.println("Perimeter of Circle = " + peri);
    }

    public void area(int r) {
        double area = 3.14 * r * r;
        System.out.println("Area of Circle = " + area);
    }
}

class square extends shape {
    public void peri(int s) {
        int peri = 4 * s;
        System.out.println("Perimeter of Square = " + peri);
    }

    public void area(int s) {
        int area = s * s;
        System.out.println("Area of Square = " + area);
    }
}

class rectangle extends shape1{
    public void peri(int l,int w) {
        int peri = 2 * (l * w);
        System.out.println("Perimeter of Rectangle = " + peri);
    }

    public void area(int l, int w) {
        int area = l * w;
        System.out.println("Area of Rectangle = " + area);
    }
}

class triangle extends shape2{
    public void peri(int a, int b, int c) {
        int peri = a + b + c;
        System.out.println("Perimeter of Triangle = " + peri);
    }
    public void area(int base, int height) {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);
    }
}