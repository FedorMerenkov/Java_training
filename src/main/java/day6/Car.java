package day6;

import java.lang.Math;

public class Car {
    int year;
    String color;
    String model;
    int x;
    int y;

    public void setYear(int yearCar) {
        year = yearCar;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String colorCar) {
        color = colorCar;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String modelCar) {
        model = modelCar;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int y) {
        return Math.abs(year - y);
    }


}
