package com.nuriaviveros.examplecarscompany;

import java.util.Objects;

public class Car {
    private String matricula;
    private String modelName;

    private CarType type;
    private Double km;
    private int multas;
    private Boolean isOnSale;

    public Car() {
    }

    public Car(String matricula, String modelName, CarType type, Double km, int multas, Boolean isOnSale) {
        this.matricula = matricula;
        this.modelName = modelName;
        this.type = type;
        this.km = km;
        this.multas = multas;
        this.isOnSale = isOnSale;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Double getKm() {
        return km;
    }

    public void setKm(Double km) {
        this.km = km;
    }

    public int getMultas() {
        return multas;
    }

    public void setMultas(int multas) {
        this.multas = multas;
    }

    public Boolean getOnSale() {
        return isOnSale;
    }

    public void setOnSale(Boolean onSale) {
        isOnSale = onSale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return multas == car.multas && matricula.equals(car.matricula) &&
                modelName.equals(car.modelName) &&
                km.equals(car.km) &&
                Objects.equals(isOnSale, car.isOnSale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
