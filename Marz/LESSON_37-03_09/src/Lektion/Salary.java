package Lektion;

import Lektion.Employee;

public class Salary extends Employee {

   private double salary;

    public Salary(String name, String email, int id_num, double salary) {
        super(name, email, id_num);
        this.salary = salary;
    }

    public void mailPaySlip(){
        System.out.println("это метод класса Salry ");
        System.out.println("Увадажаемый "+getName()+"направляем информацию о зп "+getEmail());
        System.out.println("Ваша годовая зп "+getSalary());
        System.out.println("Ваша месячная зарлата "+getSalary()/12);

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        // this.salary = salary;
        if (newSalary >0 ){
            salary = newSalary;
        }
    }
}
