//multiple inheritance
public class mainoops1 {
    public static void main(String[] args) {
        benzi bz = new benzi();
        bz.mini();
        //bz.key(); i have commented this because multiple inherance is not possible in java.so a child class benzi cannot have two father classes fourwheel and twowheel 
    }   
}
class fourwheel{
    public void mini(){
        System.out.println("First father");
    }
}
class twowheel{
    public void key(){
        System.out.println("Second Father");
    }
}
class benzi extends fourwheel{//,twowheel{ if you add this statement it means child class has two father which is not possible in real time and also in java so it shows error
    public void cee(){
        System.out.println("Child class");
    }
}
/*class benzi extends twowheel{
    public void mee(){
        System.out.println("CHILD CLASS");
    }
}*/ //i have commented this class because of multiple inheritance that is son class having two father class which is not possible in java