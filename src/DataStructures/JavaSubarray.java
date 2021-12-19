package DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        int j = 0;
        int numNegativeSubs = 0;
        while (j < A.length) {
            for (int k = 0; k < A.length - j; k++) {
                int[] subA = Arrays.copyOfRange(A, k, k + j + 1);
                int sum = Arrays.stream(subA).sum();
                if (sum < 0) {
                    numNegativeSubs++;
                }
            }
            j++;
        }
        System.out.println(numNegativeSubs);
    }
}
