//creating a class other than main and calling it
public class main26 {
    public static void main(String[] args) {
        Car ab = new Car();
        ab.run();
    }
    
}
class Car{
    public void run(){
        System.out.println("This is not a main class");
    }
}
