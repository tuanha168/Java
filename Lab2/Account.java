package Lab2;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        int accountNumber;
        double accountBalance;

        System.out.println("Enter the details for the new Account to be created....");
        System.out.println("Enter the Account Number:");
        Scanner scan = new Scanner(System.in);
        accountNumber = scan.nextInt();
        System.out.println("Enter the Account Balance");
        accountBalance = scan.nextDouble();

        System.out.println("The details of the new account are:");
        System.out.printf("Account Number: %d", accountNumber);
        System.out.printf("\nAccount Balance: %.2f", accountBalance);
    }
}