package cars;

public class Bus extends Car{

    String brand;

    int seats;

    public Bus(int age, String usage, int speed, String brand, int seats) {
        super(age, usage, speed);
        this.brand = brand;
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void go() {
        System.out.println("еду по дороге с пасажирами " + seats);
        System.out.println("моя скрость "+speed);
    }

    public void stop() {
        System.out.println("остановился вышли пасажиры");
        System.out.println(" Осталось пасажиров "+ (seats-2));
        System.out.println("моя скрость "+speed);


    }

    @Override
    public void speedUp() {
        super.speedUp();
    }

    @Override
    public void speedDown() {
        super.speedDown();
    }
}
