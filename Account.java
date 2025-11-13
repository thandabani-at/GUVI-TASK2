package question3;

public class Account {
    private double balance;

    public Account() {
       balance = 0.0;
    }
    public Account(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited :"+ amount);
        }else {
            System.out.println("Deposit amount must be positive");
        }

    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw :" + amount);
        } else {
            if (amount > balance) {
                System.out.println("Insufficient balance!");
            } else {
                System.out.println("Withdraw amount must be positive");
            }

        }

    }
    public void  displayBalance(){
        System.out.println("Current balance :" + balance);

    }

}
