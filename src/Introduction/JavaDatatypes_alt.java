package Introduction;

import java.util.Scanner;

public class JavaDatatypes_alt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String input = scanner.nextLine();
            try {
                long longInput = Long.parseLong(input);
                System.out.printf("%d can be fitted in:", longInput);
                if (longInput >= Byte.MIN_VALUE && longInput <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (longInput >= Short.MIN_VALUE && longInput <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (longInput >= Integer.MIN_VALUE && longInput <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");
            } catch (NumberFormatException ex) {
                System.out.printf("%s can't be fitted anywhere.\n", input);
            }
        }
    }
}
