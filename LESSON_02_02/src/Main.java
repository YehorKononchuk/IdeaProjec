import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        int i = 1;

        while (i<=10) {
            System.out.println(i);
            i++;
        }
        System.out.println("End of While loop ");

 */

// beskonechniy cikl
        /*
        i = 10;
        while (i>1){
            System.out.println(i);
            i++;
        }

         */

        // beskonechniy cikl 2
        /*

        while (true){
            System.out.println("hello");
        }

         */
// obratniy cikl
       // zapis stolbcom
/*
        int i = 10;

        while (i>1){
            System.out.println(i);
            i--;
        }

 */
        // zapis strokoy
/*
         int   i = 10;

        while (i>1) {
            System.out.print(i + "  ");
            i--;
        }

 */
        // vivesti v konsol bykvi stroki c pomochu cikla
        // hello
        /*
        h 0
        e 1
        l 2
        l 3
        o 4
         */

        /*

        String hello="Hello";
        System.out.println(hello.charAt(0));
        System.out.println(hello.charAt(1));
        System.out.println(hello.charAt(2));
        System.out.println(hello.charAt(3));
        System.out.println(hello.charAt(4));

        System.out.println( " Print hello letters with while loop");

        int index = 0;
        int length = hello.length(); // 5 dlinna ili kol vo simvolov

        while (index<length){
            System.out.println(hello.charAt(index));
            index++;

        }

         */

// DO While

        /*
        do
        {
             statement
        }while (condition)
         */

        /*

        int i = 1;
        do {
            System.out.println(i);
            i++;

        }while (i>1);

         */

        // Guess Number game

        /*

        Scanner scanner = new Scanner(System.in);
        int secretNumber = 5;
        int answer;
        do {
            System.out.println("Guess a number between 1 and 10");
            answer=scanner.nextInt();
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

        }while (answer!=secretNumber);

         */

        // napisat programmy vivodichyu na ekran symmy ot 1 do 5
        // 1+2+3+4+5=15

        /*
        int n = 10;

       int i1 = 1;
       int sum = 0;

       while (i1<=n){
           sum = sum +i1;

           System.out.println("i1: "+i1);
           System.out.println("sum: "+sum);
           i1++;

       }
        System.out.println(" sum of digitas from 1 to "+n+"  is "+sum);

         */

        int number = 5;
        long factorial = 1;
        int i = 1;

        while (i <= number) {
            factorial = factorial * i;

            i++;

        }
        System.out.println("factorial of "+number+"is :"+factorial);


        // zadacha 2


        int temp,prodactDigit=1,sumDigit=0;

        int num = 123;

        int mynum =num;

        while (mynum>0)
        {
            temp=mynum%10;
            sumDigit=sumDigit+temp;
            prodactDigit=prodactDigit*temp;
            mynum=mynum/10;

        }
if (sumDigit==prodactDigit)
    System.out.println(num+" is the number");
else
    System.out.println(num+" is not the number ");
















    }
}