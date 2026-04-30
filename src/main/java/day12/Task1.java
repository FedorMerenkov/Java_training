package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> car = new ArrayList<String>();
        car.add("Mercedes-Benz");
        car.add("BMW");
        car.add("Audi");
        car.add("Volkswagen");
        car.add("Porsche");
        car.add(2,"Opel");
        car.remove(0);
        System.out.println(car);
    }
}
