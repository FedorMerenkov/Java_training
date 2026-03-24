package day6;

public class Teacher {
    String name;
    String object;
    int x = 0;
    String estimation;
    public Teacher(String name, String object){

    }
    public void evaluate(Student student){
        x = (int)(Math.random()*4 )+2;
        switch(x){
            case 2:
                estimation = "неудовлетворительно";
                break;
            case 3:
                estimation = "удовлетворительно";
                break;
            case 4:
                estimation = "хорошо";
                break;
            case 5:
                estimation = "отлично";
                break;
            default:
                estimation = "Нет такой оенки";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + object + " на оценку " + estimation);
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
