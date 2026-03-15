package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int m = 100;
        int summ = 0;
        int[] mass = new int[m];
        int[] summa = new int[m];
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        int indexmax1 = 0;
        int indexmax2 = 0;
        int indexmax3 = 0;
        int summ_mass = 0;
        int index = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10000);
            System.out.println(mass[i]);
        }
        for (int i = 0; i < mass.length; i++) {
            if (i > 0 && i < 99) {
                summ = mass[i - 1] + mass[i] + mass[i + 1];
                summa[i] = summ;
                System.out.println(" summa = " + summa[i]);
            } else if (i == 99) {
                summ = mass[i - 1] + mass[i];
                summa[i] = summ;
                System.out.println(" summa = " + summa[i]);

            } else {
                summ = mass[i] + mass[i + 1];
                summa[i] = summ;
                System.out.println(" summa = " + summa[i]);
            }
        }
        for (int i = 0; i < summa.length; i++) {
            if (summa[i] < max1 && summa[i] < max2 && summa[i] > max3) {
                max3 = summa[i];
                indexmax3 = i;
            } else if (summa[i] < max1 && summa[i] > max2 && summa[i] > max3) {
                max2 = summa[i];
                indexmax2 = i;
            } else if (summa[i] > max1 && summa[i] > max2 && summa[i] > max3) {
                max1 = summa[i];
                indexmax1 = i;
            }
        }
        summ_mass = mass[indexmax1] + mass[indexmax2] + mass[indexmax3];
        int[] indexferst = {indexmax1, indexmax2, indexmax3};
        index = indexferst[0];
        for (int i = 1; i < indexferst.length; i++) {
            if (index > indexferst[i]) {
                index = indexferst[i];
            }
        }
        System.out.println(max1 + " " + max2 + " " + max3);
        System.out.println(indexmax1 + " " + indexmax2 + " " + indexmax3);
        System.out.println(index);
        System.out.println(summ_mass);

    }
}
