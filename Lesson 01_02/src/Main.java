import com.sun.source.tree.CaseTree;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // SWITCH
       /*
        switch (expression){

        case constant1:
         statement sequence
         break;

         case constant2:
          statement sequence
          break;

          case constant3:
           statement sequence
           break;

         ......

         default
            statement sequence

            }


        */

        int i = 1;

        switch (i) {
            case 0:
                System.out.println("i is zero");
                break;
            case 1:
                System.out.println("i is one");
                break;
            case 2:
                System.out.println("i is two");
                break;
            case 3:
                System.out.println("i is three");
                break;
            default:
                System.out.println("i is more than 3");
        }


        char ch = 'A';

        switch (ch) {
            case 'D':
                System.out.println("case D");
                break;
            case 'C':
                System.out.println("case C");
                break;
            case 'A':
                System.out.println("case A");
                break;
            default:
                System.out.println("another case");

        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Help on");
        System.out.println("1.if");
        System.out.println("2.switch");
        System.out.println("Enter number ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println(" The if: ");
                System.out.println("if (condition statement;");
                System.out.println("else statement;");
                break;
            case 2:
                System.out.println("the traditional switch ");
                System.out.println("switch (expression){ ");
                System.out.println(" case constant: ");
                System.out.println(" statement sequence");
                System.out.println(" break;");
                System.out.println("}");
                break;
            default:
                System.out.println("Your selection is not found");

        }
// Calculator

        /*
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter number one ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter number two ");
        int num2 = scanner.nextInt();
        System.out.println("Please enter action ");
        String action1 = scanner.next();


        switch (action1) {
            case "+":
                System.out.println("Result: "+ (num1+num2));
                break;
            case "-":
                System.out.println("Result: "+ (num1-num2));
                break;
            case "*":
                System.out.println("Result: "+ (num1*num2));
                break;
            case "/":
                System.out.println("Result: "+ (num1/num2));
                break;
                default:
                throw new IllegalStateException("Unexpected value: " + action1);
        }

         */

        // opredelenie glasnix
        /*
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a character ");
        char ch1 = scanner1.next().charAt(0);

        boolean  isVowel = false;

        switch (ch1){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'Y':   isVowel = true;

        }
        if (isVowel){
            System.out.println(ch1+ "is a vowel");
        }
        else {
            if ((ch1>='a'&&ch1<='z')||(ch1>='A'&&ch1<='Z'))
                System.out.println(ch1+ "is a consonant");
            else
                System.out.println(" Your symbol is not English letter");
        }

         */

        // Opredelenie goda

        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" Enter year ");
        int year = scanner.nextInt();

        System.out.println(" Enter month number from 1 _ 12");
        int month = scanner.nextInt();

        switch (month){
            case 1:
                System.out.println("January, 31 days");
                break;
            case 2:
                int numberOfDaysFebruary;
                if
                ((year%4==0)&&(((year%100)!=0)||((year%100==0)&&(year%400==0))));
            {
                numberOfDaysFebruary=29;
            }
                else  {
                    numberOfDaysFebruary=28;
                }
            System.out.println("February "+numberOfDaysFebruary);
                break;
            case 3:
                System.out.println("March, 31 days");
                break;
            case 4:
                System.out.println("April, 30 days");
                break;







        }


























































    }
}




























