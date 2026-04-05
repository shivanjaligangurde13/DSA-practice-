package math;

import java.util.Scanner;

public class ProductSumOfDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        int sum =0;
        int product = 1;

        while(n>0){
            int digit = n%10;
            sum+=digit;
            product*=digit;
            n/=10;
        }
        int result = product - sum;
        System.out.println("The result is : "+ result);

    }

}
