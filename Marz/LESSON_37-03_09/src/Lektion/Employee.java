package Lektion;

public abstract class Employee {
    private String name;
    private String email;
    private int id_num;


    public Employee(String name, String email, int id_num) {
        this.name = name;
        this.email = email;
        this.id_num = id_num;
    }

    // метод для отправки
    public void mailPaySlip(){
        System.out.println("это метод класса Lektion.Employee ");
        System.out.println("Увадажаемый "+this.name+"направляем информацию о зп "+this.email);
    }
    //
    @Override
    public String toString() {
        return "Lektion.Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id_num=" + id_num +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId_num() {
        return id_num;
    }
}
