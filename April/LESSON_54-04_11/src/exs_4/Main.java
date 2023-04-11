package exs_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\AIT TR Student\\IdeaProjec\\April\\LESSON_54-04_11\\src\\file_calc_inp.txt"; // имя входного файла
        String outputFileName = "C:\\Users\\AIT TR Student\\IdeaProjec\\April\\LESSON_54-04_11\\src\\file_calc_out.txt"; // имя выходного файла
        try {
            processFile(inputFileName, outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void processFile(String inputFileName, String outputFileName) throws IOException {
        Map<String, Integer> pricesByCustomer = new HashMap<>(); // словарь, в котором будем хранить суммарные цены для каждого покупателя
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line = reader.readLine(); // читаем первую строку из файла
            while (line != null) { // пока не достигнем конца файла
                String[] parts = line.split(","); // разделяем строку на элементы
                String firstName = parts[0].trim();
                String lastName = parts[1].trim();
                String device = parts[2].trim();
                int price = Integer.parseInt(parts[3].trim());
                String customer = firstName + " " + lastName; // объединяем имя и фамилию в одну строку
                int oldPrice = pricesByCustomer.getOrDefault(customer, 0); // получаем суммарную цену для данного покупателя (если еще не была добавлена, то 0)
                int newPrice = oldPrice + price; // считаем новую суммарную цену
                pricesByCustomer.put(customer, newPrice); // обновляем словарь
                line = reader.readLine(); // читаем следующую строку из файла
            }
        }

        try (FileWriter writer = new FileWriter(outputFileName)) {
            for (Map.Entry<String, Integer> entry : pricesByCustomer.entrySet()) { // проходимся по всем парам "покупатель - суммарная цена"
                String customer = entry.getKey();
                int price = entry.getValue();
                writer.write(customer + " " + price + "\n"); // записываем строку в выходной файл
            }
        }
    }
}

