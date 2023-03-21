package SoloProjekt;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Магазин получил поставку фруктов ");

        TreeSet Fruits = new TreeSet<>();

        Fruits f1 = new Fruits("Orange","Namibia",100);
        Fruits f2 = new Fruits("Orange","Gambia",150);
        Fruits f3 = new Fruits("Apple","Poland",170);
        Fruits f4 = new Fruits("Apple","Denmark",200);

        Fruits.add(f1);
        Fruits.add(f2);
        Fruits.add(f3);
        Fruits.add(f4);

        System.out.println(Fruits);





    }
}
