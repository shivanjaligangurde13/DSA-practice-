package array;

import java.util.*;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] res = createTargetArray(nums, index);
        System.out.println(Arrays.toString(res));
    }

    public static int[] createTargetArray(int[] nums, int[] index){
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i< index.length; i++){
            list.add(index[i], nums[i]);
        }
        int[] result = new int[index.length];
        for(int i = 0 ; i <index.length ; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
