import java.util.Scanner;


public class Calculadora {
    private double memoria = 0;


    private int promptOption(Scanner teclado) {
        int opt;
        int valid = -1;

        do {
            System.out.printf("Estado da memória: %.2f\n", this.memoria);
            System.out.println("Opções:\n");

            System.out.println("(1) Somar");
            System.out.println("(2) Subtrair");
            System.out.println("(3) Multiplicar");
            System.out.println("(4) Dividir");
            System.out.println("(5) Limpar memória");
            System.out.println("(6) Sair do programa");

            System.out.println("\nQual opção você deseja?");

            opt = teclado.nextInt();
            teclado.nextLine();         // Consome caracter newline

            if (opt > 0 && opt <= 6)
                valid = 1;
            else
                System.out.println("Opção inválida.\n");

        } while (valid == -1);

        return opt;
    }

    private void soma(Scanner teclado) {
        double n;
        System.out.print("Digite o número para somar: ");
        n = teclado.nextDouble();
        teclado.nextLine();

        this.memoria += n;
    }

    private void sub(Scanner teclado) {
        double n;
        System.out.print("Digite o número para subtrair: ");
        n = teclado.nextDouble();
        teclado.nextLine();

        this.memoria -= n;
    }

    private void mult(Scanner teclado) {
        double n;
        System.out.print("Digite o número para multiplicar: ");
        n = teclado.nextDouble();
        teclado.nextLine();

        this.memoria *= n;
    }

    private void div(Scanner teclado) {
        double n;
        System.out.print("Digite o número para dividir: ");
        n = teclado.nextDouble();
        teclado.nextLine();

        this.memoria /= n;
    }

    private void limpar() {
        this.memoria = 0;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner teclado = new Scanner(System.in);
        int opt;
        int exit = 0;

        do {
            System.out.println();
            opt = calc.promptOption(teclado);

            switch (opt) {
                case 1:
                    calc.soma(teclado);
                    break;
                case 2:
                    calc.sub(teclado);
                    break;
                case 3:
                    calc.mult(teclado);
                    break;
                case 4:
                    calc.div(teclado);
                    break;
                case 5:
                    calc.limpar();
                    break;
                case 6:
                    exit = 1;
            }
        } while (exit == 0);
    }
}
