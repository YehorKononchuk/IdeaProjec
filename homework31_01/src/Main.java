import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        /*
        Написать программу, проверяющую является ли число четным или нечетным.
        Решить задачу двумя способами -через оператор if и через тернарный оператор
         */

      //  Variant 1

        int num = 9;

        if (num%2==0){
            System.out.println(num+ " Even number");
        }
        else
            System.out.println(num+ " Odd number ");

        // Variant 2

        int num1 = 11;
        String number =(num1%2==0)? "EvenNumber":"OddNumber";
        System.out.println(number);























    }
}