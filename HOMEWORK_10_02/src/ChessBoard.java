import org.jetbrains.annotations.Contract;

import java.util.Random;
//public class Main
  //  public static void main(String[] args) {
        // ZADACHA 1
        /*
        int[][] mas = new int[8][8];
        for(int i = 0; i < mas.length; i++) {
            for(int j=0; j < mas.length; j++) {
                if((i+j)%2 == 1) mas[i][j] +=1;
                System.out.print("| " + mas[i][j]+" |");
            }
            System.out.println();
        }               // output
                | 0 || 1 || 0 || 1 || 0 || 1 || 0 || 1 |
                | 1 || 0 || 1 || 0 || 1 || 0 || 1 || 0 |
                | 0 || 1 || 0 || 1 || 0 || 1 || 0 || 1 |
                | 1 || 0 || 1 || 0 || 1 || 0 || 1 || 0 |
                | 0 || 1 || 0 || 1 || 0 || 1 || 0 || 1 |
                | 1 || 0 || 1 || 0 || 1 || 0 || 1 || 0 |
                | 0 || 1 || 0 || 1 || 0 || 1 || 0 || 1 |
                | 1 || 0 || 1 || 0 || 1 || 0 || 1 || 0 |
 */
/*
        int arr[] = new int[10];
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
                count++;
            }
        }
        return count;

 */
        public class ChessBoard {
            public static void main(String[] args) {
                int[][] board = new int[8][8];
                // цикл заполнения
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        board[i][j] = (i + j) % 2;
                    }
                }
                // Печатаем доску
                System.out.println("   A   B   C   D   E   F   G   H ");
                for (int i = 0; i < 8; i++) {
                    System.out.print((8 - i) + " ");  // столбец строк
                    for (int j = 0; j < 8; j++) {
                        System.out.print((board[i][j] == 0 ? "|0| " : "|1| ")); // поля
                    }
                    System.out.println();

                }





            }

        }






