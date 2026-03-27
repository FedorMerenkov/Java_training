package day6;

import java.lang.Math;

public class Car {
    int carYear;
    String carColor;
    String carModel;

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setModel(String carModel) {
        this.carModel = carModel;
    }

    public String getModel() {
        return carModel;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int year) {
        return Math.abs(this.carYear - year);
    }
}
