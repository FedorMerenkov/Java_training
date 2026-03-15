package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = (a - b);
        int min = 0;
        int max = 0;
        int i = 0;
        String d = "";
        if (a < b){
            min = a;
            max = b;
        }
        else if(b < a){
            min = b;
            max = a;
        }
        else{
            System.out.println("Длина диопазона 0");
        }
        if (c < 0) {
            c = -c;
        }
        while (i < c){
            min++;
            i++;
            if (min < max && min % 5 == 0 && min % 10 != 0){
                d += min + " ";
            }
        }
        System.out.print(d);
    }
}
