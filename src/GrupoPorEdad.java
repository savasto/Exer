// Ex 7 Els alumnes de l’escola s'han dividit en dos grups A i B segons l’edat.
// El grup A està format pels menors de 15 anys i el grup B per la resta.
// Escriure un programa que pregunti a l'usuari la seva edad,
// i mostri per pantalla el grup que li correspon.

import java.util.Scanner;

public class GrupoPorEdad {
    public static void main(String[] args) {
        int years = askForYears();
        getResult(years);
    }
    private static void getResult(int years) {
        if (years < 15) {
            System.out.println("Tu grupo es GRUPO A");
        } else {
            System.out.println("Tu grupo es GRUPO B");
        }
    }
    private static int askForYears() {
        System.out.println("Quants anys tens? ");
        Scanner sc = new Scanner(System.in);
        int yearsUserHas = sc.nextInt();
        return yearsUserHas;
    }
}
