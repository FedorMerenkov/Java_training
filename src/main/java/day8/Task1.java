package day8;

public class Task1 {
    public static void main(String[] args) {
        int count = 1;
        StringBuilder countStringBuilder = new StringBuilder(count);
        for (int i = 1; i <= 20000; i++) {
            countStringBuilder.append(i).append(" ");
        }
        System.out.println(countStringBuilder);
        String countString = " ";
        for (int i = 1; i <= 20000; i++) {
            countString += i + " ";
        }
        System.out.println(countString);
    }
}
