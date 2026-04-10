package array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,9};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1]= arr[num2];
        arr[num2] = temp;
        System.out.println(arr[num1]+ " "+ arr[num2]);
    }
}
