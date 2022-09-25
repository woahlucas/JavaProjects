import java.util.Scanner;

public class BankingSystem {
    public static void main(String args[]){
        BankAccount obj1 = new BankAccount("Lucas","8450");
        obj1.showMenu();
    }
}

class BankAccount {
    double balance;
    double previousTransaction;
    String name;
    String password;

    BankAccount(String cname, String cpassword){
        name = cname;
        password = cpassword;
    }

    void deposit(double amount){
        if (amount > 0){
            balance = balance + amount;
            previousTransaction = balance;
            System.out.println("You deposited $"+amount);
        }
    }

    void withdraw(double amount){
        if (amount > 0){
            balance = balance - amount;
            previousTransaction = -balance;
            System.out.println("You withdrew $"+amount);
        }
    }

    void getBalance(){
        System.out.println("Balance: $"+balance);
    }

    /*void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.print("Deposited: "+previousTransaction);
        } else if(previousTransaction < 0){
            System.out.print("Withdrawn: "+Math.abs(previousTransaction));
        } else{
            System.out.print("No transaction");
        }
    }*/

    void showMenu(){
        char option;
        Scanner scanner = new Scanner(System.in);
        double amount;

        System.out.println("Welcome "+name);
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Exit\n");

        do{
            System.out.println("Choose an option:");
            option = scanner.next().toUpperCase().charAt(0);

            switch(option){
                case 'A':
                    getBalance();
                    break;
                case 'B':
                    System.out.println("Enter amount to deposit:");
                    amount = scanner.nextInt();
                    deposit(amount);
                    break;
                case 'C':
                    System.out.println("Enter amount to withdraw:");
                    amount = scanner.nextInt();
                    withdraw(amount);
                    break;
                case 'D':
                    System.out.println("-------------------------------");
                    break;
                default:
                    System.out.println("Invalid option! Enter again");
                    break;
            }
        }while(option != 'D');
        System.out.println("Thank you for using our services!");
    }

}
