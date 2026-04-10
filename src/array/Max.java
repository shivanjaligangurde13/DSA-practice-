package array;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,4,6,2,0};
        System.out.println("The maximum number in the array is : " +max(arr));
        System.out.println(maxRange(arr, 1,4));
    }
    public static int max(int[] arr){
        int maxNumber = arr[0];
        for(int num : arr){
            if(maxNumber<num){
                maxNumber= num;
            }
        }
        return maxNumber;
    }

    public static int maxRange(int[] arr, int start, int end){
        int maxNumber = arr[start];
        for(int i =start; i<= end ;i++){
            if(maxNumber<arr[i]){
                maxNumber= arr[i];
            }
        }
        return maxNumber;
    }
}
