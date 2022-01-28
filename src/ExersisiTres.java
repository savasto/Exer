//Mostra a pantalla la taula de multiplicar del 5, començant per 0 fins al 15.
//
//Mostra a pantalla si és parell o imparell cada resultat. Exemple:
//
//5x0=0 PAR
//5x1 = 5 IMPAR
//5x2 = 10 PAR

public class ExersisiTres {

    public static void main(String[] args) {

        int num = 5;
        int resultado = 0;
        int resultado2;
        for (int i = 0; i <= 15; i++) {
            if(i==0){
                int resultado1 = 0;
                System.out.println("5x " + i + " = " + resultado1);

            }
            else{
            resultado = resultado + num;
            System.out.println("5x " + i + " = " + resultado);}

            resultado2 = resultado % 2;
            if (resultado2 == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("IMPAR");
            }


        }
    }
}
