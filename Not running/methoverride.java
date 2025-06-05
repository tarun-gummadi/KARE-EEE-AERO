//method overrides
public class methoverride {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        hr.addEmployee();
        
    }
    
}
class Employee{
    public void work(){
        System.out.println("This is main class");
    }
    public void getSalary(){
        System.out.println("This is also a main class");
    }
}
class HRManager extends Employee{
    public void work(){
        System.out.println("This is a Child class 1");
    }
    public void addEmployee(){
        System.out.println("This is child class 2");
    }
}