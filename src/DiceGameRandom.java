import java.util.Random;
import java.util.Scanner;

public class DiceGameRandom {
    public static void main(String[] args) {
        int diceValue = new Random().nextInt(1, 7); // torna valor entre 1 i 6
        int diceValue1 = new Random().nextInt(6) + 1;
        System.out.println("give first: " + diceValue);
        System.out.println("give second: " + diceValue1);
        int result = diceValue + diceValue1;
        System.out.println("give sum: " + result);

        if (result == 7) {
            System.out.println("You won");
        } else {
            System.out.println("You lost. DO you want to try again (Yes)?");
            Scanner sc = new Scanner(System.in);
            String yes = sc.nextLine();
            if (yes.equals("Yes")) {
                System.out.println("Lets play again");
                diceValue1 = new Random().nextInt(6) + 1;
                System.out.println("new second dice: " + diceValue1);
                result = diceValue + diceValue1;
                System.out.println("give new sum: " + result);

                if (result == 7) {
                    System.out.println("You won");
                } else {
                    System.out.println("You lost");
                }
            }
        }
    }

}

