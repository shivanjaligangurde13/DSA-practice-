//package binarySearch;
//
//public class SortedMatrix {
//    public static void main(String[] args) {
//
//    }
//    static int[] search(int[][] matrix, int target){
//        int rows = matrix.length;;
//        int col = matrix[0].length;
//
//        if(rows == 1){
//
//        }
//    }
//    public static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target){
//        while(colStart<= colEnd){
//            int mid = colStart+(colEnd-colStart)/2;
//            if(matrix[row][mid] == target){
//                return new int[]{row,mid};
//            }
//            if(matrix[row][mid] < target){
//                colStart = mid -1;
//            }else{
//                colEnd = mid -1;
//            }
//        }
//        return new int[]{-1,-1};
//    }
//}
