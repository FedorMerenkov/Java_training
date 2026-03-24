package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing", 10, 20, 1000);
        airplane.setYear(2000);
        airplane.setLength(60);
        airplane.fillUp(10);
        airplane.fillUp(20);
        airplane.info();
    }

}
