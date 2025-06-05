/*Write a java program to create a create a class known as "BankAccount" with methods called deposit() and withdraw().Create a subclass called "SavingsAccount" that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred */
import java.util.Scanner;
public class withdepbank{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            Savingsaccount sa = new Savingsaccount();
            Bankaccount ba = new Bankaccount();
            System.out.println("Enter 1 for deposition and 0 for withdrawal");
            int num = sc.nextInt();
            if(num == 0){
                System.out.println("Enter your balance amount:");
                int balance = sc.nextInt();
                System.out.println("Enter the amount you wanna withdraw::");
                int withdraws = sc.nextInt();
                if (balance>withdraws && balance-withdraws>=100){
                    System.out.println("Your withdrawal in progress...");
                    sa.withdraw();
                }else if(withdraws==balance){
                    System.out.println("You need to keep 100 rs as balance in account");
                }else if(withdraws>balance){
                    System.out.println("Not enough balance");
                }
                }
            else if(num == 1){
                System.out.println("Welcome for deposition");
                ba.deposit();
            }else{
                    System.out.println("Invalid input");
            }
        }
    }
}
class Bankaccount{
    public void deposit(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your balance amount:");
            int balance = sc.nextInt();
            System.out.println("Enter the amount you wanna deposit:");
            int deposition = sc.nextInt();
            int amount = (balance+deposition);
            System.out.println("Deposited Successfully");
            System.out.println("Total account balance is"+" "+amount);
        }
    }
    public void withdraw(){
        System.out.println("Welcome to your withdrawal");
    }
}
class Savingsaccount{
    public void withdraw(){
        System.out.println("Your Withdrawal is ready");
        System.out.println("Transaction is completed");
    }
}