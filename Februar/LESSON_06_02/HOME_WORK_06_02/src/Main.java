import java.util.Scanner;



public class Main {
    // Написать метод, выводящий на экран куб числа от 1 до заданного числа n
    static void kube(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int numKube = scanner.nextInt();
        for (int i = 1; i <= numKube; i++) {
            System.out.println(" vozvodimoe "+i+" chislo v kube "+i*i*i);
        }
    }
    public static void main(String[] args) {

        kube();














    }
}