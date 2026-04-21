package binarySearch;

public class SmallestLetter {
    public static void main(String[] args) {
        char target = 'c';
        char[] letters = {'c', 'f', 'j'};
        char smallestLetter = findSmallest(target, letters);
        System.out.println(smallestLetter);

    }
    public static char findSmallest(char target, char[] letters){
//        for(char ch : letters){
//            if(ch>target){
//                return ch;
//            }
//        }
        int start = 0 ;
        int end= letters.length - 1;

        while(start<= end){
            int mid = start + (end -start)/2;

            if(target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
