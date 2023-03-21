package classWork;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        Car car1 = new Car(23,"Blau");
    //    classWork.Car.model = " model 1 ";
        car1.paint();


        System.out.println(car1);

        Auto auto1 = new Auto(24,"red",5);
        auto1.paint();
        System.out.println("malen in Fabrick");
        System.out.println(auto1);


    }
}