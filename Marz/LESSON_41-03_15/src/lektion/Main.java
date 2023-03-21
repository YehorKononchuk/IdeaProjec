package lektion;

import lektion.Human;

public class Main {
    public static void main(String[] args) {

        System.out.println("Objects");

        Human h1 = new Human(32,true);
        Human h2 = new Human(32,true);

        System.out.println(h1 == h2);


    }
}