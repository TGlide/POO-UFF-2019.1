import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;

    private Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    private String getNome() {
        return this.nome;
    }

    private int getIdade() {
        return this.idade;
    }

    public static void main(String[] args) {
        List<Pessoa> pessoasList = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o nome da pessoa nº%d: ", i+1);
            String nome = teclado.nextLine();

            System.out.printf("Digite a idade da pessoa nº%d: ", i+1);
            int idade = teclado.nextInt();
            teclado.nextLine();

            pessoasList.add(new Pessoa(nome, idade));
            System.out.print("\n");
        }

        System.out.println("Pessoas ordenadas por ordem alfabética:");
        pessoasList.sort(Comparator.comparing(Pessoa::getNome));
        for (int i = 0; i < 10; i++)
            System.out.printf("%s | %d\n", pessoasList.get(i).nome, pessoasList.get(i).idade);

        System.out.println("\nPessoas ordenadas por idade:");
        pessoasList.sort(Comparator.comparing(Pessoa::getIdade));
        for (int i = 0; i < 10; i++)
            System.out.printf("%s | %d\n", pessoasList.get(i).nome, pessoasList.get(i).idade);
    }
}
