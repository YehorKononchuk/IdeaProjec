import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*


        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.println("Enter an integer: ");
            int num = scanner.nextInt();
            System.out.println("You enter integer: "+num);
            if (num < 0){
                System.out.println("Your entered a negative number: ");
                break;
            }
        }

         */

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num1 = scanner2.nextInt();
        System.out.println("You enter integer: "+num1);

        int sum = 0;

        for (int i=2; i<=num1; i++){
            if (i%2 == 1) continue; // nachli nechetnoe chislo
            sum = sum +i;

        }
        System.out.println(" Summa integer: "+sum);







    }
}