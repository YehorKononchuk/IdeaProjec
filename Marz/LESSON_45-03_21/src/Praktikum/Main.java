package Praktikum;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet Menu = new TreeSet<>();

        Menu m1 = new Menu("Steak",120,0.100);
        Menu m2 = new Menu("Guliasch",50,0.250);
        Menu m3 = new Menu("Ragu",53,0.300);
        Menu m4 = new Menu("Salat",34,0.25);
        Menu m5 = new Menu("Desert",30,0.150);

        Menu.add(m1);
        Menu.add(m2);
        Menu.add(m3);
        Menu.add(m4);
        Menu.add(m5);

        System.out.println(Menu);






    }
}
