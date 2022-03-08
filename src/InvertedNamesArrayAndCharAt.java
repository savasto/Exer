//Demanar a l’usuari dos noms. Crear un nom que sigui la fusió dels dos,
// posant el primer del dret i el segon del revés:
//Exemple:
//Nom 1: JORDI
//Nom 2: ANDREU
//Resultat: JORDIUERDNA

import java.util.Scanner;

public class InvertedNamesArrayAndCharAt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre");// pedimos primero nombre
        String nombre1 = sc.nextLine();

        System.out.println("Escribe tu segundo nombre");//pedimos segundo nombre
        String nombre2 = sc.nextLine();

        char[] nombre2inv = new char[nombre2.length()];//array char para segundo nombre invertido
//con nombre2.lengrh() longitud
        int indiceNombre2Inv = 0;

        for (int i = nombre2.length() - 1; i >= 0; i--) {
            nombre2inv[indiceNombre2Inv] = nombre2.charAt(i);
            indiceNombre2Inv++;}

        System.out.print(nombre1);
        System.out.println(nombre2inv);
    }
}
