// https://www.hackerrank.com/challenges/java-string-reverse

package Strings;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        boolean palindrome = true;
        for (int i = 0, j = A.length() - 1; i < j; i++, j--) {
            if (A.charAt(i) != A.charAt(j)) {
                palindrome = false;
                break;
            }
        }
        System.out.printf("%s\n", palindrome ? "Yes" : "No");
    }
}
