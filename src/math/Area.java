package math;

import java.util.Scanner;

public class Area {
    public static double areaOfCircle(int radius){
        return  Math.PI * radius* radius;
    }
    public static int areaOfSquare(int a){
        return a*a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(areaOfCircle(n));
        System.out.println(areaOfSquare(n));
    }
}
