
//
public class Main {

    public static void main(String[] args) {
        int num = 5;
        int resultado=0;
        int resultado2;
        for (int i = 0; i <= 15; i++) {
            resultado = resultado + num;
            System.out.println("5 " + i);
            System.out.println("resultado = " + resultado);
            resultado2 = resultado % 2;
            if (resultado2 == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("IMPAR");
            }

        }
    }
}