package Lab2;

import java.util.*;

public class invoice {
    public static void main(String[] args) {
        int orderedShirts, orderedTrousers, points = 0;
        int priceOfShirt = 300;
        int priceOfTrouser = 700;
        int costOfShirts, costOfTrousers, totalCost;
        double discount, netPay;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Shirts to order:");
        orderedShirts = Integer.parseInt(input.nextLine());
        System.out.println("Enter the number of Trousers to order");
        orderedTrousers = Integer.parseInt(input.nextLine());


        costOfShirts = priceOfShirt * orderedShirts;
        costOfTrousers = priceOfTrouser * orderedTrousers;
        totalCost = costOfShirts + costOfTrousers;
        discount = totalCost > 3000 ? totalCost * 10/100 : 0;
        netPay = totalCost - discount;
        points = (int) (netPay > 3000 ? netPay / 100 : 0);


        System.out.println("\nItem\t\t\tQuantity\tPrice\t\tTotal");
        System.out.println("----------------------------" + "--------------------------------------------");
        System.out.printf("Shirts\t\t\t%d\t\t%d\t\t%d\n", orderedShirts, priceOfShirt, costOfShirts);
        System.out.printf("Trousers\t\t%d\t\t%d\t\t%d\n", orderedTrousers, priceOfTrouser, costOfTrousers);
        System.out.println("----------------------------" + "--------------------------------------------");
        System.out.printf("Discount\t\t\t\t\t\t%.2f\n",discount);
        System.out.println("----------------------------" + "--------------------------------------------");
        System.out.printf("Net Total\t\t\t\t\t\t%.2f\n",netPay);
        System.out.println("----------------------------" + "--------------------------------------------");
        System.out.printf("Points Earned\t%d\n",points);
        System.out.println("Thank you!\n");
    }
}