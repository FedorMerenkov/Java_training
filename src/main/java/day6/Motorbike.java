package day6;

import java.lang.Math;

public class Motorbike {
    int year;
    String color;
    String model;

    public Motorbike(String color, String model, int year) {
        this.color = color;
        this.year = year;
        this.model = model;
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

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int year) {
        return Math.abs(this.year - year);
    }

}
