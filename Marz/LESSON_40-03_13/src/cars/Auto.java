package cars;

import javax.sound.midi.Soundbank;

public class Auto extends Car{

    String brand;

    int capacity;

    public Auto(int age, String usage, int speed, String brand, int capacity) {
        super(age, usage, speed);
        this.brand = brand;
        this.capacity = capacity;
    }

    @Override
    public void go() {
        System.out.println("едем  по дороге всей семьей на нашем  " + brand);
        System.out.println("моя скрость "+speed);
    }

    public void Stop() {
        System.out.println("остановился на запрвке выпить кофе");
        System.out.println(" Нас в машине " + capacity);
        System.out.println("моя скрость "+speed);


    }public void speedUp () {
        System.out.println("Увеличиваю скрость ");
        System.out.println("моя скрость "+speed + 10);



    }public void speedDown () {
        System.out.println("Уменьшаю скрость");
        System.out.println("моя скрость "+(speed - 10));


    }
}
