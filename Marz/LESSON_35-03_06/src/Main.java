public class Main {

    public static void main(String[] args) {

            class Car {
                String brand;
                String color;
                int year;
                String type;


            }
            Car myCar = new Car();
            myCar.brand = "VW";
            myCar.color = "silver";
            myCar.type = "universal";
            myCar.year = 2018;

        System.out.println("Brand auto "+myCar.brand+"Color "+ myCar.color);
    }
}