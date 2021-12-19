package DataStructures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaComparator {
    public static class Checker implements Comparator<Player> {
        public int compare(Player a, Player b) {
            return Integer.compare(b.score, a.score);
        }
    }

    public static class Player {
        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Player[] players = new Player[n];
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            players[i] = new Player(name, score);
        }
        Checker checker = new Checker();
        Arrays.sort(players, checker);
        for (Player player : players) {
            System.out.printf("%s %s\n", player.name, player.score);
        }
    }
}
