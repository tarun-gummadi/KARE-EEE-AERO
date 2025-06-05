//abstract class
public class main37 {
    public static void main(String[] args) {
        duke dk = new duke();
        dk.run();
        dk.walk();
    }
}
abstract class fourwheeling{
    public abstract void run();
}
class duke extends fourwheeling{
    public void run(){
        System.out.println("This will run");

    }
    public void walk(){
        System.out.println("It also has two wheels");
    }
}
