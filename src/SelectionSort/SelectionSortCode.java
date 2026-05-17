package SelectionSort;

import java.util.Arrays;

public class SelectionSortCode {
    public static void main(String[] args) {
        int[] arr = {4,2};
        sortTheArray(arr);
    }
    public static void sortTheArray(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i <n-1; i++){
            int max = 0;
            for(int j = 1; j < n-i; j++){
                if(arr[max] < arr[j]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
