package Lektion;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("    Sorting Employee ");
        System.out.println();

        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();

        employeeArrayList.add(new Employee(1013,"Viktor","Berlin"));
        employeeArrayList.add(new Employee(1010,"Anton","Hamburg"));
        employeeArrayList.add(new Employee(1008,"Daniel","Dresden"));


        System.out.println("Unsorted Data");
        for (int i = 0; i < employeeArrayList.size(); i++) {
            System.out.println(employeeArrayList.get(i));
        }
        System.out.println();

        Collections.sort(employeeArrayList,new SortbyID());
        System.out.println(" Sorted data according to Employee IDs");
        //print
        for (int i = 0; i < employeeArrayList.size(); i++) {
            System.out.println(employeeArrayList.get(i));
        }
        System.out.println();


        Collections.sort(employeeArrayList, new SortbyName());
        System.out.println(" Sorted data according to Employee Names");
        //print
        for (int i = 0; i < employeeArrayList.size(); i++) {
            System.out.println(employeeArrayList.get(i));
        }

    }
}