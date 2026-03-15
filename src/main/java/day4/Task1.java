package day4;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] mass = new int[n];
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int summ = 0;
        for (int i = 0; i < mass.length; i++){
            int b = (int) (Math.random()*11);
            mass[i] = b;
            if (mass[i] > 8){
                count = count + 1;
            }
            else if (mass[i] == 1){
                count1 = count1 + 1;
            }
            else if (mass[i] % 2 == 0)
                count2 = count2 + 1;
            else if (mass[i] % 2 != 0)
                count3 = count3 + 1;
            summ = summ + mass[i];
        }
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + count);
        System.out.println("Количество чисел равных 1: " + count1);
        System.out.println("Количество четных чисел: " + count2);
        System.out.println("Количество нечетных чисел: " + count3);
        System.out.println("Сумма всех элементов массива: " +  summ);
    }
}
