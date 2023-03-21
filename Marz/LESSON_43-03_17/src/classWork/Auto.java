package classWork;

public class Auto extends Car{
    int capacity;

    public Auto(int age, String color, int capacity) {
        super(age, color);
        this.capacity = capacity;
    }

    public Auto(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "classWork.Auto{" +
                "capacity=" + capacity +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
