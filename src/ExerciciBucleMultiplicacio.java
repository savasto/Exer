// bucle multiplicar 15*3
public class ExerciciBucleMultiplicacio {

    public static void main(String[] args) {
        int num=5;
        int resultado=0;

        for(int vuelta =0; vuelta <=2; vuelta ++) { // bucle cycle
            resultado = resultado + num;
            System.out.println("numero de vuelta " + vuelta);
            System.out.println("resultado = " + resultado);
        }
    }
}
