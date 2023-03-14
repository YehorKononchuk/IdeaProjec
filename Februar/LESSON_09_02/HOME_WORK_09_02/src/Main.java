public class Main {
    public static void main(String[] args) {
        // Задача 1. Создайте массив из всех нечётных чисел от 1 до 99,
        // выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку,
        // но в обратном порядке (99 97 95 93 … 7 5 3 1).

        int[] mas = new int[50];
        for (int i = 0, n = 1; i < mas.length; n = n + 2, i++) {
            mas[i] = n; // yacheika massiva
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");       // vivod ot men#chego
        }
            System.out.println();// slychebnaia stroka

        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");     // vivod ot bolschego
        }



       System.out.println();

        System.out.println("_____________________________________________________________________________");


            // Задача 4. Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
        // Первый и второй члены последовательности Фибоначчи равны единицам,
        // а каждый следующий — сумме двух предыдущих.

        int [] fibonacci = new int[20];

        for (int i = 0; i < fibonacci.length ; i++) {
            if (i==0){
                fibonacci[i]=1;
            } else if (i==1) {
                fibonacci[i]=1;
            }else {
                fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
            }

            System.out.print(" |"+fibonacci[i]+"| ");
        }







    }
    }
