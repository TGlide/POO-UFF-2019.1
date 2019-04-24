package Exercicio1;

import java.util.List;

public abstract class Ordenador {
    public Pessoa[] pessoasArray;

    public Ordenador(Pessoa[] pessoasArray) {
        this.pessoasArray = pessoasArray;
    }

    public void ordena() {
        for (int i = pessoasArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int comp = compara(pessoasArray[j], pessoasArray[j + 1]);
                if (comp == 1) {
                    Pessoa aux = pessoasArray[j + 1];
                    pessoasArray[j + 1] = pessoasArray[j];
                    pessoasArray[j] = aux;
                }
            }
        }
    }

    public abstract int compara(Pessoa p1, Pessoa p2);
}
