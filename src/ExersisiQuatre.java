// Demanar a l’usuari el seu nom i mostrar-li lletra per lletra

import java.util.Scanner;
public class ExersisiQuatre {

    public static void main(String[] args) {

        System.out.println("Print name");
        Scanner sc= new Scanner(System.in);
        String nom = sc.nextLine();
        System.out.println(nom);

        for (int i = 0; i < nom.length(); i++) {
            System.out.println(nom.charAt(i));
            // System.out.println();
        }
    }
    }
