package math;

public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n));

    }
    public static boolean isArmstrong(int n){
        int original = n;
        int number = 0;
        while(n>0){
            int digit = n%10;
            number += (int) Math.pow(digit,3);
            n/= 10;
        }
        return number == original;
    }
}
