package day5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Car Car1 = new Car();
        Car1.setColor("Red");
        Car1.setYear(2000);
        Car1.setModel("BMW");
        System.out.println("Цвет: " + Car1.getColor());
        System.out.println("Год выпуска: " + Car1.getYear());
        System.out.println("Модель: " + Car1.getModel());
    }
}

class Car {
    int year;
    String color;
    String model;

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

}
