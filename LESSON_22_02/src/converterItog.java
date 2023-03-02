import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class converterItog {
    public static void main (String [] args){while (true) {

        Map<String, Double> exchangeRates = new HashMap<>();

        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.94);
        exchangeRates.put("GBP", 0.82);
        exchangeRates.put("CAD", 1.34);
        exchangeRates.put("HKD", 7.84);

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Привествую вас в конвертере валют. Вы можете использовать следующие валюты: \n");
            for (String currency : exchangeRates.keySet()) {
                System.out.println(" " + currency);
            }
            System.out.println("Выберите валюту которую нужно конвертировать: ");
            String baseCurrency = scanner.nextLine().toUpperCase();
            System.out.println("В какую валюту вы хотите конвертировать: ");
            String targetCurrency = scanner.nextLine().toUpperCase();
//
//                if (!exchangeRates.containsKey(baseCurrency)  !exchangeRates.containsKey(targetCurrency)) {
//                    System.out.println("Вы неправильно ввели коды валют");
//                    break;
//                } else if (exchangeRates.containsKey(baseCurrency)  exchangeRates.containsKey(targetCurrency)) {
//                    continue;
//                }

            System.out.println("Введите сумму: ");
            double sumCurrency = scanner.nextInt();

            double baseRate = exchangeRates.get(baseCurrency);
            double targetRate = exchangeRates.get(targetCurrency);

            double result = (sumCurrency * targetRate) / baseRate;

            System.out.println(sumCurrency + " " + baseCurrency + " = " + result + " " + targetCurrency);

            System.out.println("Хотите продолжить? y/n");
            char choice = scanner.next().toLowerCase().charAt(0);
            if (choice == 'n') {
                System.out.println("Хорошего дня!");
                break;
            }

        } catch (InputMismatchException ex) {
            System.out.println("Вы вместо чисел ввели что-то другое, попробуйте заново!");
            scanner.nextLine();
        } catch (NumberFormatException ex) {
            System.out.println("Вы вместо чисел ввели что-то другое, попробуйте заново!");
            scanner.nextLine();
        } catch (NullPointerException ex) {
            System.out.println("Вы вместо чисел ввели что-то другое, попробуйте заново!");
            scanner.nextLine();
        }
    }
    }
}
