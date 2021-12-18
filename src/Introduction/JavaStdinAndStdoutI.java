package Introduction;

import java.util.Scanner;

public class JavaStdinAndStdoutI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intInputs = new int[3];
        for (int i = 0; i < 3; i++) {
            int myInt = scanner.nextInt();
            intInputs[i] = myInt;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(intInputs[i]);
        }
    }
}
