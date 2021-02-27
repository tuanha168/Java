package Lab2;

public class Enquiry {
    public static void main(String[] args) {
        int accountNumber = 192834;
        double accountBalance = 11423.79;
        char accountType = 'S';
        boolean active = true;

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Active: "+ active);
        System.out.println("Account Type" + "(S: Savings C: Current): " + accountType);
        System.out.println("Account Balance: $" + accountBalance);
    }
}