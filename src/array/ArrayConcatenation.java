package array;

import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] arrC= getConcatenate(nums);
        System.out.println(Arrays.toString(arrC));

    }

    public static int[] getConcatenate(int[] nums){
        int n = nums.length;
        int[] ans = new int[2 * n];

        for(int i =0 ; i < nums.length; i++){
            ans[i]= nums[i];
            ans[i+n]= nums[i];
        }
        return ans;
    }
}
