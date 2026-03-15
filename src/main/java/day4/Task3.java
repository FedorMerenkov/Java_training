package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int n = 8;
        int m = 12;
        int max = 0;
        int index = 0;
        int[][] mass = new int[n][m];
        for (int i = 0; i < mass.length; i++) {
            int summa = 0;
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 51);
                summa = summa + mass[i][j];
                System.out.print(mass[i][j]+ " ");
            }

            if (max < summa ) {
                max = summa;
                index = i;
            }
            System.out.print("\n");
        }
        System.out.print(" \n" + max + " \n");
        System.out.print(index + " \n");

    }
}
