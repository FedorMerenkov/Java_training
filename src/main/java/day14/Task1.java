package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\Desktop\\Java_training\\JavaMarathon2020\\src\\main\\java\\day14\\input");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            if (numbers.length != 10) {
                throw new IllegalAccessException();
            }

            int sum = 0;
            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не наеден");
        } catch (IllegalAccessException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
