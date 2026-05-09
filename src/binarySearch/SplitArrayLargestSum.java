package binarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        System.out.println("Subarray");
        int[] arr = {1,2,3,4,5};


        int max = 0;
        int min = 0;
        for(int i = 0 ;i < arr.length -1; i++){
            int count1 = 0;
            int count2 = 0;
            for(int k = 0; k <= i; k ++){
                count1 += arr[k];
                System.out.print("[");
                System.out.print(arr[k] +" ");
                System.out.print("]");
            }
            for(int j = i+1 ; j < arr.length; j++){
                System.out.print(arr[j]+ " ");
                count2+= arr[j];
            }
            System.out.println();
            max = Math.max(count1, count2);
            if(min == 0){
                min = max;
            }else if(max < min){
                min = max;
            }
        }
        System.out.println(min);
    }
}
