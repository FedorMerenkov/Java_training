package day6;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2002);
        car.setModel("Пежо");
        Motorbike motorbike = new Motorbike(" ", " ", 2000);
        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(2020));
        System.out.println(motorbike.yearDifference(2001));

    }
}
