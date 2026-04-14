package array;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] arraySum = runningSum(nums);
        System.out.println(Arrays.toString(arraySum));
    }

    public static int[] runningSum(int[] nums){
        int[] arraySum = new int[nums.length];
        int sum = 0 ;

        for(int i = 0; i< nums.length ; i++){
            arraySum[i]= nums[i]+ sum;
            sum = arraySum[i];
        }
        return  arraySum;
    }
}
