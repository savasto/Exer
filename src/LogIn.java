//Exercici Login:

//Guardem en una constant el email y el password de l’administrador.
//
//Quan s’inicia el software, li preguntem a l’usuari el seu email i el seu password.
//
//Si coincideixen amb les dades de l’administrador: es confirma per consola que s’ha pogut loggejar.
// Si no es valid, es mostra un missatge d’error per consola.

import java.util.Scanner;

public class LogIn {
    private static final String EMAIL = "login@gmail.com";
    private static final String PASSWORD = "moon";


    public static void main(String[] args) {

        String email=askForEmail();
        String password=askForPassword();
        boolean success = doLogIn(email,password);

    }
    private static boolean doLogIn(String email, String password) {

        if (email.equals(EMAIL) && password.equals(PASSWORD)) {
            System.out.println("s’ha pogut loggejar");
            return true;
        } else {
            System.out.println("Error. Email i password no valid");
            return false;
        }

    }

    private static String askForPassword() {
        System.out.println("Enter password");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        return password;
    }

    private static String askForEmail (){
        System.out.println("Enter e-mail");
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        return email;
    }

}