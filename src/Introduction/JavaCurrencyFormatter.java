package Introduction;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        Locale[] locales = new Locale[]{
            Locale.US, new Locale("en", "in"), Locale.CHINA, Locale.FRANCE
        };
        for (int i = 0; i < locales.length; i++) {
            Locale locale = locales[i];
            nf.setCurrency(Currency.getInstance(locale));
            System.out.printf("%s: %s\n", locale.getDisplayCountry(), nf.format(payment));
        }
    }
}
