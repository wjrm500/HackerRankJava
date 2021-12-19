package DataStructures;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        HashMap<String, Integer> phonebook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            Integer phoneNum = Integer.valueOf(scanner.nextLine());
            phonebook.put(name, phoneNum);
        }
        while (scanner.hasNextLine()) {
            String nameQueried = scanner.nextLine();
            Integer phoneNum = phonebook.get(nameQueried);
            if (phoneNum == null) {
                System.out.println("Not found");
                continue;
            }
            System.out.printf("%s=%s\n", nameQueried, phoneNum);
        }
    }
}

// N.B. This solution is correct but times out on larger cases. Apparently using BufferedReader instead of Scanner prevents timeouts