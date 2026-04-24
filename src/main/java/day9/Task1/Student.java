package day9.Task1;

public class Student extends Human {

    private String groupName;

    public Student(String name, String nameGroup) {
        super(name);
        this.groupName = nameGroup;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + name);
    }

    public String getGroupName() {
        return groupName;
    }

    public void setNameGroup(String groupName) {
        this.groupName = groupName;
    }


}
