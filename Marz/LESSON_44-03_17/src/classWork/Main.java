package classWork;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Пример заполнения TreeSet  ");

        TreeSet ts = new TreeSet();

        ts.add("A");
        ts.add("R");
        ts.add("K");
        ts.add("T");
        ts.add("I");
        ts.add("K");
        ts.add("A");
        ts.add("Yehor");
        ts.add("32");

        System.out.println(" Выводим на печать  ");

        System.out.println(ts);

        // пример с целыми числами

        TreeSet tsNum = new TreeSet();

        tsNum.add("1.4");
        tsNum.add("5.9");
        tsNum.add("2.2");
        tsNum.add("6.3");
        tsNum.add("2.3");
        tsNum.add("4.6");


        System.out.println(" Выводим на печать числа");
        System.out.println(tsNum);







    }
}