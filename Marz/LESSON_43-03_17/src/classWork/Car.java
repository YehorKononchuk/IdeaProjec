package classWork;

public class Car {

    static final String model = "mers";

    int age;

String color;


    public Car(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public Car() {

    }

    public void paint(){
      System.out.println(" Color auto ist : ");
  }


    @Override
    public String toString() {
        return "classWork.Car{" +
                "age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

