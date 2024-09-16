import java.util.Scanner;

class Bank{
    Scanner sc = new Scanner(System.in);
    double availableBalance;
    double SavingAmount;
    double creditAmount;
    
    Bank(){
        this.availableBalance = 0;
    }

    void deposite(){
        System.out.print("Enter the amount you want to deposite : ");
        SavingAmount = sc.nextDouble();
        this.availableBalance += SavingAmount;
        System.out.println("Depostied Successfully!");
        System.out.println("Rs. " + availableBalance);
    }

    void withdraw(){
        System.out.print("Enter the amount you want to with draw : ");
        creditAmount = sc.nextDouble();
        if(creditAmount > availableBalance){
            System.out.println("Insufficent Balance!!");
        }
        else{
            availableBalance -= creditAmount;
            System.out.println("Available balance :");
            System.out.println("Rs. " + availableBalance);
        }
    }
    
    void checkBal(){
        System.out.println("Available balance :");
        System.out.println("Rs. " + availableBalance);
    }
}

public class Task_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 to Exit 1 to continue :- ");
        Bank b = new Bank();
        int command = sc.nextInt();
        if(command == 1){
            System.out.println("Please, first deposite some money.Thank You!!");
            while(command != 0){
                System.out.print("Enter 0 to Exit or 1 to with draw or 2 to deposite or 3 to check balance :- ");
                command = sc.nextInt();
                if(command == 0){
                    System.out.println("Thank You for giving a chance to help you.");
                    return;
                }
                else if(command == 1){
                    b.withdraw();
                }
                else if(command == 2){
                    b.deposite();
                }
                else if(command == 3){
                    b.checkBal();
                }
                else{
                    System.out.println("Invalid Command! Please enter valid input");
                }
            }
        }
        else if(command == 0){
            System.out.println("Thank You for giving a chance to help you.");
        }
        else{
            System.out.println("Invalid Command! Please enter valid input");
        }
    }
}


/*
This Java program simulates basic bank operations such as depositing money, withdrawing money, and checking the balance. It provides an interactive experience where the user can perform these operations continuously until they choose to exit.

Breakdown of the Code: By importing Scanner class to take input form user.

Inside the Bank class -  
    availableBalance: Represents the current balance of the account.
    SavingAmount: Stores the amount that will be deposited by the user.
    creditAmount: Stores the amount that will be withdrawn by the user.
    The class provides three methods to interact with the bank account: deposite(), withdraw(), and checkBal().
Constructor (Bank()): Initializes availableBalance to zero when a new Bank object is created.

deposite() method: To deposite money from saving account.
wtihdraw() method: To withdraw money from saving account and to check if th fund is sufficiently for withdraw or not, if not then throw s an error.
availableBalance() method: To get the available balance.
Example Flow:
    The user is prompted to either continue or exit the program.
    If they choose to continue, they must deposit money first.
    After depositing, they can choose to withdraw, deposit more, or check the balance.



*/