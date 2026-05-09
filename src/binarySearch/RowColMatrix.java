package binarySearch;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 60;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    public static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix[0].length -1 ;

        while(row < matrix.length && col > 0 ){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if(matrix[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return new int[] {-1,-1};
    }
}
