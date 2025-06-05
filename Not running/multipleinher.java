//Multiple Inheritance using abstract class
public class multipleinher {
    public static void main(String[] args) {
        duke dk = new duke();
        dk.run();
        dk.bike();
        dk.walk();
    }   
}
abstract class fourwheeling{
    public abstract void run();
}
abstract class twowheelers{
    public abstract void bike();
}
class duke extends fourwheeling{//,twowheel{//so even with this method we cannot implement multiple inheritance without,twowheeler{ you can run it.
    public void run(){
        System.out.println("This will run");
    }
    public void bike(){
        System.out.println("This is bike");
    }
    public void walk(){
        System.out.println("This will walk");
    }
}