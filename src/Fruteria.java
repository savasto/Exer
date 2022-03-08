import java.util.Scanner;

public class Fruteria {
    private static final int BANANA = 1;
    private static final int APPLE = 2;
    private static final int ORANGE = 3;

    private static final int BANANA_PRICE = 40;
    private static final int APPLE_PRICE = 70;
    private static final int ORANGE_PRICE = 90;

    public static void main(String[] args) {
        int moneyUserHas = askForMoney();
        int option = showFruits();
        int price = getFruitPrice(option);
        purchaseFruit(moneyUserHas, price);
    }

    private static int askForMoney() {
        System.out.println("Quants diners tens?");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static int showFruits() {
        System.out.println("fruita disponible: ");
        System.out.println("1. PLATAN: " + BANANA_PRICE);
        System.out.println("2. TARONJA: " + ORANGE_PRICE);
        System.out.println("3. POMA: " + APPLE_PRICE);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static int getFruitPrice(int option) {
        if (option == BANANA) return BANANA_PRICE;
        if (option == APPLE) return APPLE_PRICE; // variant zapisi bez constant if(option==2) return 70;
        if (option == ORANGE) return ORANGE_PRICE;
        return 0;
    }

    private static void purchaseFruit(int moneyUserHas, int price) {
        if (moneyUserHas - price >= 0) {
            System.out.println("Ho has comprat");
            System.out.println("Et queden :" + (moneyUserHas - price));
        } else {
            System.out.println("No pots comprar-ho");
        }
    }
}

//    private static void purchaseFruit(int moneyUserHas, int price) {
//        if (moneyUserHas - price >= 0) {
//            System.out.println("Ho has comprat");
//            System.out.println("Et queden :" + (moneyUserHas - price));
//        } else {
//            System.out.println("No pots comprar-ho");
//        }
//    }
//
//    private static int getFruitPrice(int option) {
//        if (option == BANANA) return BANANA_PRICE;
//        if (option == APPLE) return APPLE_PRICE; // variant zapisi bez constant if(option==2) return 70;
//        if (option == ORANGE) return ORANGE_PRICE;
//        return 0;
//    }
//
//    private static int showFruits() {
//        System.out.println("fruita disponible: ");
//        System.out.println("1. PLATAN: " + BANANA_PRICE);
//        System.out.println("2. TARONJA: " + ORANGE_PRICE);
//        System.out.println("3. POMA: " + APPLE_PRICE);
//        Scanner sc = new Scanner(System.in);
//        return sc.nextInt();
//    }
//
//    private static int askForMoney() {
//        System.out.println("Quants diners tens?");
//        Scanner sc = new Scanner(System.in);
//        return sc.nextInt();
//    }}

