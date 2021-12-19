package DataStructures;

import java.util.Scanner;

public class Java1DArrayPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int n = scanner.nextInt();
            int leap = scanner.nextInt();
            int[] game = new int[n];
            for (int j = 0; j < n; j++) {
                game[j] = scanner.nextInt();
            }
            boolean res = canWin(leap, game);
            System.out.println(res ? "YES" : "NO");
        }
    }

    public static boolean canWin(int leap, int[] game) {
        // 1 - Iterate along the array
        // 2 - When a non-zero value is reached, we try to leap from the index of the last zero value. If this is possible, move to step 5, if not to step 3
        // 3 - We go back to the previous index, and if the value is zero, try to leap from there. If the value is not zero, then we know crossing is not possible and we return "false"
        // 4 - If we can cross successfully, move onto step 5. If not, repeat step 3
        // 5 - Now that we know a successful leap is possible, we move our index position along to the position we jumped to
        // 6 - If our current index position sits beyond the end of the array, we return "true" - we have reached the end
        // 7 - Otherwise, we proceed on, going back to steps 1 and 2

        int consecutiveZeroes = 0;
        int i = 0;
        while (i <= game.length - leap) {
            if (game[i] == 0) {
                consecutiveZeroes++;
                i++;
            } else {
                boolean canCross = false;
                for (int j = 0; j < consecutiveZeroes; j++) {
                    int leapIndex = i - 1 - j + leap;
                    if (leapIndex > game.length - 1) {
                        return true;
                    }
                    if (leapIndex <= i) {
                        return false;
                    }
                    if (game[leapIndex] == 0) {
                        canCross = true;
                        i = leapIndex;
                        int k = leapIndex - 1;
                        consecutiveZeroes = 0;
                        while (game[k] == 0) {
                            consecutiveZeroes++;
                            k--;
                        }
                        break;
                    }
                }
                if (!canCross) {
                    return false;
                }
            }
        }
        return true;
    }
}
