package Introduction;

import java.util.Scanner;

public class JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intInput = Integer.parseInt(scanner.nextLine());
        double doubleInput = Double.parseDouble(scanner.nextLine());
        String stringInput = scanner.nextLine();
        System.out.println("String: " + stringInput);
        System.out.println("Double: " + doubleInput);
        System.out.println("Int: " + intInput);
    }
}
