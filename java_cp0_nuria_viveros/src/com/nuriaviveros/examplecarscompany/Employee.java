package com.nuriaviveros.examplecarscompany;

import java.util.ArrayList;
import java.util.Objects;

public class Employee {

    private String dni;
    private String nameSurName;

    private Double salary;

    private ArrayList<Car> cars = new ArrayList<>();

    public Employee() {
    }


    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public Employee(String dni, String nameSurName, Double salary, ArrayList<Car> cars) {
        this.dni = dni;
        this.nameSurName = nameSurName;
        this.salary = salary;
        this.cars = cars;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNameSurName() {
        return nameSurName;
    }

    public void setNameSurName(String nameSurName) {
        this.nameSurName = nameSurName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return dni.equals(employee.dni) && nameSurName.equals(employee.nameSurName) && salary.equals(employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nameSurName, salary);
    }
}
