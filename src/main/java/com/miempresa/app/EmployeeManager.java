package com.miempresa.app;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

     private List<Employee> employees = new ArrayList<>();

    /**
     * Añade un nuevo empleado al sistema.
     *
     * @param name nombre del empleado
     * @param years años en la empresa
     */
    public void addEmployee(String name, int years) {

        Employee employee = new Employee(name, years);
        employees.add(employee);

        System.out.println(name + " añadido al sistema.");
    }

    /**
     * Muestra por pantalla la lista de empleados.
     * Recorre la lista utilizando un bucle for-each.
     */
    public void printEmployees() {

        System.out.println("Lista de empleados:");

        for (Employee employee : employees) {

            System.out.println(
                employee.getName()
                + ", Years in company: "
                + employee.getYears()
            );
        }
    }

    /**
     * Método principal del programa.
     *
     * @param args argumentos de ejecución
     */
    public static void main(String[] args) {

        App manager = new App();

        manager.addEmployee("John Doe", 5);
        manager.addEmployee("Jane Smith", 2);

        manager.printEmployees();
    }
}