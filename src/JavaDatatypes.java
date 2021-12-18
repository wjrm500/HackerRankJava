import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String input = scanner.next();
            try {
                Long.parseLong(input);
            } catch (NumberFormatException ex) {
                System.out.printf("%s can't be fitted anywhere.\n", input);
                continue;
            }
            System.out.printf("%s can be fitted in:\n", input);
            try {
                Byte.parseByte(input);
                System.out.println("* byte");
            } catch (NumberFormatException ex) {}
            try {
                Short.parseShort(input);
                System.out.println("* short");
            } catch (NumberFormatException ex) {}
            try {
                Integer.parseInt(input);
                System.out.println("* int");
            } catch (NumberFormatException ex) {}
            System.out.println("* long");
        }
    }
}
