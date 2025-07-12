package Strings_And_StringBuilder;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency_Format {
    public static void main(String[] args) {
        NumberFormat CurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        double amount = 1234.56;
        String formatedCurrency = CurrencyFormatter.format(amount);
        System.out.println(formatedCurrency);
        CurrencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        String formatedCurrency2 = CurrencyFormatter.format(amount);
        System.out.println(formatedCurrency2);

        // Write your code here.
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat cnFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        
        double payment = 45.79;
        String us = usFormat.format(payment);
        String india = inFormat.format(payment);
        String france = frFormat.format(payment);
        String china = cnFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
