package classWork;
// На входе массив из 10 целых чисел от 0 до 100, числа заданы произвольно,
// массив отсортирован от меньшего к большему элементу
// пользователь вводит интересующее его число - есть оно в массиве или нет?
// на выходе ответ - есть или нет искомый элемент. Если есть, то выводится индекс найденного элемента массива
// ключевой алгоритм - поделить массив пополам и понять, в какой половинке искомый элемент
// продолжать,пока не будет найден искомый элемент массива или не закончится массив

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Бинарный поиск в массве ");

        int[] array = {3,5,23,34,56,78,79,82,85,87};
        int length = array.length;
        System.out.println("длинна массива "+length);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите  число в массиве ");
        int element = scanner.nextInt();
        System.out.println("Ищем элемент в массиве "+element);

        boolean hasElement = false;

        int left = 0;
        int right = length-1;
        int middle = left + (right-left)/2;

        while (left<=right){
            if (element<array[middle]){
                right = middle-1;
            }else if (element>array[middle]){
                left = middle +1;
            }else {
                hasElement = true;
                break;
            }
            middle = left + (right - left )/2;

        }
        System.out.println(hasElement);

    }
}
