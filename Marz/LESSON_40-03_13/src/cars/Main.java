package cars;


public class Main {
    public static void main(String[] args) {

        System.out.println(" Transport ist : ");

        Bus bus = new Bus(20,"public transport",60,"Mercedes",125);
        Bus bus1 = new Bus(10,"Public Transport",60,"Mercedes",160);
        bus.go();
        bus.speedUp();
        bus.speedDown();
        bus.stop();




    }
}
