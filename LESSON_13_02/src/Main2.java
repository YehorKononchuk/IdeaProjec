import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[]args){
        System.out.println("Privet!");
        System.out.println("Calculate the perimeter of the room.");
        char choise_y_or_n;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the length : ");
                int a = scanner.nextInt();
                System.out.println("Enter the width : ");
                int b = scanner.nextInt();
                System.out.println("Perimeter of the room : " + 2 * (a + b));
            }catch (InputMismatchException e){
                System.out.println(" Vvedeno ne chislo ");
            }
            System.out.println("continue or complete?  y/n ");
            choise_y_or_n =scanner.next().toLowerCase().charAt(0);
            if (choise_y_or_n =='n'){
                break;
            }else {
                continue;
            }

        }





    }
}
