/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author luban
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("      MENU        ");
            System.out.println("Opción 1:Tabla bidimensional de 5*5"); //opciones para menu
            System.out.println("Opción 2:Tabla de 4*4");               //que necessito 
            System.out.println("Opción 3:Tabla de 3*3");
            System.out.println("Opción 4:Tabla de 7*7");
            System.out.println("Opción 5:Un matriz marco de 8*6");
            System.out.println("Opción 6:Un matriz marco según tamaño de usuario");
            System.out.println("Opción 7: Salir");

            System.out.println("Escribe una de las opciones");  //para hacer un input a opcion de menu
            opcion = lector.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Has selecionado la opción 1");
                    ejercico2();
                    break;
                case 2:
                    System.out.println("Has selecionado la opción 2");
                    ejercicio3();
                    break;
                case 3:
                    System.out.println("Has selecionado la opción 3");
                    ejercicio4();
                    break;
                case 4:
                    System.out.println("Has selecionado la opción 4");
                    ejercicio5();
                    break;
                case 5:
                    System.out.println("Has selecionado la opción 5");
                    ejercicio6();
                    break;
                case 6:
                    System.out.println("Has selecionado la opción 6");
                    ejercicio7();
                    break;
                case 7:
                    salir = true;
                    break;

            }

        }
    }

    public static void ejercico2() {
        int[][] tabla = new int[5][5];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                tabla[i][j] = i + j;
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

    public static void ejercicio3() {
        Scanner lector = new Scanner(System.in);
        int[][] tabla = new int[4][4];
        int contador = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]" + "=");
                tabla[i][j] = lector.nextInt();
            }
        }
        System.out.println("Imprimiendo Tabla.");
        for (int i = 0; i < tabla.length; i++) {
            System.out.println();
            for (int j = 0; j < tabla.length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
        }
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                if (tabla[i][j] == tabla[j][i]) {

                } else {
                    contador += 1;
                }

            }
        }
        if (contador == 0) {
            System.out.println("Es simetrica");
        } else {
            System.out.println("No es simetrica");
        }
    }

    public static void ejercicio4() {
        Scanner lector = new Scanner(System.in);
        int[][] tabla1 = new int[3][3];
        int[][] tabla2 = new int[3][3];
        int[][] tabla3 = new int[3][3];

        System.out.println("Introduzca los datos para tabla1:");
        for (int i = 0; i < tabla1.length; i++) {
            for (int j = 0; j < tabla1.length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]" + "=");
                tabla1[i][j] = lector.nextInt();
            }
        }
        System.out.println("Introducza los datos para tabla2:");
        for (int i = 0; i < tabla2.length; i++) {
            for (int j = 0; j < tabla2.length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]" + "=");
                tabla2[i][j] = lector.nextInt();
            }
        }
        //sumarlas y mostrar su suma
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabla3[i][j] = tabla1[i][j] + tabla2[i][j];
            }
        }
        System.out.println("EL matrix de suma de los dos matrices:");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(tabla3[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void ejercicio5() {
        int[][] tabla = new int[7][7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (tabla[i] == tabla[j]) {
                    tabla[i][j] = 1;
                } else {
                    tabla[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(" ");
            for (int j = 0; j < tabla.length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
        }
    }

    public static void ejercicio6() {
        int[][] tabla = new int[8][6];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || j == 0 || i == 7 || j == 5) {
                    tabla[i][j] = 1;
                } else {
                    tabla[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(" ");
            for (int j = 0; j < 6; j++) {
                System.out.print(tabla[i][j] + " ");
            }
        }
    }

    public static void ejercicio7() {
        int m, c;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el numero de las filas para crear matrix:");
        m = lector.nextInt();
        System.out.println("Introduzca el numero de las columnas para crear matrix:");
        c = lector.nextInt();
        int[][] tabla = new int[m][c];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == c - 1) {
                    tabla[i][j] = 1;
                } else {
                    tabla[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < c; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
