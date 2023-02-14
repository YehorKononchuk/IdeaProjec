package ClassWork;

import java.util.Scanner;

public class NOD {
    public static void main(String[] args) {
        System.out.println("нахождения НОД для двух целых чисел a и b");
        // НОД - наибольший общий делитель
        int nod =0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter numbers 'a':");
        int a = sc.nextInt();
        System.out.println(" enter numbers 'b':");
        int b = sc.nextInt();
        System.out.println("you enter number " + a + " and " + b);

        int min = min(a, b);
        int max = max(a, b);
        System.out.println(" Меньшее число: "+min);
        System.out.println(" Большое число: "+max);

        for (int i = 1; i <=min; i++) {
            if (min%i==0){
                if (max%i==0) {
                    nod = i;
                }
            }
        }
        System.out.println(" HОД чисел: "+a+ " и "+b+" = "+nod);
    }
    public static int min(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else return num2;
    }
    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else return num2;
    }
}