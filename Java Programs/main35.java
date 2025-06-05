//Method overriding
public class main35 {
    public static void main(String[] args) {
        benzi bb = new benzi();
        bb.run();
    }  
}
class fourwheelers{
    public void run(){
        System.out.println("This method belongs to parent class");
    }
}
class benzi extends fourwheelers{
    public void run(){
        //super.run();//when you commented this statement this is overriding example code.(to print statement from parent class also use this statement)
        System.out.println("This Method belongs to child class");
    }
}