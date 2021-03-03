import java.util.*;

class ex1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age, gender, profession, personalAssets, loanAmount;

        System.out.print("Age: ");
        age = Integer.parseInt(input.nextLine());
        if (age < 16) {
            System.out.println("Not Eligible.");
            return;
        }
        System.out.print("Gender(1:M, 2:F): ");
        gender = Integer.parseInt(input.nextLine());
        System.out.print("Profession(1: Self-Employed, 2: Professional): ");
        profession = Integer.parseInt(input.nextLine());
        System.out.print("Personal Assets: ");
        personalAssets = Integer.parseInt(input.nextLine());        

        if (age >= 16 && age <= 25) {
            if (personalAssets > 25000) {
                if (profession == 1) {
                    loanAmount = 10000;
                }
                else
                    loanAmount = 15000;
            }
            else
                loanAmount = -1;
        }
        else if (age >= 26 && age <= 40) {
            if (personalAssets > 40000) {
                if (gender == 1) {
                    loanAmount = 25000;
                }
                else
                    loanAmount = 30000;
            }
            else loanAmount = -1;
        }
        else if (age >= 41 && age <= 60) {
            if (personalAssets > 50000) {
                loanAmount = 40000;
            }
            else
                loanAmount = -1;
        }
        else if (age > 60) {
            if (personalAssets > 25000) {
                if (profession == 1) {
                    loanAmount = 35000 - (age * 100);
                }
                else
                    loanAmount = 25000 - (age * 100);
            }
            else
                loanAmount = -1;
        }
        else
            loanAmount = -1;

        if (loanAmount == -1) {
            System.out.println("Not Eligible.");
        }
        else
            System.out.println("Loan Amount Eligible: " + loanAmount);
    }
}