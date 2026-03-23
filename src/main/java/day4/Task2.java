package day4;
import java.lang.Math;

public class Task2 {
    public static void main(String[] args) {
        int n = 100;
        int[] x = new int[n];
        int max = x[0];
        int min = x[0];
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 1001);
            System.out.print(x[i] + " \n");
        }
        for (int a : x) {
            if (a > max) {
                max = a;
            }
        }
        System.out.print("max" + max + " \n");
        for (int a : x) {
            if (a < min) {
                min = a;
            }
        }
        System.out.print("min" + min + " \n");
        for (int a : x) {
            if (a % 10 == 0) {
                count0 = count0 + 1;
            }
        }
        System.out.println("count" + count0 + " \n");
        for (int a : x) {
            if (a % 10 == 0) {
                count1 = count1 + a;
            }
        }
        System.out.println("summ" + count1 + " \n");
    }
}
