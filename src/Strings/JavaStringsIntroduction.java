package Strings;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();

        String aLargerThanB = A.compareTo(B) > 0 ? "Yes" : "No";
        String capitalisedA = A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();
        String capitalisedB = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();

        System.out.printf("%d\n", A.length() + B.length());
        System.out.println(aLargerThanB);
        System.out.printf("%s %s\n", capitalisedA, capitalisedB);
    }
}
