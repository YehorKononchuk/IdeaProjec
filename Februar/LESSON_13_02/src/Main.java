import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import static javax.management.Query.div;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Деление на 0:");
        int a = 100; int b = 0;
        try { int div = a / b;
        }
        catch (Exception e) {
            System.out.println("Зачем вы делите на ноль???"); }

         */

        Scanner scanner = new Scanner(System.in);
        char choice_y_or_n;


        while (true) {
            try {
                System.out.println("Enter the number 'a': ");
                int a = scanner.nextInt();
                System.out.println("Enter the number 'b': ");
                int b = scanner.nextInt();
                int c = div(a, b);
                System.out.println("Privat " + a + "/" + b + "=" + c);
            } catch (ArithmeticException e){
                System.out.println(e.getMessage()+ " can't divide by zero ");
            }
            catch (InputMismatchException e){
                System.out.println(e.getMessage()+ " no enter symbol, pleas enter number : " );
            }
            System.out.println(" continue typing ?");
            choice_y_or_n = scanner.next().toLowerCase().charAt(0);
            if (choice_y_or_n=='n'){
                break;
            }else continue;


        }
    }
    public static int div (int num1, int num2){
        return num1/num2;
    }

}

