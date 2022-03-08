// Demanar a l’usuari una paraula i que el programa ens retorni si és o no palíndromo
// (si es llegeix igual d’esquerra a dreta que de dreta a esquerra).

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        String word = askForWord();
        String wordRevert = revertWord(word);
        System.out.println("Result: " + wordRevert);
        boolean isPalindrome=checkIfPalindrome(word,wordRevert);
        printResult(isPalindrome);
    }

    private static void printResult(boolean isPalindrome) {
        if(isPalindrome){
            System.out.println("la palabra es palindrome");
        }else{
            System.out.println("la palabra NO es palindrome");
        }
    }

    private static boolean checkIfPalindrome(String word, String reverse) {// reverse
        return word.equalsIgnoreCase(reverse);
    }


    private static String revertWord (String word){
            String revertedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                revertedWord = revertedWord + word.charAt(i);

            }
            return revertedWord;
        }

        private static String askForWord () {
            System.out.println("Print word: ");
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }
    }