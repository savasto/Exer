import java.util.Scanner;
public class CalculatorByMethods {
    public static void main(String[] args) {
        String option = chooseOperation(); //to ask user
        if (isAddition(option)){
            calculateAdd();      //method for +
        }
        if(isSubstruct(option)){
            calculateSubstract(); //method for -
        }
        if(isDivision(option)){
            calculateDivision(); //method for /
        }
        else calculateMultiplication(); //method for *
    }

    private static String chooseOperation() { // to ask user
        System.out.println("What operation do you want to calculate (suma/substr/divide/multi)?");
        Scanner sc= new Scanner(System.in);
        return sc.nextLine();
    }

    private static void calculateMultiplication() { //method for *
        int num1=askForNumber();
        int num2=askForNumber();
        int multiplication= multiplicationTwoNumber(num1,num2);
        printResult(multiplication);
    }
    private static int multiplicationTwoNumber(int num1, int num2) {
        return num1*num2;
    }


    private static void calculateDivision() {
        int num1=askForNumber();
        int num2=askForNumber();
        int division= divisionTwoNumber(num1,num2);
        printResult(division);
    }
    private static int divisionTwoNumber(int num1, int num2) {
        return num1/num2;
    }
    private static boolean isDivision(String option) {
        return option.equalsIgnoreCase("divide");
    }
    private static boolean isSubstruct(String option) {
        return option.equalsIgnoreCase("substr");
    }
    private static boolean isAddition(String option) {
        return option.equalsIgnoreCase("suma");
    }



    private static void calculateSubstract() {
        int num1=askForNumber();
        int num2=askForNumber();
        int substract= substractTwoNumber(num1,num2);
        printResult(substract);
    }
    private static int substractTwoNumber(int num1, int num2) {
        return num1 - num2;
    }
    private static void calculateAdd() {
        int num1=askForNumber();
        int num2=askForNumber();
        int result=addTwoNumber(num1,num2);
        printResult(result);
    }
    private static int addTwoNumber(int num1, int num2) {
        return num1 + num2;
    }
    private static void printResult(int result) {
        System.out.println("Result:"+ result);
    }
    private static int askForNumber() {
        System.out.println("Numero a operar:");
        Scanner sc= new Scanner(System.in);
        return sc.nextInt();
    }
}
