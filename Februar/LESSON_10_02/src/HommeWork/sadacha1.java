package HommeWork;

import java.util.Random;
public class sadacha1 {
    public static void main(String[] args) {
                                            // Zadacha 1
        int arr[] = new int[100];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Number of multiples of 10: " + countMultiplesOf10(arr));
    }
    public static int countMultiplesOf10(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 0) {
                count++;}}
        return count;
    }

}
