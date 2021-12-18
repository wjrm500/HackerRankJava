package Strings;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.printf("%s\n", str.substring(start, end));
    }
}
