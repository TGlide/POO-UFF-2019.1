/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;
import java.lang.Math; 

/**
 *
 * @author Thomas
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    
    public static String troco(Float valor){
        /**
         * @param valor Valor monetário
         */
        
        // Vetores contendo as cédulas disponíveis
        Float[] nts = {100f, 50f, 20f, 10f, 5f, 2f};
        Float[] moedas = {1f, 0.5f, 0.25f, 0.10f, 0.05f};
        
        // Resposta fornecida em string
        String resp = String.format("%.2f: ", valor);
        
        // Separar o valor em notas
        for (Float n:nts) {
            if (valor / n >= 1){
                resp += String.format("%.0f nota(s) de %.0f, ", Math.floor(valor/n), n);
                valor %= n;
            }
        }
        
        // Separar o valor restante em moedas
        for (Float n:moedas) {
            if (valor / n >= 1){
                resp += String.format("%.0f moeda(s) de %.2f, ", Math.floor(valor/n), n);
                valor %= n;
            }
        }
        
        // Tirar a última vírgula
        resp = resp.substring(0, resp.length() - 2); 
        return resp;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Float[] valores = {123f, 1f, 45.15f, 52.75f};
        
        for (Float v:valores){
            System.out.println(troco(v));
        }
    }
    
}
