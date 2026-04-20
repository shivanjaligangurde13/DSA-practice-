package array;
import java.util.*;
public class ArrayForm {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        List<Integer> arrForm = addToArrayForm(num,k);
        System.out.println(arrForm);
    }
    public static List<Integer> addToArrayForm(int[] num , int k){
        List<Integer> list = new ArrayList<>();
        int current_sum =0 ;
        for(int i = 0 ;i <num.length; i++){
            current_sum = current_sum *10 +num[i];
        }
        int sum = current_sum + k;
        while(sum > 0){
            int digit = sum%10;
            list.add(digit);
            sum/=10;
        }
        Collections.reverse(list);
        return list;
    }
}
