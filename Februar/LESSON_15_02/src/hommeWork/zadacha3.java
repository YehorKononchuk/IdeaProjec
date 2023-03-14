package hommeWork;

import java.util.ArrayList;
import java.util.Collections;

public class zadacha3 {
    public static void main(String[] args) {

        ArrayList<String> reservirung = new ArrayList<>();

        // Имена гостей ресторана для индивидуального обеда
        reservirung.add("Ivanov");
        reservirung.add("Petrov");
        reservirung.add("Sidorov");
        reservirung.add("Garmach");
        reservirung.add("Petrenko");
        reservirung.add("Naymenko");
        reservirung.add("Chernenko");
        reservirung.add("Ivanovich");

        //Несортированный список:
        System.out.println("Список гостей");
        for (String str : reservirung) {
            System.out.println(str);
        }

        //Сортировка в обратном порядке
        Collections.sort(reservirung, Collections.reverseOrder());

        //Отсортированный список в обратном порядке
        System.out.println("Список гостей в обратном порядке: ");
        for (String str : reservirung) {
            System.out.println(str);


        }
    }
}
