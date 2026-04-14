package array;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallerNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] result = smallerNumberThanTheCurrent(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] smallerNumberThanTheCurrent(int[] nums){
        int[] newArr = new int[nums.length];

        for(int i = 0 ; i< nums.length ; i++){
            int count = 0;
            for(int j = 0 ; j< nums.length; j++){
                if(nums[i]> nums[j]){
                    count++;
                }
            }
            newArr[i]= count;
        }
        return newArr;
    }
}
