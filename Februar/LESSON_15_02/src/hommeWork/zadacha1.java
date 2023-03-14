package hommeWork;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class zadacha1 {
    public static void main(String[] args) {

        ArrayList <String> reservirung = new ArrayList<>();

        // Имена гостей ресторана для индивидуального обеда
        reservirung.add("Ivanov");
        reservirung.add("Petrov");
        reservirung.add("Sidorov");
        reservirung.add("Garmach");
        reservirung.add("Petrenko");
        reservirung.add("Naymenko");
        reservirung.add("Chernenko");
        reservirung.add("Ivanovich");
        System.out.println("Список гостей \n"+reservirung);

        // Проверим гостя в списке
        Scanner poisk = new Scanner(System.in);
        System.out.println("Введи имя гостя: ");
        String surName = poisk.nextLine();

        boolean resultPoisk = reservirung.contains(surName);
        System.out.println(resultPoisk);

        // Отмена резерва
                // Определим номер индекса для удаления
                    int index = reservirung.indexOf(surName);
                    System.out.println("Гость\n"+surName+"в списке: " +index);

                // Удаляем из списка
                    reservirung.remove(index);
                    System.out.println(reservirung);// pechat' posle ydalenia










    }

}
