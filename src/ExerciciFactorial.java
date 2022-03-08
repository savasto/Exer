//Demana a l’usuari un número i calcula el seu factorial i mostrar a pantalla:
//
//
//5! = 1*2*3*4*5  = 120
//
//(es pot mostrar en varies línies)


import java.util.Scanner;

 public class ExerciciFactorial {

  public static void main (String[] args){
   System.out.println("Print number : " );
   Scanner sc = new Scanner(System.in);
   int num=sc.nextInt();// daet user

  int resultado=1;// nachinaetsia ne s nulia
   for (int contador = 1; contador <=num ; contador++) {
     resultado = resultado*contador;

    System.out.println("Factorial = " + resultado);
   }
   System.out.println("Resultado final = " + resultado);


  }

}

