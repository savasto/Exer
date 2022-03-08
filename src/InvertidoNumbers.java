//Demanar a l’usuari 6 números i guardar-los en una taula. Mostrar a pantalla la taula en l’ordre invertit:
//
//Entrada: 1 4 6 8 9 2
//
//Resultat: 2 9 8 6 4 1

import java.util.Scanner;

public class InvertidoNumbers {
    public static void main(String[] args) {

        int[] numeros = new int[6];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) { // ir pediendo 6 numeros cambio 5 por 6
            System.out.println("Print number " + i);
            int numero = sc.nextInt();// leemos el numero
            numeros[i] = numero;// guardamos en la posicio i
        }

        for (int i = numeros.length - 1; i >= 0; i--) {// bucle
            System.out.println(numeros[i]);

        }


    }
}
