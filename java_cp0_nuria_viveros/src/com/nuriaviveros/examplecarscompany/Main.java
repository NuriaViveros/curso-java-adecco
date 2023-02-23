package com.nuriaviveros.examplecarscompany;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("1234HDZ", "RENAULT CLIO", CarType.BERLINA, 100.000D, 0, Boolean.valueOf(false));
        Car car2 = new Car("5678FAL", "SEAT GRANADA", CarType.UTILITARIO, 15567D, 3, Boolean.valueOf(true));
        Car car3 = new Car("6789NRD", "SEAT IBIZA", CarType.SPORT, 15567D, 3, Boolean.valueOf(true));
        Car car4 = new Car("0987RTG", "MUSTANG", CarType.BERLINA, 34567D, 3, Boolean.valueOf(true));
        Car car5 = new Car("4667KRE", "SEAT AROSA", CarType.BERLINA, 15567D, 2, Boolean.valueOf(true));
        Car car6 = new Car("3244GTR", "VOLSWAGEN GOLF", CarType.SPORT, 15567D, 1, Boolean.valueOf(true));

        ArrayList<Car> carsEmployee1 = new ArrayList<>(Arrays.asList(car1, car2));
        ArrayList<Car> carsEmployee2 = new ArrayList<>(Arrays.asList(car3));
        ArrayList<Car> carsEmployee3 = new ArrayList<>(Arrays.asList(car4, car5));
        ArrayList<Car> carsEmployee4 = new ArrayList<>(Arrays.asList(car6));


        Employee employee1 = new Employee("29654321R", "FRANCISCO GONZÁLEZ", 25000D, carsEmployee1);
        Employee employee2 = new Employee("98764321L", "ANGELA FERNÁNDEZ", 30000D, carsEmployee2);
        Employee employee3 = new Employee("09864321M", "CHIARA FERRAGNI", 100000D, carsEmployee3);
        Employee employee4 = new Employee("85164321M", "NAIARA URIBE", 150000D, carsEmployee4);
        Employee employee5 = new Employee("98764321L", "ALBERTO FIGUEROA", 200000D, new ArrayList<Car>());


        ArrayList<Employee> employeesCompany1 = new ArrayList<>(Arrays.asList(employee1, employee2));
        ArrayList<Employee> employeesCompany2 = new ArrayList<>(Arrays.asList(employee3, employee4));
        ArrayList<Employee> employeesCompany3 = new ArrayList<>(Arrays.asList(employee5)); //Este empleado no tiene coches


        ArrayList<Company> companies = new ArrayList<>();
        companies.add(0, new Company("ZARA HOME", "123457890", employeesCompany1));
        companies.add(1, new Company("MIOT", "67812345", employeesCompany2));
        companies.add(2, new Company("BAR SPORT", "093421445", employeesCompany3));

        // Cuántos coches tiene una determinada compañia y de qué tipo
        // Primero recorro los empleados de la compañía
        // Luego recorro los coches de cada empleado de la compañía


        for (Company company : companies) {
            System.out.println("COMPANY: " + company.getName() +" ");
            for (Employee employee : company.getEmployees()) {
                System.out.println("CARS: ");
                for (Car car : employee.getCars()) {
                    System.out.println(car.getModelName() +" "+ car.getMatricula());
                }
            }
        }


    }
}
