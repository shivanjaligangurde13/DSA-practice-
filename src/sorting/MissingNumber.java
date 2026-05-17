package sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int num = find(arr);
        System.out.println(num);
    }

    public static int find(int[] arr){
        cyclicSort(arr);
        for(int i = 0 ;i < arr.length; i++){
            if(i != arr[i] ){
                return i;
            }
        }
        return arr.length;
    }
    public static void cyclicSort (int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i];
            if(correctIndex < arr.length && arr[correctIndex] != arr[i]){
                swap(arr, correctIndex, i);
            }else{
                i++;
            }
        }
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
