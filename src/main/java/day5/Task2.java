package day5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Red", "BMW", 2000);
        System.out.println("Цвет: " + motorbike.getColor());
        System.out.println("Год выпуска: " + motorbike.getYear());
        System.out.println("Модель: " + motorbike.getModel());
    }
}

class Motorbike {
    int year;
    String color;
    String model;

    public Motorbike(String color, String model, int year) {
        this.color = color;
        this.year = year;
        this.model = model;
        System.out.println("color = " + color + ", model = " + model + ", year = " + year);
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
