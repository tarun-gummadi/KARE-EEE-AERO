// polymorphism
public class poly {
    public static void main(String[] args) {
        fw ff = new fw();
        bmw bw = new bmw();
        benz bn = new benz(); 
        ff.sit();  // base class method
        bw.sit();  // overridden method in bmw
        bn.sit();  // overridden method in benz
    }   
}
class fw {
    public void sit() {
        System.out.println("This will run");
    }
}
class bmw extends fw {
    public void sit() {
        System.out.println("This will run from bmw");
    }
}
class benz extends fw {
    public void sit() {
        System.out.println("This will run from benz");
    }
}