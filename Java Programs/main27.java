//constructors here class and its method has same name.here i have used car for both the one.inorder not to show error i have used as Car and Cars
public class main27 {
    public static void main(String[] args){
        Cars ab = new Cars();
        ab.Car(2016);
    }
    
}
class Cars{
    int year;
    public void Car(){
        System.out.println("this is not a main class");
    }
    public void Car(int year){
        System.out.println(year);
    }
}
