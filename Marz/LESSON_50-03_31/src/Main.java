import java.time.LocalDate; // import the LocalDate class
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Date and Time Example ");

        LocalDate myToday = LocalDate.now(); // Create a date object

        System.out.println("Date current : " + myToday); // Display the current date

        LocalTime myTime = LocalTime.now();

        System.out.println("Time current : " + myTime); // Display the current time


        LocalDateTime myDateTime = LocalDateTime.now();

        System.out.println("Date + Time current : " + myDateTime); // Display the current date + time

        System.out.println("Before  formatting Date + Time  : " + myDateTime); // Before  formatting Date + Time

        DateTimeFormatter myDateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateTime.format(myDateTimeFormat);

        System.out.println(formattedDate);


    }


}