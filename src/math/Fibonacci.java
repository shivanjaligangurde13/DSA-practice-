package math;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = in.nextInt();

        int first = 0, second = 1;

        if (n >= 1) System.out.print(first + " ");
        if (n >= 2) System.out.print(second + " ");

        for (int i = 3; i <= n; i++) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}