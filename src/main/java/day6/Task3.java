package day6;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Fedor");
        Teacher teacher = new Teacher("Nadejda", "Math");
        teacher.evaluate(student);
    }
}
