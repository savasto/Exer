import java.util.Scanner;

public class InvertedNamesByMethods {

    public static void main(String[] args) {

        String name1 = askForName();
        String name2 = askForName();
        name2 = revertName(name2);

        System.out.println("Result " + name1 + name2);
    }
    private static String revertName(String name2) {
        String nameInvert=""; // declarar variable fora del bucle
        for (int i = name2.length() - 1; i >= 0; i--) {
            nameInvert= nameInvert + name2.charAt(i);// igual a nameInvert+=name2.charAt(i)
        }
        return nameInvert;
    }
    private static String askForName() {
        System.out.println("Print name: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
