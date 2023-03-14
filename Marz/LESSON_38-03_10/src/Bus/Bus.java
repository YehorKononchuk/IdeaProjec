package Bus;

public class Bus {

        int line;
        String driver;
        int capacity;
        double speed;
        int cost;

    public Bus(int line, String driver, int capacity, double speed, int cost) {
        this.line = line;
        this.driver = driver;
        this.capacity = capacity;
        if (speed > 68) {
        this.speed = speed;}
        else {
            System.out.println(" ne bezopasno ");
        }
        this.cost = cost;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}

