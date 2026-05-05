package com.miempresa.app;

 /**
 * Clase que representa un empleado.
 *
 * @author TuNombre
 * @version 1.0
 */
public class Employee {

    private String name;
    private int years;

    /**
     * Constructor de Employee.
     *
     * @param name Nombre del empleado
     * @param years Años en la empresa
     */
    public Employee(String name, int years) {
        this.name = name;
        this.years = years;
    }

    /**
     * Devuelve el nombre del empleado.
     *
     * @return nombre
     */
  public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
