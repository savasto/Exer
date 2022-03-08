//Volem un software que transformi euros a dollars o euros a pounds, segons trii l’usuari.
// S’introdueix la quantitat en euros i s’escull la moneda a la que vol convertir-ho.

import java.util.Scanner;

public class CashConverter {
    private static final int DOLLAR_CURRENCY = 2;
    private static final int POUND_CURRENCY = 1;

    private static final double EURO_TO_DOLLAR = 1.13;
    private static final double EURO_TO_POUND = 0.83;

    public static void main(String[] args) {

        int currency = chooseCurrency();
        double availableCash = askForAvailableCash();
        double price = convertCashToCurrency(availableCash, currency);
        printResult(price,currency);
    }

    private static int chooseCurrency() {
        System.out.println("A quina moneda vols converir els €, a Pounds (1) o a Dollars (2)");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    private static double askForAvailableCash() {
        System.out.println("Introdueix els € a convertir");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    private static double convertCashToCurrency(double availableCash, int currency) {
        double euros;
        if (currency == DOLLAR_CURRENCY) {
            euros = availableCash * EURO_TO_DOLLAR;
        } else {
            euros = availableCash * EURO_TO_POUND;
        }
        return euros;
    }

    private static void printResult(double price, int currency) {
        System.out.println("El resultat és: " + price + " " + getSymbolByCurrency(currency));
    }

    private static String getSymbolByCurrency(int currency) {
        if (currency == DOLLAR_CURRENCY) {
            return "$";
        }
        return "POUND";
    }






}
