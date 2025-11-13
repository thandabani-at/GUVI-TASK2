package question3;

import java.util.Scanner;

public class Accountmain {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial amount");

        double initial= sc.nextDouble();
        Account Acc = new Account(initial);
        Acc.displayBalance();
        System.out.print("Enter amount to deposit :");
        double dep = sc.nextDouble();
        Acc.deposit(dep);
        System.out.println("Enter the amount to withdraw :");
        double wit = sc.nextDouble();
        Acc.withdraw(wit);
        Acc.displayBalance();


    }
}
