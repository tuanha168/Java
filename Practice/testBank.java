import Practice.Ex1.Bank;


public class testBank {
    public static void main(String[] args) {
        Bank newBank = new Bank(1000,10);
        System.out.println(newBank.calculateInterest());
    }
}