/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author luban
 */
public class ejercicio2 {

    public static void main(String[] args) {
        int[][] tabla = new int[5][5];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                tabla[i][j] =i+j;
            }
        }
        System.out.println("Imprimiendo Tabla...");
        for (int i = 0; i < tabla.length; i++) {
            System.out.println();
            for (int j = 0; j < tabla.length; j++) {
                System.out.print(tabla[i][j] + " ");
            }

        }

    }

}
