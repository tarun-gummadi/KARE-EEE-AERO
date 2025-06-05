//Multiple Inheritance using interface
public class interfaces{
    public static void main(String[] args) {
        aud dk = new aud();
        dk.run();
        dk.bik();
        dk.walk();
    }   
}
interface Fourwheeling{
    public abstract void run();
}
interface Twowheel{
    public abstract void bik();
}
class aud implements Fourwheeling,Twowheel{
    public void run(){
        System.out.println("This will run");
    }
    public void bik(){
        System.out.println("This is bike");
    }
    public void walk(){
        System.out.println("This will walk");
    }
}