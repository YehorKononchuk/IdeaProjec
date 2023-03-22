package Lektion;

import java.util.Comparator;

public class SortbyID implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.empId, o2.empId);

    }
}
