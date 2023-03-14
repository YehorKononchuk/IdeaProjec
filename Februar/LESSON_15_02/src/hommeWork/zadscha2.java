package hommeWork;
import java.util.Arrays;

public class zadscha2 {
    public static void main(String[] args) {

        String[] names = {"Иван", "Петр", "Андрей", "Мария", "Ольга", "Светлана", "Дмитрий", "Николай", "Елена", "Сергей"};
        double[] results = {12.8, 13.2, 14.1, 13.8, 13.9, 14.5, 12.7, 13.5, 12.5, 14.3};

        // Проверяем, что количество имен и результатов совпадает
        if (names.length != results.length) {
            System.out.println("Ошибка: количество имен не совпадает с количеством результатов");
            return;
        }
        // Связываем каждое имя с соответствующим результатом
        String[] resultsWithNames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            resultsWithNames[i] = names[i] + " - " + results[i] + " секунд";
        }
        // Сортируем результаты с именами
        Arrays.sort(resultsWithNames);
        // Выводим отсортированный список результатов с именами
        System.out.println("Результаты забега:");
        for (String resultWithName : resultsWithNames) {
            System.out.println(resultWithName);
        }
        // Находим индексы первого и последнего места
        int firstPlaceIndex = 0;
        int lastPlaceIndex = names.length - 1;
        for (int i = 0; i < results.length; i++) {
            if (results[i] < results[firstPlaceIndex]) {
                firstPlaceIndex = i;
            }
            if (results[i] > results[lastPlaceIndex]) {
                lastPlaceIndex = i;
            }
        }
        // Выводим имена участников, занявших первое и последнее места, и их результаты
        System.out.println(names[firstPlaceIndex] + " занял(а) первое место с результатом " + results[firstPlaceIndex] + " секунд");
        System.out.println(names[lastPlaceIndex] + " занял(а) последнее место с результатом " + results[lastPlaceIndex] + " секунд");
    }
}

