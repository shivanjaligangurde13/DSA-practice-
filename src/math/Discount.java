package math;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the price of the product : ");
        float price = in.nextFloat();
        System.out.println("Enter the Discount percent : ");
        int discount = in.nextInt();
        float discountAmount = (price* discount) / 100;
        float finalAmount = price- discountAmount;
        System.out.println("The discounted Price is :"+ finalAmount);

    }
}
