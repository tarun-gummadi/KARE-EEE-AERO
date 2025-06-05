//multilevel inheritance
public class mainoop2{
    public static void main(String args[]){
        benny bn = new benny();
        taxis tx = new taxis();
        audi au = new audi();
        bike bi = new bike();
        cycle bcyc = new cycle();
        bn.pea();//inheritance from super class fourwheeler
        bn.cos();
        tx.pea();//inheritance from super class fourwheeler
        tx.space();
        au.pea();//inheritance from super class fourwheeler
        au.fame();
        bi.wheels();//inheritance from super class twowheeler
        bi.heal();
        bcyc.wheels();//inheritance from super class twowheeler
        bcyc.healthy();
    }
}
class four{
    public void pea(){
        System.out.println("Car has four wheels");
    }
}
class benny extends four{
    public void cos(){
        System.out.println("Costliest ");
    }
}
class taxis extends four{
    public void space(){
        System.out.println("Spacious ");
    }
}
class audi extends four{
    public void fame(){
        System.out.println("Famous");
    }
}
class two{
    public void wheels(){
        System.out.println("Easy to ride");
    }
}
class bike extends two{
    public void heal(){
        System.out.println("bike ride heals");
    }
}
class cycle extends two{
    public void healthy(){
        System.out.println("healthy ride");
    }
   
}