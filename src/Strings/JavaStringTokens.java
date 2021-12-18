package Strings;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        String[] tokens = s.split("[ !,?._'@]+");
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
