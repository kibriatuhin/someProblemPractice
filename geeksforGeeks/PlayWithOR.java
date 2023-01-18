package geeksforGeeks;

import java.util.Arrays;

public class PlayWithOR {

    public static int[] game_with_number (int arr[], int n) {
        for (int i=0 ;i<n-1 ;i++){
            arr[i] = arr[i] | arr[i+1];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] array = {10, 11, 1, 2, 3};
        System.out.println(Arrays.toString(game_with_number(array,array.length)));
    }
}
