package binarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,12,24,61};
        int target = 5;
        int ans = and(arr,target);
        System.out.println(ans);
    }
    public static int and(int[] arr , int target){
        int start =0;
        int end = 1;
        while(target > arr[end]){
            int newS = end + 1;
            end = end + (end-start+1)* 2;
            start = newS;
        }
        return binarySearch(arr, target, start, end);
    }
    public static int binarySearch(int[] arr, int target, int start , int end){

        while(start<= end){
            int mid = start +(end - start)/2;
            if(target < arr[mid]){
                end = start - 1;
            }else if (target > arr[mid]){
                start = mid +1 ;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
