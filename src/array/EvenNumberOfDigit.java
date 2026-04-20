package array;

public class EvenNumberOfDigit {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        int evenNum = countEvenNum(nums);
        System.out.println(evenNum);
    }

    public static int countEvenNum(int[] nums){
        int evenNumCount = 0;
        for(int i = 0 ;i < nums.length; i++){
            int count = 0;
            while(nums[i]>0){
                int digit = nums[i] %10;
                count++;
                nums[i]/=10;
            }
            if(count % 2 == 0){
                evenNumCount++;
            }
        }
        return  evenNumCount;
    }
}
