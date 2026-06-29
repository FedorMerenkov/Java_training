package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> massages = new ArrayList<>();

    public static List<Message> getMessages() {
        return massages;
    }

    public static void addNewMessage(User sender, User receiver, String text) {
        massages.add(new Message(sender, receiver, text));
    }

    public static void showDialog(User u1, User u2) {
        for (Message message : massages) {
            if (message.getSender() == u1 && message.getReceiver() == u2
                    || message.getSender() == u2 && message.getReceiver() == u1) {
                System.out.println(message.getSender() + ": " + message.getText());
            }
        }
    }

}
