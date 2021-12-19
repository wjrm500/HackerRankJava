package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaArraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String nextLine = scanner.nextLine();
            String[] strNums = nextLine.split(" ");
            List<Integer> numList = Arrays
                    .stream(strNums)
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .collect(Collectors.toList());
            ArrayList<Integer> subArrList = new ArrayList(numList);
//            subArrList.remove(0); // First value in list is "an integer  denoting number of integers on that line"
            arrList.add(subArrList);
        }
        int q = scanner.nextInt();
        for (int j = 0; j < q; j++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try {
                System.out.println(arrList.get(x - 1).get(y));
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("ERROR!");
            }
        }
    }
}
