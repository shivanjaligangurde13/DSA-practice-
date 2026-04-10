package array;

import java.util.Arrays;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] arr = result(nums);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] result(int[] nums){
        int size = nums.length;
        int[] arr = new int[size];

        for(int i = 0; i<= size - 1 ; i++){
            arr[i]= nums[nums[i]];
        }
        return arr;
    }
}
