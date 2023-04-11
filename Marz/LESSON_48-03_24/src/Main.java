import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Работа с файлами");

        String path = "C:/Users/AIT TR Student/IdeaProjec/Marz/LESSON_48-03_24/src/";
        String fileName = "data.txt";
        String data = "03.12.2023";



        create_file(path,fileName);  // Создаем файл
        writeDataInFile(path,fileName,data);
       String d = readDataFromFile(path,fileName);
        System.out.println("Прочитанно из файла: " + "\n" + data);
        //CRUD ---> create read update delete.
    }



        public static void create_file(String path, String fileName) {
            try {
                File myFile = new File(path + fileName);
                if (myFile.createNewFile()) {
                    System.out.println("Файл создан: " + myFile.getName());
                } else {
                    System.out.println("Файл уже существует.");
                }
            } catch (IOException e) {
                System.out.println("Произошла ошибка.");
                e.printStackTrace();
            }
        }

    private static void writeDataInFile(String path, String fileName, String data) {
        try {
            FileWriter myWriter = new FileWriter(path + fileName); // используем класс и его метод
            myWriter.write(data); // Пишем то, что записываем в файл
            myWriter.close(); // Закрываем метод
            System.out.println("Успешная запись в файл."); // Сообщение об успехе
        } catch (IOException e) {  // поймали ошибку и положили ее в переменную с именем e
            System.out.println("Произошла ошибка."); // Сообщение об ошибке
            e.printStackTrace(); // печать содержания ошибок
        }
    }
    private static String readDataFromFile(String path, String fileName) {
        String data = "";
        try {
            File myFile = new File(path + fileName);
            Scanner myReader = new Scanner(myFile); // готовим сканер для чтения
            while (myReader.hasNextLine()) {
                data = myReader.nextLine(); // считываем строку
            //   System.out.println(data); // печатаем считанную строку
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }
        return data;
    }



















}
