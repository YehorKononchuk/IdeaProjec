import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*

        // ZADACHA 1

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number ");
        int n = scanner.nextInt();
        int i = 1;
        while (i<=n){
            System.out.print(" This is "+i+" to the power of 3: ");
            int sum1 = i*i*i;
            System.out.println(sum1);
            i++;
        }

        // ZADACHA 2

        System.out.println(" Enter the number for multiplying ");
        int n2 = scanner.nextInt();
        int i2 = 0;
        while (i2<=n2){
            int sum = n2*i2;
            System.out.print(sum+", ");
            i2++;
        }

         */

        Scanner scanner = new Scanner(System.in);
        int secretNumber = 5;
        int answer;
        int index = 0;
        do {
            System.out.println("Guess a number between 1 and 10");
            answer=scanner.nextInt();
            index++;
            if (secretNumber==answer){
                System.out.println("Great! You winn");
            }
            else {
                System.out.print(" Sorry, the number  is ");
                if (answer<secretNumber){
                    System.out.println(" too small ");
                }
                else {
                    System.out.println("too big");
                }
                System.out.println(" try again ");
            }
            if (index==3&&answer!=secretNumber){
                System.out.println("Game Over");
                break;
            }

        }while (answer!=secretNumber);














    }
}