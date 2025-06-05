//method overloading
public class methoverload {
    public static void main(String[] args) {
        benzcar bc = new benzcar();
        bc.run();
        bc.costs();
        bc.costs(8);
        bc.costs(2,6);
    } 
}
class fours{
    public void run(){
        System.out.println("This method belongs to parent class");
    }
}
class benzcar extends fours{
    public void costs(){
        System.out.println("This is costiliest car");
    }
    public void costs(int r){
        System.out.println(r*r);
    }
    public void costs(int a,int s){
        System.out.println(s*a);
    }
}