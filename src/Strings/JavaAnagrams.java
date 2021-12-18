package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class JavaAnagrams {
    public static boolean isAnagram(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        if (aLen != bLen) {
            return false;
        }
        HashMap<Character, Integer> aMap = new HashMap<>();
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        for (int i = 0; i < aLen; i++) {
            char c = aArray[i];
            if (!aMap.containsKey(c)) {
                aMap.put(c, 0);
            }
            aMap.put(c, aMap.get(c) + 1);
        }
        for (int j = 0; j < bLen; j++) {
            char c = bArray[j];
            if (!aMap.containsKey(c) || aMap.get(c) == 0) {
                return false;
            }
            aMap.put(c, aMap.get(c) - 1);
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
