package binarySearch;

public class minIndexMountArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int index = findInMountainArray(arr,target);
        System.out.println(index);
    }

    public static int findInMountainArray(int[] arr, int target){
        int peak = peakIndex(arr);
        int firstTry = orderAgnosticBinarySearch(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBinarySearch(arr,target,peak+1, arr.length-1);
    }

    static int orderAgnosticBinarySearch(int[] arr , int target, int start, int end){

        //find whether the array is sorted in ascending or desc
        boolean isAsc = arr[start] < arr[end];



        while(start<= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else{
                if(target<arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static int peakIndex(int[]arr){
        int start =0 ;
        int end = arr.length - 1;

        //mountain peak element
        while (start < end){
            int mid = start + (end - start )/2;

            if(arr[mid] < arr[mid - 1]){
                start = mid +1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
