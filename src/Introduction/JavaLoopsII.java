package Introduction;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                a += Math.pow(2, j) * b;
                System.out.printf("%d ", a);
            }
            System.out.println();
        }
        scanner.close();
    }
}
