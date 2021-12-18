// https://www.hackerrank.com/challenges/java-anagrams

package Strings;

import java.util.Scanner;

public class JavaAnagrams_alt {
    public static boolean isAnagram(String a, String b) {
        // Solution based off original solution by enripen
        int aLen = a.length();
        int bLen = b.length();
        if (aLen != bLen) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            int sum = 0;
            for (int i = 0; i < aLen; i++) {
                if (a.charAt(i) == c) {
                    sum++;
                }
                if (b.charAt(i) == c) {
                    sum--;
                }
            }
            if (sum != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();
        boolean ret = isAnagram(a, b);
        System.out.println(ret ? "Anagrams" : "Not Anagrams");
    }
}
