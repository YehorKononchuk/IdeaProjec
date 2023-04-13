package bubblesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] ints = {6,1,4,6,7,2,9,0};
        System.out.println(Arrays.toString(ints));
        bubbleSort(ints);
        System.out.println(Arrays.toString(ints));
    }
    public static void bubbleSort (int[] array){
        boolean sorted = false;
        int temp;

        while (!sorted){
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;

                }

            }
        }
    }
}