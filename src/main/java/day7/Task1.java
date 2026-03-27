package day7;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing", 20, 20, 20);
        Airplane airplane2 = new Airplane("Aeroflot", 20, 20, 20);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}