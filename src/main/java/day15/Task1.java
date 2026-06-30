package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\Desktop\\Java_training\\JavaMarathon2020\\src\\main\\resources\\shoes.csv");
        Scanner scanner = new Scanner(file);

        File fileOut = new File("C:\\Users\\user\\Desktop\\Java_training\\JavaMarathon2020\\src\\main\\resources\\missing_shoes.txt");
        PrintWriter pw = new PrintWriter(fileOut);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] array = line.split(";");
            if (Integer.parseInt(array[2]) == 0) {
                pw.println(line);
            }
        }
        pw.close();
        scanner.close();
    }
}
