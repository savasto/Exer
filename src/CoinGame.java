import java.util.Random;
import java.util.Scanner;

public class CoinGame {
    private static final int CARA = 1; // estatica
    private static final int CREU = 2;

    private static int headCounter = 0; // no mojno postavit v konstanti i eto dinamicheskaya var
    private static int totalThrow = 0;

    public static void main(String[] args) {
        while (askIfWhantsToThrowCoin()) { //preguntamos si quere tirar moneda
            int value = throwCoin(); // dona CARA
            calculateResult(value);
            printResult(); // t.k globalnie to doljni vvodit dva parametra
        }
    }
    private static boolean askIfWhantsToThrowCoin() {
        System.out.println("Vols tirar la moneda? S/N");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        return text.equalsIgnoreCase("S");
    }
    private static int throwCoin() {
        return new Random().nextInt(1, 3);
    }
    private static void calculateResult(int value) {
        if (value == CARA) {
            System.out.println("CARA");
            headCounter++;
        } else {
            System.out.println ("CREU");
        }
        totalThrow++;// contem tirades
    }
    private static void printResult() {
        System.out.println("Resultat. Cares: " + headCounter + "Total tirades:" + totalThrow);
    }
}







//        private static void printResult() {
//            System.out.println("Resultat. Cares: " + headCounter + "Total tirades:" + totalThrow);
//        }
//        private static void calculateResult(int value) {
//            if (value == CARA) {
//                System.out.println("CARA");
//                headCounter++;
//            } else {
//                System.out.println(("CREU"));
//            }
//            totalThrow++;// contem tirades
//        }
//        private static int throwCoin() {
//            return new Random().nextInt(1, 2);
//
//        }
//        private static boolean askIfWhantsToThrowCoin() {
//            System.out.println("Vols tirar la moneda? S/N");
//            Scanner sc = new Scanner(System.in);
//            String text = sc.nextLine();
//            return text.equalsIgnoreCase("S");
//        }}
