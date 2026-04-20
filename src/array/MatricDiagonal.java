package array;

public class MatricDiagonal {
    public static void main(String[] args) {
        int[][] mat = {
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };
        int sum = sumDiagonal(mat);
        System.out.println(sum);
    }
    public static int sumDiagonal(int[][] mat){
        int primarySum = 0;
        int secondarySum = 0;
        for(int i = 0 ;i <mat.length; i++){
            for(int j = 0 ; j< mat[i].length; j++){
                if(i==j){
                    primarySum+=mat[i][j];
                }
                if(i+j ==(mat.length-1) && i!=j){
                    secondarySum+=mat[i][j];
                }
            }
        }
        return primarySum+ secondarySum;
    }
}
