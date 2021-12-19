package DataStructures;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaList {
    static String INSERT = "Insert";
    static String DELETE = "Delete";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> L = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            L.add(scanner.nextInt());
        }
        int Q = scanner.nextInt();
        for (int j = 0; j < Q; j++) {
            scanner.nextLine(); // Consume newline character
            String command = scanner.nextLine();
            if (command.equals(INSERT)) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                L.add(x, y);
            }
            if (command.equals(DELETE)) {
                int x = scanner.nextInt();
                L.remove(x);
            }
        }
        String toPrint = L.stream().map(Object::toString).collect(Collectors.joining(" "));
        System.out.println(toPrint);
    }
}
