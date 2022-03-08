//Compte bancaria:

//L’usuari té una compte bancaria amb un saldo inicial de 1.000€.
// Al iniciar el software, l’usuari pot retirar o ingresar diners.
//
//El saldo a ingresar no pot ser mai el doble del saldo actual en el banc, és a dir,
// si té 1.000€, no es poden ingressar més de 2.000€.
// Al fer un ingrés, s’aplica un 5% de comissió sobre la quantitat a ingressar.
//
//Mai es pot retirar més diners que els que hi ha al banc.
//
//El software es finalitza si l’usuari escull no fer més operacions.

import java.util.Scanner;

public class CompteBancari {
    public static void main(String[] args) {
        String option = chooseOperation();
        if (isIngress(option)) {
            calculateIngress();
        }
        if (isMoneyOut(option)) {
            calculateMoneyOut();
        } else {
            System.out.println("Vol fer un altre operacio?");
            chooseOperation();
        }
    }

    private static String chooseOperation() {
        System.out.println("Que vol fer  Ingresar (INGRES) diners o etirar (RETIRAR) diners");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static boolean isIngress(String option) {
        return option.equalsIgnoreCase("INGRES");
    }

    private static void calculateIngress() {
        double moneyUserWhantToIngress = askForMoney();
        double moneyOnAcc = 1000;
        double result = moneyOnAcc + moneyUserWhantToIngress - moneyUserWhantToIngress * 0.05;
        printResult(result);
    }

    private static boolean isMoneyOut(String option) {
        return option.equalsIgnoreCase("RETIRAR");
    }

    private static void calculateMoneyOut() {
        double moneyUserWhantToOut = askForMoney();
        double moneyOnAcc = 1000;
        double result = moneyOnAcc - moneyUserWhantToOut;
        printResult(result);
    }

    private static double askForMoney() {
        System.out.println("Quants diners vol ingresar o retirar?");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static void printResult(double result) {
        System.out.println("Tens al compte " + result + " euro");
    }

}





