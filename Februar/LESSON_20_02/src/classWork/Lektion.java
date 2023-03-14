package classWork;

import java.util.HashSet;
import java.util.Scanner;
import java.util.HashSet;

public class Lektion {
    public static void main(String[] args) {

                                    // Zadacha "1"

// HashSet<String> latAlpabet = new HashSet<>();
//         System.out.println();
//
//         for (int i = 0; i < 26; i++) {
//             latAlpabet.add(String.valueOf((char)(i+65)));
//
//         }
//         System.out.println(latAlpabet);
//
//         latAlpabet.add("K");
//         System.out.println();
//         System.out.println(latAlpabet);
//

                                     //  Zadacha "2"
        /*
        System.out.println("Ввод индексов с приходящих на почту писем"); // Приглашение пользователю
        Scanner userInput = new Scanner(System.in); // считываем ввод пользователя

        String p_code = ""; // переменная для почтового индекса
        char userChoice; // переменная для выбора пользователя
        int hash = 0;

        HashSet<String> postCode = new HashSet<String>(); //инициализация HashMap

        do {
            System.out.println("Введите индекс письма: ");
            p_code = userInput.next(); // Cчитываем от пользователя индекс
            postCode.add(p_code); // Добавили индекс в HashMap
            // System.out.println(p_code.hashCode());
            // Интерфейс продолжения работы
            System.out.println("Для для остановки нажмите S, чтобы продолжить - любую другую букву.");
            userChoice = userInput.next().toLowerCase().charAt(0); // имя_сканера.next().toLowerCase().charAt(0);
            if (userChoice == 's') {break;}
        } while (true);

        System.out.println("Введенные за смену почтовые индексы: ");
        System.out.println(postCode);
        System.out.println();
        // печать циклом for each
        for (String st : postCode) {
            System.out.println(st);
        }

        System.out.println();
        do {
            System.out.println("Проверка, есть ли уже такой почтовый индекс?");
            System.out.println("Введите индекс письма: ");
            p_code = userInput.next(); // Cчитываем от пользователя индекс
            if (postCode.contains(p_code)) {
                System.out.println("Да, такой индекс уже есть.");
            } else {
                System.out.println("Нет, такого индекса еще нет.");
            };
            // Интерфейс продолжения проверки
            System.out.println("Для для остановки проверки нажмите s, чтобы продолжить - любую другую букву.");
            userChoice = userInput.next().toLowerCase().charAt(0); // имя_сканера.next().toLowerCase().charAt(0);
            if (userChoice == 's') {break;}
        } while (true);

         */

                                // Sadacha 3
        // посчитать количество разных слов в тексте (частоту повторений пока посчитать не можем).
        // Это "класическая" задача на HashMap и "лексический разбор".

                System.out.println("Задача на количество уникальных слов в предложении.");

                String sentence = "В 1800-х годах, в те времена, когда не было еще ни железных, " +
                        "ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных " +
                        "низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, " +
                        "ни либеральных философов-женщин, ни милых дам-камелий," +
                        " которых так много развелось в наше время, – в те наивные времена," +
                        " когда из Москвы, выезжая в Петербург в повозке или карете, " +
                        "брали с собой целую кухню домашнего приготовления, " +
                        "ехали восемь суток по мягкой, пыльной или грязной дороге и верили в " +
                        "пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные " +
                        "осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и " +
                        "тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые " +
                        "свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не " +
                        "одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого " +
                        "угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, " +
                        "наши матери носили коротенькие талии и огромные рукава и решали семейные " +
                        "дела выниманием билетиков, когда прелестные дамы-камелии прятались " +
                        "от дневного света, – в наивные времена масонских лож, мартинистов, " +
                        "тугендбунда, во времена Милорадовичей," +
                        " Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, " +
                        "и кончались дворянские выборы.";
                System.out.println(sentence);




        // разбить предложение на слова с помощью метода .split("divider") и занести эти слова в массив
        // узанть длину массива, то есть количество слов в предложении
        // инициализировать HashSet
        // занести в цикле for все слова в HashMap
        // размер HashMap - это и будеет количество уникальных слов в предложении

        String[] s = sentence.split(" "); // разбили строку на массив слов, разделитель - это " " (пробел).
        int k = sentence.length(); // вычислили количество слов
        System.out.println("Количество символов в предложении: " + k);

        int w = s.length;
        System.out.println("Количество слов в предложении: "+w);

        HashSet<String> words = new HashSet<String>(); // инициализация HashSet

        for ( int i =0  ; i < s.length  ; i++ ) {
            words.add(s[i]); // добавляем в HashSet слова из массива s[i]
        }
        int k1 = words.size(); // определеили размер полученного списка слов
        System.out.println("Количество уникальных слов в предложении: " + k1);
        // напечатаем эти слова
        for (String st : words){
            System.out.println(st);
        }










    }
}