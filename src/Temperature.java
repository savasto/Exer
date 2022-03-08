//Escriure un conversor de Fahrenheit a Celsius. L’usuari escriu en decimals la
//temperatura en escala Fahrenheit (permet decimals) i ho mostra en graus
//Celsius.
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Double temperatureFar = enterFahrenheit();
        double celsius= convertToCelsius(temperatureFar);
        printResult(celsius);
    }
    private static double convertToCelsius(Double temperatureFar) {
        double result = ((temperatureFar - 32) / 1.8);
        return result;
    }
    private static double enterFahrenheit() {
        System.out.println("Quina es temperatura en escala Fahrenheit?");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        return amount;
    }
    private static void printResult(double result) {
        System.out.println("La temperatura es" + result + " C");
    }
}
