// Demanar a l’usuari dos noms. Crear un nom que sigui la fusió dels dos,
// posant el primer del dret i el segon del revés:
//Exemple:
//Nom 1: JORDI
//Nom 2: ANDREU
//Resultat: JORDIUERDNA

import java.util.Scanner;

public class InvertidoNamesBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print first name ");
        String name1 = sc.nextLine();
        System.out.println("Print second name");
        String name2 = sc.nextLine();

        StringBuffer name3 = new StringBuffer(name2);
        name3.reverse();
        System.out.println();
        System.out.println("Result: " + name1 + name3);

    }
}
