package DataStructures;

import java.util.Scanner;

public class Java2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] ints = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                ints[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline character
        }
        boolean maxSet = false;
        int max = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = ints[i][j] + ints[i][j + 1] + ints[i][j + 2] + ints[i + 1][j + 1] + ints[i + 2][j] + ints[i + 2][j + 1] + ints[i + 2][j + 2];
                if (!maxSet) {
                    max = sum;
                    maxSet = true;
                } else {
                    max = Math.max(max, sum);
                }
            }
        }
        System.out.println(max);
    }
}
