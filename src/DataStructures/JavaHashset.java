package DataStructures;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<String> names = new HashSet<>();
        int uniqueNames = 0;
        for (int i = 0; i < n; i++) {
            String forename = scanner.next();
            String surname = scanner.next();
            boolean added = names.add(String.format("%s %s", forename, surname));
            if (added) {
                uniqueNames++;
            }
            System.out.println(uniqueNames);
            scanner.nextLine(); // Consume newline character
        }
    }
}
