package Exercicio1;

import java.util.Scanner;

class OrdenadorNome extends Ordenador {
    public OrdenadorNome(Pessoa[] pessoasArray) {
        super(pessoasArray);
    }

    public int compara(Pessoa p1, Pessoa p2) {
        return p1.getNome().compareToIgnoreCase(p2.getNome());
    }
}

class OrdenadorIdade extends Ordenador {
    public OrdenadorIdade(Pessoa[] pessoasArray) {
        super(pessoasArray);
    }

    public int compara(Pessoa p1, Pessoa p2) {
        if (p1.getIdade() > p2.getIdade()) return 1;
        if (p1.getIdade() < p2.getIdade()) return -1;
        return 0;
    }
}


public class Agenda {

    public static void main(String[] args) {
        int size = 4;
        Pessoa[] pArray = new Pessoa[size];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.printf("Digite o nome da pessoa nº%d: ", i + 1);
            String nome = teclado.nextLine();

            System.out.printf("Digite a idade da pessoa nº%d: ", i + 1);
            int idade = teclado.nextInt();
            teclado.nextLine();

            pArray[i] = new Pessoa(nome, idade);
            System.out.print("\n");
        }

        System.out.println("Pessoas ordenadas por ordem alfabética:");
        OrdenadorNome on = new OrdenadorNome(pArray);
        on.ordena();
        for (int i = 0; i < size; i++)
            System.out.printf("%s | %d\n", on.pessoasArray[i].getNome(), on.pessoasArray[i].getIdade());

        System.out.println("\nPessoas ordenadas por idade:");
        OrdenadorIdade oa = new OrdenadorIdade(pArray);
        oa.ordena();
        for (int i = 0; i < size; i++)
            System.out.printf("%s | %d\n", oa.pessoasArray[i].getNome(), oa.pessoasArray[i].getIdade());
    }

}
