import java.util.Scanner;

public class CalculatorIfElse {
    public static void main (String[] args){
        System.out.println("Sum (1), Other (2) : "); // preguntamos que quere hacer, 1 = sumar
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        System.out.println("First number");
        int num = sc.nextInt();
        System.out.println("Second number");
        int num2 = sc.nextInt();

        if (option == 1) {
            int sum = num + num2;
            System.out.println("Result suma " + sum);
        } else {
            int resta = num - num2;
            int multi = num * num2;
            if (num2 == 0) {
                System.out.println("Error");
            } else {
                int devis = num / num2;
                System.out.println("Result devisio " + devis);
            }
            System.out.println("Result resta " + resta);
            System.out.println("Result multiplicacio " + multi);
        }

    }
}
