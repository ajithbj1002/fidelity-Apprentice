package accountdetails;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for account details
        System.out.print("Enter account id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account type: ");
        String accountType = sc.nextLine();

        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        // Create an Account object using the 3-parameter constructor
        Account account = new Account(id, accountType, balance);

        // Display account details
        System.out.println(account.GetDetails());

        // Prompt user to enter the amount to withdraw
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        // Call Withdraw method and display new balance if successful
        if (account.Withdraw(amount)) {
            System.out.println("New Balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}