package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int m = 100;
        int summ ;
        int[] mass = new int[m];
        int max = 0;
        int index = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10000);
            System.out.println(mass[i]);
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; i >= j + 2; j++) {
                summ = mass[i - 2] + mass[i - 1] + mass[i];
                if (max < summ) {
                    max = summ;
                    index = i - 2;
                }
            }
        }
        System.out.println("max = " + max);
        System.out.println("index = " + index);
    }
}
