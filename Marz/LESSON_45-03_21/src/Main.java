import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Сравнение домов");

        TreeSet<House> houses = new TreeSet<House>();

        House h1 = new House(120,1300,"Berlin");
        House h2 = new House(130,1550,"München");
        House h3 = new House(143,1380,"Frankfurt");
        House h4 = new House(124,1430,"Baden");
        House h5 = new House(126,1570,"Viena");
        House h6 = new House(89,980,"Dortmund");

        houses.add(h1);
        houses.add(h2);
        houses.add(h3);
        houses.add(h4);
        houses.add(h5);
        houses.add(h6);


        System.out.println(houses);
    }
}