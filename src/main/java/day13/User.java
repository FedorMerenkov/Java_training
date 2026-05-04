package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscription;

    public User(String username) {
        this.username = username;
        this.subscription = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscription;
    }

    public void subscribe(User user) {
        this.subscription.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User currentUser : subscription) {
            if (currentUser.getUsername().equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    public String toString() {
        return username;
    }
}
