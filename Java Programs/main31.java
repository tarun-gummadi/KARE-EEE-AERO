//Hierachical Inheritance
public class main31 {
    public static void main(String args[]){
        benz bn = new benz();
        taxi tx = new taxi();
        audi au = new audi();
        bike bi = new bike();
        cycle bcyc = new cycle();
        fiveseater fseat = new fiveseater();
        sevenseater sseat = new sevenseater();
        bn.run();//inheritance from super class fourwheeler
        bn.cost();
        tx.run();//inheritance from super class fourwheeler
        tx.space();
        au.run();//inheritance from super class fourwheeler
        au.fame();
        bi.wheels();//inheritance from super class twowheeler
        bi.heal();
        bcyc.wheels();//inheritance from super class twowheeler
        bcyc.healthy();
        fseat.space();
        fseat.seat();
        sseat.space();
        sseat.seats();
    }
}
class fourwheeler{
    public void run(){
        System.out.println("Car has four wheels");
    }
}
class benz extends fourwheeler{
    public void cost(){
        System.out.println("Costliest ");
    }
}
class taxi extends fourwheeler{
    public void space(){
        System.out.println("Spacious ");
    }
}
class audi extends fourwheeler{
    public void fame(){
        System.out.println("Famous");
    }
}
class twowheeler{
    public void wheels(){
        System.out.println("Easy to ride");
    }
}
class bike extends twowheeler{
    public void heal(){
        System.out.println("bike ride heals");
    }
}
class cycle extends twowheeler{
    public void healthy(){
        System.out.println("healthy ride");
    }
}
class fiveseater extends taxi{
    public void seat(){
        System.out.println("has 5 seats");
    }
}
class sevenseater extends taxi{
    public void seats(){
        System.out.println("has 7 seats");
    }
}
