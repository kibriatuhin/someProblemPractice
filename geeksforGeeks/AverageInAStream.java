package geeksforGeeks;

import java.util.Arrays;

public class AverageInAStream {
    static float[] streamAvg(int[] arr, int n) {
        float[] result = new float[arr.length];
        int j=0,k=0;
        for (int i=1 ; i<=arr.length ; i++){
            float f = arr[j++]/i;
            result[k++] = f;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        streamAvg(array,array.length);

    }
}
