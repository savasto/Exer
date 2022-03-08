//5. Demanem a l’usuari un número enter i mostrem per pantalla si es par o impar.
import java.util.Scanner;

public class ParImparNew {
    public static void main(String[] args) {
        int number = askForNumber();
        if (number % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("IMPAR");
        }
    }
    private static int askForNumber() {
        System.out.println("Print number: ");
        Scanner sc = new Scanner(System.in);
        int enteredNumber = sc.nextInt();
        return enteredNumber;
    }
}

