// Crea tres variables de tipus double.
// Multiplica la primera amb la segona i divideix el resultat amb la tercera.
// Mostra el resultat en pantalla.

import java.util.Scanner;
public class exerciciDos {

    public static void main(String[] args) {
        System.out.println("Enter first num :");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        System.out.println("Enter second num: ");
        double b = sc.nextDouble();
        System.out.println("Enter third num: ");
        double c = sc.nextDouble();

        double result = (a*b)/c;
        System.out.println("Result :" + result);

    }

    }

