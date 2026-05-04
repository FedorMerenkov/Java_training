package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Petya");
        User user2 = new User("Vita");
        User user3 = new User("Fedya");

        user1.sendMessage(user2, "Привет Витя");
        user2.sendMessage(user1, "Привет Петя");
        user3.sendMessage(user2, "Привет Витя");
        user1.sendMessage(user3, "Привет Федя");
        user2.sendMessage(user3, "Привет Федя");

        MessageDatabase.showDialog(user1, user2);

    }
}
