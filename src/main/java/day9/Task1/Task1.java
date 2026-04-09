package day9.Task1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Ваня", "103");
        Teacher teacher = new Teacher("Эдуарт", "Матан");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();

    }
}
