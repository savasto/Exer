//L’usuari té una compte bancaria amb un saldo inicial de 1.000€.
// Al iniciar el software, l’usuari pot retirar o ingresar diners.
//El saldo a ingresar no pot ser mai el doble del saldo actual en el banc, és a dir,
// si té 1.000€, no es poden ingressar més de 2.000€.
// Al fer un ingrés, s’aplica un 5% de comissió sobre la quantitat a ingressar.
//
///Mai es pot retirar més diners que els que hi ha al banc.
//
//El software es finalitza si l’usuari escull no fer més operacions.

import java.util.Scanner;

public class BancAccountNew {

    private static double MONEY_ON_ACCOUNT = 1000;//ne final poetomu mojet meniatsia eta variable

    public static void main(String[] args) {

        while (true) {
            String option = chooseOperation();

            if (option.equalsIgnoreCase("salir")) {
                break;
            }
            if (isIngress(option)) {
                calculateIngress();
            }
            if (isMoneyOut(option)) {
                calculateMoneyOut();
            } else {
                System.out.println("Vol fer un altre operacio?");

            }
        }
    }

    private static String chooseOperation() {
        System.out.println("Que vol fer  Ingresar (INGRES) diners o retirar (RETIRAR) diners. O SALIR");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static boolean isIngress(String option) {
        return option.equalsIgnoreCase("INGRES");
    }

    private static void calculateIngress() {
        double moneyUserWhantToIngress = askForMoney();

        if (moneyUserWhantToIngress > (MONEY_ON_ACCOUNT * 2)) {
            System.out.println("Error: El saldo a ingresar no pot ser el doble del saldo actual en el banc");
            return;
        }

        MONEY_ON_ACCOUNT = MONEY_ON_ACCOUNT + moneyUserWhantToIngress - (moneyUserWhantToIngress * 0.05);
        printResult(MONEY_ON_ACCOUNT);
    }

    private static boolean isMoneyOut(String option) {
        return option.equalsIgnoreCase("RETIRAR");
    }

    private static void calculateMoneyOut() {
        double moneyUserWhantToOut = askForMoney();
        if (MONEY_ON_ACCOUNT >= moneyUserWhantToOut && moneyUserWhantToOut > 0) {
            MONEY_ON_ACCOUNT = MONEY_ON_ACCOUNT - moneyUserWhantToOut;
            printResult(MONEY_ON_ACCOUNT);
        } else {
            System.out.println("Error");
        }
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

