package math;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number to Reverse: ");
        int n = in.nextInt();
        int ans =0;
        while(n>0){
            int digit = n%10;
            ans = ans* 10+ digit;
            n/=10;
        }
        System.out.println(ans);
    }
}
