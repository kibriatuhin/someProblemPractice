package finalPreparation2;

import java.util.Arrays;

public class Main2 {
}

class Sorting{
    static void bubbleSort(int[] array){
        for (int i=0 ; i<array.length ; i++){
            for (int j=0 ; j< array.length-1-i; j++){
                if (array[j]> array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    static void selectionSort(int[] array){
        for (int i=0; i<array.length-1 ; i++){
            int small = i;
            for (int j=i+1 ; j<array.length ; j++){
                if (array[small] > array[j]){
                    small = j;
                }
            }
            int temp = array[i];
            array[i] = array[small];
            array[small] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
    static void insertionSort(int[] array){
        for (int i=1  ; i<array.length ; i++){
            int j = i-1;
            int current = array[i];
            while (j>=0 &&  current <array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;

        }
        System.out.println(Arrays.toString(array));
    }


    public static void main(String[] args) {
        int[] array = {12,5,2,1,30,3};
       // bubbleSort(array);
       // selectionSort(array);
        insertionSort(array);
    }
}