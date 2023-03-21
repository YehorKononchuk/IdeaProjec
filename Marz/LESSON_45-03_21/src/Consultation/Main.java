package Consultation;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Computer c1 = new Computer("PC",5,500,"MAC");
        Computer c2 = new Computer("NB",10,1000,"MAC");
        Computer c3 = new Computer("PC",8,700,"WND");
        Computer c4 = new Computer("NB",6,800,"MAC");
        Computer c5 = new Computer("PC",3,600,"WND");

        TreeSet computer = new TreeSet<>();

        computer.add(c1);
        computer.add(c2);
        computer.add(c3);
        computer.add(c4);
        computer.add(c5);

        System.out.println(computer);





    }
}
