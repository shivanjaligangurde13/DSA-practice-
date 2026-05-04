package binarySearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] mountArr =  {0,10,5,2,0};
        int peakIndex = search(mountArr);
        System.out.println(peakIndex);
    }
    public static int search(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid] <arr[mid +1]){
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return start;
    }
}
