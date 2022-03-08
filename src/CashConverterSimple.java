import java.util.Scanner;

public class CashConverterSimple {
    private static final int DOLLAR=1;
    private static final int POUND=2;

    public static void main(String[] args) {
        System.out.println("A quina moneda vols convertir? 1. Pound 2. Dollar");
        Scanner sc = new Scanner(System.in);
        int currency = sc.nextInt();

        System.out.println("Quants diners tens en euros?");
        double amount = sc.nextDouble();

        double result = 0;
        if (currency == DOLLAR) {
            result = amount * 1.13;
        } else result = amount * 0.83;

        System.out.println("Resultat: " + result);
    }
}
