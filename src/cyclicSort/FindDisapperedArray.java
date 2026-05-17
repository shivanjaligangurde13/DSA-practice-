package cyclicSort;
import java.util.*;
import java.util.Arrays;

public class FindDisapperedArray {
    public static void main(String[] args) {
        int[] arr = {1,1};
        List<Integer> l = missingNumbers(arr);
        System.out.println(l);

    }
    public static void sort(int[] arr){
        int i = 0 ;
        while(i< arr.length){
            int correctIndex = arr[i] - 1;

            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
    }
    public static List<Integer> missingNumbers(int[] arr){
        sort(arr);
        List<Integer> l = new ArrayList<>();
        for(int i = 0 ;i < arr.length; i++){
            if(i != arr[i] - 1){
                l.add(i+1);
            }
        }
        return l;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
