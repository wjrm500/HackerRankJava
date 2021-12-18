package Strings;

import java.util.Scanner;

public class JavaStringReverse_alt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String reversedA = new StringBuilder(A).reverse().toString();
        System.out.printf("%s\n", A.equals(reversedA) ? "Yes" : "No");
    }
}
