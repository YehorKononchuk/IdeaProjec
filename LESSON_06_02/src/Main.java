import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N:  ");
        int n = scanner.nextInt();
        System.out.println("Input number is. "+n);


        boolean isPrime = true;
        for (int i =2; i<n; i++) {
            double div = n % i;
            System.out.println(div);

            if (div==0){
                isPrime=false;
            }
        }
        if (isPrime){
            System.out.println("Number "+n+" is prime." );
        }else {
            System.out.println("Number "+n+" is NOT prime." );

        }










    }
}