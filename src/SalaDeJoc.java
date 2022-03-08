//Una empresa que te sales de jocs per a totes les edats i vol calcular de forma automàtica
// el preu que ha de cobrar als clients per entrar.
// El programa ha de preguntar a l’usuari l’edat del client i mostrar el preu de l’entrada.
// Si el client és menor de 4 anys pot entrar de franc, si té entre 4 i 18 anys ha de pagar 5€ i
// si és més gran de 18 anys, 10€.

import java.util.Scanner;

public class SalaDeJoc {
    public static void main(String[] args) {
        int years = askForYears();
        boolean access = giveAccess(years);
    }

    private static boolean giveAccess(int years) {
        if (years<=4) {
            System.out.println("No has de pagar");
            return true;
        }
        if(years>=4 && years<=18){
            System.out.println("Has de pagar 5 euro");
            return true;
        }
                else {
            System.out.println("Has de pagar 10 euro");
            return false;
        }
    }

    private static int askForYears() {
        System.out.println("Entra el teu edat");
        Scanner sc = new Scanner(System.in);
        int years = sc.nextInt();
        return years;
    }


}
