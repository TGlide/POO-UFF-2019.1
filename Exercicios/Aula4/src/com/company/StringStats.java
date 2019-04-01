package com.company;

import java.util.Scanner;

public class StringStats {

    public static int countDigits(String s) {
        int count = 0;
        Integer[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < s.length(); i++)
            count = java.util.Arrays.asList(digits).indexOf(Character.getNumericValue(s.charAt(i))) != -1 ? count + 1 : count;

        return count;
    }

    public static boolean isPalindrome(String s){
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1))
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String s = teclado.nextLine();

        System.out.printf("%nString digitada: %s%n", s);

        System.out.printf("Número de caractéres: %d%n", s.length());

        System.out.printf("String em maiúsculo: %s%n", s.toUpperCase());

        System.out.printf("Se string começa com UNI: %s%n",
                s.substring(0, 3).equals("UNI") ? "Verdadeiro" : "Falso");

        System.out.printf("Se string termina com RIO: %s%n",
                s.substring(s.length() - 3).equals("RIO") ? "Verdadeiro" : "Falso");

        System.out.printf("Quantidade de digitos: %d%n", countDigits(s));

        System.out.printf("String é um palindromo: %b%n", isPalindrome(s));


    }
}
