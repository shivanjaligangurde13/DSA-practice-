package array;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gains = {-4,-3,-2,-1,4,3,2};
        int highAltitudePoint = highAltitude(gains);
        System.out.println(highAltitudePoint);
    }
    public static int highAltitude(int[] gains){
        int[] altitude = new int[gains.length+1];
        altitude[0] = 0;
        for(int i = 0 ; i< gains.length ; i++){
            altitude[i+1] = altitude[i] + gains[i];
        }
        int max = altitude[0];
        for(int i = 0 ;i < altitude.length ; i++){
            if(max<altitude[i]){
                max = altitude[i];
            }
        }
        return max;
    }
}
