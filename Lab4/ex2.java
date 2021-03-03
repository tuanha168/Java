import java.util.*;

class ex2 {
    public static void main(String[] args) {
        char a;
        String vowel;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Character: ");
        a = input.next().charAt(0);
        vowel = "ueoai";
        if (vowel.indexOf(a) == -1) {
            System.out.print("Inputed Character is consonant.");
        }
        else
            System.out.print("Inputed Character is Vowel.");
    }
}