package array;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0}, {1,0,1} , {0,0,0}};
        int[][] flippedImage = flipImage(image);
        System.out.println(Arrays.deepToString(flippedImage));
    }
    public static int[][] flipImage(int[][] image){
        for (int i = 0 ;i < image.length ; i++) {
            int start = 0;
            int end = image.length - 1;
            while (start < end) {
                swap(image[i], start, end);
                start++;
                end--;
            }
            for(int j = 0 ; j< image[i].length; j++){
                image[i][j] = image[i][j] ^ 1;
            }
        }
        return image;
    }
    public static void swap(int[] image,int start, int end){
        int temp = image[start];
        image[start] = image[end];
        image[end] = temp;
    }
}
