package com.company;

import java.util.Scanner;

public class Iniciais {

    public static String getIniciais(String nome) {
        String res = "";

        int inicio = 0;

        int fim = nome.indexOf(" ", 0);
        fim = fim != -1 ? fim : nome.length();

        while (fim != -1) {
            String subnome = nome.substring(inicio, fim);

            if (!("dos das de di du".contains(subnome)))
                res = res.concat(nome.substring(inicio, inicio + 1).toUpperCase());

            inicio = fim + 1;
            fim = nome.indexOf(" ", inicio);

            if (fim == -1 && inicio < nome.length()){
                subnome = nome.substring(inicio, nome.length());
                if (!("dos das de di du".contains(subnome)))
                    res = res.concat(nome.substring(inicio, inicio + 1).toUpperCase());
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.printf("%nAs iniciais do seu nome são: %s%n", getIniciais(nome));


    }
}
