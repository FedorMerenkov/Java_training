package day16;

import java.io.FileNotFoundException;
import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\user\\Desktop\\Java_training\\JavaMarathon2020\\file1.txt");
        file1.createNewFile();
        PrintWriter pw1 = new PrintWriter(file1);
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();

            int x = random.nextInt(100);
            pw1.print(x + " ");
        }
        pw1.close();
        File file2 = new File("C:\\Users\\user\\Desktop\\Java_training\\JavaMarathon2020\\file2.txt");
        file2.createNewFile();
        PrintWriter pw2 = new PrintWriter(file2);
        Scanner scanner1 = new Scanner(file1);

        String line = scanner1.nextLine();
        String[] number = line.split(" ");
        double sum = 0;
        int i = 0;
        while (i < 1000) {
            for (int j = 0; j < 20; j++) {
                sum += Integer.parseInt(number[j + i]);
            }
            i += 20;

            double result = sum / 20;
            pw2.println(result);
            sum = 0;
        }

        pw2.close();
        System.out.println((int) printResult(file2));
    }

    public static double printResult(File file) throws FileNotFoundException {
        Scanner scanner2 = new Scanner(file);
        double result = 0;
        while (scanner2.hasNextLine()) {
            result += Double.parseDouble(scanner2.nextLine());
        }
        return result;
    }
}
