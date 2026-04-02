package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Player p1 = new Player(90);
        Player p2 = new Player(1);
        p2.run();
        p2.run();
        Player.info();
    }
}
