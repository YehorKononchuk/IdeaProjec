package Lektion;

public class Employee {

    int empId;

    String name,address;

    public Employee(int empId, String name, String address) {
        this.empId = empId;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return this.empId + " " + this.name + " " + this.address;
    }
}
