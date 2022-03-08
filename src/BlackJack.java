//L’objectiu del joc és estar el més aprop de 21 sense passar-se.Guanya l’usuari que aconsegueixi menys punts.
//
//Les cartes tenen un valor de 1 a 13 punts a l’atzar.
//
//Es van fent tantes partides com l’usuari pugui.
//
//Es un joc individual on se li va preguntant si vol una carta.
// La suma de totes les cartes anteriors no pot superar 21.
//
//Guanya tants punts com diferència hi hagi entre la suma de les seves cartes i 21,
// sempre i quan no s’hagi passat.
// En aquell de passar-se, suma 20 punts.

import java.util.Random;
import java.util.Scanner;
public class BlackJack {
    private static final int BLACKJACK = 21;
    private static final int MISTAKE = 20;


    public static void main(String[] args) {
        int total = 0;
        boolean newcard = true;
        boolean pass;
        while (newcard){
            int nextcard = nextCard();

            total = addCards(nextcard, total);
            pass = checkIfPassed (total);
            if (pass){
                System.out.println("t'has passat. Has aconseguit 20 punts");
                break;
            }
            newcard = askForCard();
            if (newcard == false){

                System.out.println("t'has plantat. Has aconseguit " + (BLACKJACK- total) + " punts");
                break;

            }
        }



    }

    private static boolean checkIfPassed(int sumaCards) {
        if (sumaCards>BLACKJACK){
            return true;
        } else{
            return false;}


    }

    private static int addCards(int nextcard, int total) {

        System.out.println("la suma de les cartes es " + (nextcard + total));
        return nextcard + total;
    }

    private static int nextCard() {
        int newcard = new Random().nextInt(1, 14);
        System.out.println("la nova carta es  " + newcard);
        return newcard;

    }

    private static boolean askForCard() {
        System.out.println("vols una altra carta?");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        return option.equalsIgnoreCase("S");
    }


}
