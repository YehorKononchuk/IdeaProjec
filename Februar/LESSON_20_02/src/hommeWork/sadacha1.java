package hommeWork;

import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;

public class sadacha1 {
    public static void main (String[] args) {
        System.out.println(" Давай поработаем! ))");

                            // ***********  Задача 1  **************
        //Создать список из 100 целых случайных чисел в интервале от 1 до 99,
        // с помощью HashSet исключить повторы(дубликаты) и вывести на печать
        //  количество уникальных элементов полученного множества.

        int[] arrayIntRandom = new int[100];
        System.out.print(" Задуманный массив : ");
        for (int i = 0; i < arrayIntRandom.length; i++) {
            arrayIntRandom[i] = (int) ((Math.random() * (99 - 1 + 1) + 1));
            System.out.print( " "+arrayIntRandom[i]);
        }
        System.out.println();

        HashSet<String> arrayInt = new HashSet<String>(); // инициализация HashSet

        for ( int i =0  ; i < arrayIntRandom.length  ; i++ ) {
            arrayInt.add(String.valueOf(arrayIntRandom[i])); // добавляем в HashSet слова из массива s[i]
        }
        int r1 = arrayInt.size(); // определеили размер полученного интервала
        System.out.println("Количество уникальных чисел  в интервале: " + r1);
        // напечатаем эти слова
        System.out.println("уникальные элементы полученного множества: ");
        for (String st : arrayInt){
            System.out.print(" "+st);
        }
        System.out.println();

                              // ***********  Задача 2  **************
      /*  В автосервисе решили узнать, сколько всего уникальных машин они обсужили за время своей работы.
      В архиве имеются все заказ-наряды, в которых зафиксированы VIN обслуженных машин.
       Написать приложение для автосервиса, проверить его работу на тестовом наборе данных для 10 автомобилей
       (VIN машин запросить у коллег из группы). Пусть VIN содержит 2 буквы и 3 цифры.
       */

     //   String [] vinReestr = {"qw123","as456","yx789","er135","dg246","üo098","zr246","di789","vb068","lj369"};
                HashMap<String, Integer> vinCounts = new HashMap<String, Integer>();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите VIN-коды машин, обслуженных в автосервисе. " +
                        "Для завершения ввода введите \"конец\":");
                while (true) {
                    String vin = scanner.nextLine().trim();
                    if (vin.equals("конец")) {
                        break;
                    }
                    if (!vinCounts.containsKey(vin)) {
                        vinCounts.put(vin, 1);
                    } else {
                        int count = vinCounts.get(vin);
                        vinCounts.put(vin, count + 1);
                    }
                }
                System.out.println("Количество уникальных машин, обслуженных в автосервисе: " + vinCounts.size());
    }
}





















