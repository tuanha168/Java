import java.util.*;

class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deposit;
        double interest;

        System.out.print("Deposit Amount: $");
        deposit = Integer.parseInt(input.nextLine());

        if (deposit <= 2000) {
            interest = deposit * 4 / 100;
        }
        else if (deposit <= 7000) {
            interest = deposit * 4.5 / 100;
        }
        else {
            interest = deposit * 5 / 100;
        }

        System.out.print("Interest each year: $" + interest);
    }
}