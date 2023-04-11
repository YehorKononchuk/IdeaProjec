package exs_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\AIT TR Student\\IdeaProjec\\April\\LESSON_54-04_11\\src\\file.txt"; // имя файла, который нужно прочитать
        String fileContents = readFromFile(fileName);
        System.out.println(fileContents);
    }

    public static String readFromFile(String fileName) {
        StringBuilder fileContents = new StringBuilder(); // создаем StringBuilder, в котором будем хранить содержимое файла
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine(); // читаем первую строку из файла
            while (line != null) { // пока не достигнем конца файла
                fileContents.append(line).append(" "); // добавляем строку в StringBuilder, разделяя пробелом
                line = reader.readLine(); // читаем следующую строку из файла
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContents.toString().trim(); // возвращаем содержимое файла, удаляя последний пробел
    }
}
