package day7;

import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        if (countPlayers < 6) {
            this.stamina = stamina;
            this.countPlayers++;
        } else {
            return;
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }


    public void run() {
        if (stamina == MIN_STAMINA) {
            return;
        }
        stamina -= 1;
        if (stamina == MIN_STAMINA) {
            System.out.println("Игроку " + countPlayers + " нужен отдых");
            countPlayers--;
        }
    }



    public static void info() {
        if (countPlayers < 6 ) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else if (countPlayers == 6) {
            System.out.println("На поле нет свободных мест");
        } else {
            return;
        }
    }
    public int getStamina() {
        return stamina;
    }
}