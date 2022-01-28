//Demanar a l’usuari 6 números i guardar-los en una taula. Mostrar a pantalla la taula en l’ordre invertit:
//
//Entrada: 1 4 6 8 9 2
//
//Resultat: 2 9 8 6 4 1

import java.util.Scanner;
public class Main {

    public static void main (String[] args) {

        System.out.println("Print ");
        Scanner sc= new Scanner(System.in);

        int [] entradaNum = new int[6];
        entradaNum[0] = 1;
        entradaNum[1] = 4;
        entradaNum[2] = 6;
        entradaNum[3] = 8;
        entradaNum[4] = 9;
        entradaNum[5] = 2;

        System.out.println("Print entrada: " + entradaNum[0] +  entradaNum[1]  + entradaNum[2] + entradaNum[3] +entradaNum[4] + entradaNum[5] );
       // for (int i = 0; i < entradaNum.length; i++) {
      //      entradaNum[i]= sc.nextInt();
      //  }

       // int [] invert = new int[entradaNum.length];
      //  for (int i = 0, entrada=1; i < invert.length; i++,entrada++) {

      //      invert[i] = entradaNum[entradaNum.length - entrada];

      //  }


    }
}
