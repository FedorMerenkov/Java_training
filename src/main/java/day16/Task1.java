package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\Desktop\\Java_training\\JavaMarathon2020\\src\\main\\java\\day16\\input");
        printResult(file);
    }

    public static void printResult(File file1e) {
        try {

            Scanner scanner = new Scanner(file1e);

            String line = scanner.nextLine();
            String[] number = line.split(" ");

            int sum = 0;
            for (String numbers : number) {
                sum += Integer.parseInt(numbers);
            }
            double result = sum / (double) number.length;
            System.out.printf(result + " --> %.3f", result);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
