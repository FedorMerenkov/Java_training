package day1;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int year = 1980;
        int x = 2020;
        while (year <= x) {
            System.out.println("Олимпиада " + year + " года");
            year += 4;
        }

    }
}
