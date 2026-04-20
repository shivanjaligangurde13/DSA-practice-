package array;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] transposeMat = transposemat(mat);
        System.out.println(Arrays.deepToString(transposeMat));
    }
    public  static  int[][] transposemat(int[][] mat){
        for(int i = 0 ; i< mat.length; i++){
            for(int j = 0 ; j< mat[i].length; j++){
                if(i<j){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }
        return mat;
    }
}
