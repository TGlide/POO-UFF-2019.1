/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author Thomas
 */
public class Matriz {

    /**
     * @param args the command line arguments
     * @param m dimensão m da matriz
     * @param n dimensão n da matriz
     */
    
    int m, n;
    int[][] matriz;
    
    public Matriz(int m, int n){
        this.matriz = new int[m][n];
        for (int i = 0; i < m; i++){
            this.matriz[i] = new int[n];
        }
        
        this.m = m;
        this.n = n;
    }
    
    public static void main(String[] args) {
    Matriz a = new Matriz(2, 3);
    Matriz b = new Matriz(2, 3);
    Matriz c = new Matriz(3, 4);
    Matriz d = new Matriz(3, 1);
    
    int[][] f = {{1,2,3}};
    a.matriz = f;
    
    }
    
}
