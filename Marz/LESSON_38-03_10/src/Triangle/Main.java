package Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = null;

        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите 1ю сторону треугольника");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Введите 2ю сторону треугольника");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Введите 3ю сторону треугольника");
        int c = Integer.parseInt(br.readLine());

        br.close();

        Triangle t1 = new Triangle(a,b,c);





    }
}


