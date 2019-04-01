package com.company;

public class Gene {

    public static String[] recombinacao(String s1, String s2, String s3, String s4) {
        // Pega um número aleatório entre 1 e o tamanho de s1
        int corte = (int) (Math.random() * (s1.length() - 1) + 1);

        System.out.printf("DEBUG || O ponto de corte escolhido foi %d%n", corte);
        for (int i = 0; i < s1.length(); i++) {
            s3 = s3.concat(i >= corte ? s2.substring(i, i + 1) : s1.substring(i, i + 1));
            s4 = s4.concat(i >= corte ? s1.substring(i, i + 1) : s2.substring(i, i + 1));
        }

        String[] ar = {s3, s4};
        return ar;
    }

    public static String mutacao (String s1) {
        String res = "";                                            // String resultado

        int corte = (int) (Math.random() * s1.length());            // Definir onde vai ser a mutação
        String corte_valor = String.valueOf(s1.charAt(corte));      // Valor atual no ponto de corte

        // Criar lista de valores possíveis para substituir no
        // ponto de corte
        String[] valores = new String[3];                           // Lista de valores candidatos para substituir
        int valores_idx = 0;                                        // Auxiliar contendo o indice de valores
        String[] valores_all = {"A", "T", "C", "G"};
        for (int i = 0; i < 4; i++){
            String aux = valores_all[i];
            if (!(aux.equals(corte_valor))){
                valores[valores_idx] = aux;
                valores_idx++;
            }
        }

        String valor = valores[(int) (Math.random() * 3)];          // Valor da mutação

        System.out.printf("DEBUG || Corte: %d Valor: %s%n", corte, valor);
        res = s1.substring(0, corte) + valor + s1.substring(corte + 1);

        return res;
    }

    public static void main(String[] args) {
        String s1 = "ATCGCGTA", s2 = "TAGAAGAT", s3 = "", s4 = "";
        System.out.printf("S1: %s%nS2: %s%n%n", s1, s2);

        System.out.println("Aplicando recombinação:");
        String[] res_rec = recombinacao(s1, s2, s3, s4);
        s3 = res_rec[0];
        s4 = res_rec[1];
        System.out.printf("Filhos: S3: %s S4: %s%n", s3, s4);

        System.out.printf("%nAplicando mutação em S3:%n");
        s3 = mutacao(s3);
        System.out.printf("S3: %s%n", s3);

    }
}
