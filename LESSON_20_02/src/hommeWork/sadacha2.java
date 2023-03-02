package hommeWork;

import java.util.HashMap;
import java.util.Scanner;

public class sadacha2 {
    public static void main (String[] args) {
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











