import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class converter {
    public static void main (String [] args){

        Map <String,Double>  exchangeRates = new HashMap<>();

        exchangeRates.put("USD",1.0);
        exchangeRates.put("EUR",0.94);
        exchangeRates.put("GBP",0.82);
        exchangeRates.put("CAD",1.34);
        exchangeRates.put("HKD",7.84);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Привествую вас в конвертере вы можете использовать следующие валюты: \n");
        for (String currency : exchangeRates.keySet()){
            System.out.println(" "+currency);
        }
        System.out.println("Выберите валюту которую нужно конвертировать: ");
        String baseCurrency = scanner.nextLine().toUpperCase();
        System.out.println("В какую валюту вы хотите конвертировать: ");
        String targetCurrency = scanner.nextLine().toUpperCase();
        System.out.println("Введите сумму: ");
        double sumCurrency = scanner.nextInt();

        double baseRate = exchangeRates.get(baseCurrency);
        double targetRate = exchangeRates.get(targetCurrency);

        double result = (sumCurrency*targetRate)/baseRate;

        System.out.println(sumCurrency + " " + baseCurrency + " = " + result + " " + targetCurrency);




























    }
}
