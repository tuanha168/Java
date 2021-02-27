package Lab2;

import java.util.*;

public class bt1 {
    public static void main(String[] args) {
        String name;
        double diem1;
        double diem2;
        double diem3;
        double diemtb;
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        diem1 = Double.parseDouble(scan.nextLine());
        diem2 = Double.parseDouble(scan.nextLine());
        diem3 = Double.parseDouble(scan.nextLine());
        diemtb = (diem1 + diem2 + diem3) / 3;

        System.out.println("Name: " + name);
        System.out.printf("Diem Tb: %.2f", diemtb);
    }
}