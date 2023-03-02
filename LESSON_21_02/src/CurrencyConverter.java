import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Заполнить массив курсов обмена валют
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.822);
        exchangeRates.put("GBP", 0.718);
        exchangeRates.put("JPY", 108.70);
        exchangeRates.put("CAD", 1.26);
        exchangeRates.put("AUD", 1.29);
        exchangeRates.put("CHF", 0.89);

        // Печатаем общий массив
        for (String i : exchangeRates.keySet()) {
            System.out.println("Валюта: " + i +  " | " + exchangeRates.get(i));
        }

        // Запросить у пользователя валюты для конвертации и сумму
        System.out.println("Введите код исходной валюты (например, USD):");
        String baseCurrency = scanner.nextLine().toUpperCase(); // Перевести код валюты в верхний регистр
        System.out.println("Введите код целевой валюты (например, EUR):");
        String targetCurrency = scanner.nextLine().toUpperCase(); // Перевести код валюты в верхний регистр
        System.out.println("Введите сумму для конвертации:");
        double amount;
        try {
            amount = Double.parseDouble(scanner.nextLine()); // Преобразовать строку в число
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат суммы");
            return;
        }

        // Проверить, что коды валют существуют в массиве курсов
        if (!exchangeRates.containsKey(baseCurrency) || !exchangeRates.containsKey(targetCurrency)) {
            System.out.println("Неверный код валюты");
            return;
        }

        // Получить курс обмена валют из массива курсов
        double baseRate = exchangeRates.get(baseCurrency);
        double targetRate = exchangeRates.get(targetCurrency);

        // Выполнить конвертацию и отобразить результат
        double result = (amount / baseRate) * targetRate;
        System.out.printf("%f %s = %f %s", amount, baseCurrency, result, targetCurrency);
    }
}
