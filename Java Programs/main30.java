//Single level inheritance
public class main30{
    public static void main(String args[]){
        ben bz = new ben();
        bz.vehicles();
        bz.costs();
    }
}
class vehicle{
    public void vehicles(){
        System.out.println("Car has four wheels");
    }
}
class ben extends vehicle{
    public void costs(){
        System.out.println("This is the costliest");
    }
}