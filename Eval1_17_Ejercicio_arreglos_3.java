
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Eval1_17_Ejercicio_arreglos_3 {
    public static void main(String[]args){
                
        int matrizDatos[][]=new int[5][5];
        int[] matrizCopia = new int[matrizDatos.length];
        
        for (int i = 0; i < matrizDatos.length; i++) {
            for (int j = 0; j < matrizDatos[i].length; j++) {
            matrizDatos[i][j]=(int)(Math.random()*100)+1;
            matrizCopia[(matrizCopia.length)-(i+1)]=matrizDatos[i][j];
            }           
        }
        imprimirMatriz(matrizDatos);
        System.out.println("");
        
            
        
    }
    public static void imprimirMatriz(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j]+"]");
                
            }
            System.out.println("");
            
        }
        
    }
    
              
}
