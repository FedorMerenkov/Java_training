package day6;

import java.util.Random;

public class Teacher {
    String name;
    String object;
    String estimation;

    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomMark = random.nextInt(4) + 2;
        this.evaluate(student, randomMark);
    }

    public void evaluate(Student student, int mark) {
        switch (mark) {
            case 2:
                estimation = "неудовлетворительно";
                this.printEvaluationInfo(student);
                break;
            case 3:
                estimation = "удовлетворительно";
                this.printEvaluationInfo(student);
                break;
            case 4:
                estimation = "хорошо";
                this.printEvaluationInfo(student);
                break;
            case 5:
                estimation = "отлично";
                this.printEvaluationInfo(student);
                break;
            default:
                estimation = "Неправильная оценка";
                System.out.println(estimation);
        }
    }

    private void printEvaluationInfo(Student student) {
        System.out.println("Преподаватель " + this.name
                + " оценил студента с именем " + student.getName()
                + " по предмету " + this.object + " на оценку " + this.estimation + ".");
    }

    public String getEstimation() {
        return estimation;
    }

    public void setEstimation(String estimation) {
        this.estimation = estimation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }
}
