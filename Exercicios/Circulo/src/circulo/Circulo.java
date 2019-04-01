/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;

import java.util.Scanner;

/**
 *
 * @author Thomas
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    
    public static Double perimetro(Double raio) {
        return Math.PI*2.0*raio;
    }
    
    public static Double Area(Double raio){
        return Math.PI*Math.pow(raio, 2);
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        Double raio = teclado.nextDouble();
        System.out.printf("O perímetro do círculo é %f%n", perimetro(raio));
        System.out.printf("A área do círculo é %f%n", Area(raio));
    }
    
}
