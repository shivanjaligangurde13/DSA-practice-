package sorting;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
//        int e = find(arr);
//        System.out.println(e);
        int element = majorityElement(arr);
        System.out.println(element);

    }

    public static int majorityElement(int[] arr){
        sort(arr);
        int candidate = arr[arr.length/2];
        int count = 0;
        for(int num: arr){
            if(candidate == num){
                count++;
            }
        }
        if(count>(arr.length/2)){
            return candidate;
        }else {
            return -1;
        }

    }

    public static void sort(int[] arr){
        for(int i = 0 ; i< arr.length- 1; i++){
            for(int j = i+1; j> 0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr , j, j-1);
                }else{
                    break;
                }
            }
        }

    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


//    public static int find(int[] arr){
//        int n = arr.length;
//        int majorElement = -1;
//        for(int i = 0 ;i < arr.length; i++){
//            int currCount = 0;
//            for(int j = 0; j< arr.length; j++){
//                if(arr[i] == arr[j]){
//                    currCount++;
//                }
//            }
//            if(currCount > (n/2)){
//                majorElement = arr[i];
//            }
//        }
//        return  majorElement;
//    }
}
