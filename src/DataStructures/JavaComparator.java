package DataStructures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaComparator {
    public static class Checker implements Comparator<Player> {
        public int compare(Player a, Player b) {
            int firstCmp = Integer.compare(b.score, a.score);
            return firstCmp == 0 ? a.name.compareTo(b.name) : firstCmp;
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
        scanner.nextLine(); // Consume newline character
        Player[] players = new Player[n];
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
//            String line = scanner.nextLine();
//            String[] tokens = line.split(" ");
//            String name = tokens[0];
//            int score = Integer.parseInt(tokens[1]);
            players[i] = new Player(name, score);
        }
        scanner.close();
        Checker checker = new Checker();
        Arrays.sort(players, checker);
        for (Player player : players) {
            System.out.printf("%s %s\n", player.name, player.score);
        }
    }
}
