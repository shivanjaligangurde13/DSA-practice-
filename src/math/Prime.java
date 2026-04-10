package math;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("To check given number is rime or not");
        int n = in.nextInt();
        System.out.println(isPrime(n));

    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c * c> n;
    }
}
