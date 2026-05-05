package com.miempresa.app;

import java.util.ArrayList;
import java.util.List;

public class App {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(String name, int years) {

        Employee employee = new Employee(name, years);

        employees.add(employee);

        System.out.println(name + " added to the system.");
    }

    public void printEmployees() {

        System.out.println("List of employees:");

        for (int i = 0; i < employees.size(); i++) {

            Employee employee = employees.get(i);

            System.out.println(
                employee.getName()
                + ", Years in company: "
                + employee.getYears()
            );
        }
    }

    public static void main(String[] args) {

        App manager = new App();

        manager.addEmployee("John Doe", 5);
        manager.addEmployee("Jane Smith", 2);

        manager.printEmployees();
    }
}