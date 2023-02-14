import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // ZADACHA 1

        String str1 = "Hello";
        String str2 = "world";
        String subStr1 = str1.substring(0,4);
        String subStr2 = str2.substring(0,4);
        System.out.printf("%S!%n",subStr1+subStr2);

        // OUT PUT : HELLWORL!
        // ZADACHA 2

        Scanner scanner = new Scanner(System.in);
          System.out.println("Enter to the text: ");
            String phrase1 = scanner.nextLine().toLowerCase(Locale.ROOT);
          System.out.println("Press one letter: ");
            String phrase2 = scanner.nextLine().toLowerCase(Locale.ROOT);
            if (!(phrase1.contains(phrase2))){
                System.out.println("Please letter which the string contains: ");
                phrase2 = scanner.nextLine().toLowerCase(Locale.ROOT);
            }
            String newPhrase = phrase1.replace(phrase2,"*").toLowerCase(Locale.ROOT);
        System.out.println(newPhrase);

        // OUT PUT :
       /* Enter to the text: 
ARina
Press one letter:
p
Please letter which the string contains:
i
ar*na


        */





























    }
}