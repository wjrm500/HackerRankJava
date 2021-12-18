import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linesPrinted = 0;
        while (scanner.hasNextLine()) {
            linesPrinted ++;
            System.out.printf("%d %s\n", linesPrinted, scanner.nextLine());
        }
    }
}
