package Introduction;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class JavaDateAndTime {
    public static String findDay(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        String dayName = new SimpleDateFormat("EEEE").format(calendar.getTime());
        return dayName.toUpperCase();
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        String dayName = findDay(year, month, day);
        System.out.println(dayName);
    }
}
