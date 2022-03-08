//Per tributar un determinat impost cal ser més gran de 16 anys i
// tenir uns ingressos iguals o superiors a 1000 € mensuals.
// Pregunta a l’usuari la seva edat i els seus ingressos mensuals
// i mostra per pantalla si ha de tributar o no.

import java.util.Scanner;

public class EdatImpost {
    public static void main(String[] args) {
        int years = askForYears();
        int money = askForMoney();
        getResult(years, money);
    }

    private static void getResult(int years, int money) {
        if (years >= 16 && money >= 1000) {
            System.out.println("Tens que pagar impost");
        } else {
            System.out.println("no tens que pagar impost");
        }
    }

    private static int askForMoney() {
        System.out.println("Quant son els teus ingresos al mes?");
        Scanner sc = new Scanner(System.in);
        int moneyUserHas = sc.nextInt();
        return moneyUserHas;
    }

    private static int askForYears() {
        System.out.println("Quants anys tens? ");
        Scanner sc = new Scanner(System.in);
        int yearsUserHas = sc.nextInt();
        return yearsUserHas;
    }

}
