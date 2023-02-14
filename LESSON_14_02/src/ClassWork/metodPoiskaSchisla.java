package ClassWork;

import java.util.Scanner;

public class metodPoiskaSchisla {
    public static void main(String[]args){
                            // МЕТОД ПОИСКА ЧИСЛА В МАССИВЕ

        // Задать массив случайных целыхх чисел от 1 до 10 включительно.
        // Запросить у пользователя произвольное число от 1 до 10.
        // Проверить, встретилось ли введенное число в массиве и сколько раз.
        // Поиск в массиве реализовать как метод, на входе которого массив и искомое число, на выходе -
        // какое количество раз оно встретилось.
        //   ТИП[] имя_массива = new ТИП[размер];
        // int n = (int)(( Math.random() * (b - a + 1) + a)) - генерирует случайное **целое** число в интервале [a, b]
        //   a - может быть, b - может быть
        Scanner sc = new Scanner(System.in);

        int [] arrayIntRandom = new int[10];

        for (int i = 0; i < arrayIntRandom.length; i++) {
            arrayIntRandom [i] =(int)(( Math.random() * (10 - 1 + 1) + 1));
          //  System.out.println(" Задуманный массив : " +arrayIntRandom[i]);
        }
        System.out.println("Введите число: ");
        int num = sc.nextInt();

        int c = findNumber (arrayIntRandom, num);
        System.out.println(" число "+num+" встретилось "+c+" раз.");
    }
    public static int findNumber (int array[],int find_num){
        int count =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==find_num){
                count++;
            }
        }
        return count;
    }
}
