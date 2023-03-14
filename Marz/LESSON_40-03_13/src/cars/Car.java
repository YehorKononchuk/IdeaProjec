package cars;
/*Класс Car с полями возраст и применение.
Дочерние классы Bus, Track, Auto.
В классах создаем поля brand и поле, отображающее "загрузку": Bus -> seats, Track -> load_weight,
Auto -> capacity.
Создаем методы во всех классах:
- стоять stop
- ехать go
- ехать быстрее + 10 км/ч speed_up
- ехать медленнее - 10 км/ч speed_down
Цель: убедится, что однин и тот же по названию метод работает с разными классами.

 */

public abstract class Car {

    int age;

    String usage;

    int speed;


    public Car(int age, String usage, int speed) {
        this.age = age;
        this.usage = usage;
        this.speed = speed;
    }



    public void go() {
        System.out.println("еду по дороге");
        System.out.println("моя скрость "+speed);
    }

    public void Stop() {
        System.out.println("остановился");
        System.out.println("моя скрость "+speed);


    }public void speedUp () {
        System.out.println("Увеличиваю скрость ");
        System.out.println("моя скрость "+speed + 10);



    }public void speedDown () {
        System.out.println("Уменьшаю скрость");
        System.out.println("моя скрость "+(speed - 10));


    }
}
