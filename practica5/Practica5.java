/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luban
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        
        
        ArrayList <Empleado> listaEmp = new ArrayList <Empleado>();
        
        Empleado e1 = new Empleado();
        Comercial c1 = new Comercial();
        Repartidor r1 = new Repartidor();
        
        while(!salir){
            System.out.println("------------Menu--------------");
            System.out.println("opcion 1 :Alta de los Empleados");
            System.out.println("opcion 2 :Alta de los Comerciales");
            System.out.println("Opcion 3 :Alta de los Repartidores");
            System.out.println("Opcion 4 :Mostra lista de Empleados");
            System.out.println("Opcion 5 :Mostra lista de Comerciales");
            System.out.println("Opcion 6 :Mostra lista de Repartidores");
            System.out.println("Opcion 7 :Mostra lista de cualquier Empleado");
            System.out.println("Opcion 8 : Salir");
            
            System.out.println("Escribe una de las opciones");  //para hacer un input a opcion de menu
            opcion = lector.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Has selecionado la opción 1");
                    listaEmp.add(e1);
                    e1.pedirAlta();
                    break;
                case 2:
                    System.out.println("Has selecionado la opción 2");
                    listaEmp.add(c1);
                    c1.pedirAlta();
                    break;
                case 3:
                    System.out.println("Has selecionado la opción 3");
                    listaEmp.add(r1);
                    r1.pedirAlta();
                    break;
                case 4:
                    System.out.println("Has selecionado la opción 4");
                    //listaEmp.listIterator(0).g;
                    for (int i=0;i<listaEmp.size();i++){
                        listaEmp.get(i).mostrarAtributos();
                    }
                    break;
                case 5:
                    System.out.println("Has selecionado la opción 5");
                    listaEmp.listIterator();
                    c1.mostrarAtributos();
                    break;
                case 6:
                    System.out.println("Has selecionado la opción 6");
                    listaEmp.listIterator();
                    r1.mostrarAtributos();
                    break;
                case 7:
                    System.out.println("Has selecionado la opción 6");
                    int opcions;
                   
                    boolean exit = false;
                    while(!exit){
                        System.out.println("Opcion 1:Mostra lista de Empleado");
                        System.out.println("Opcion 2:Mostra lista de Comercial");
                        System.out.println("Opcion 3:Mostra lista de Repartidor");
                        System.out.println("Opcion 4:Volver a menu principal");
                        System.out.println("Escribe una de las opciones");
                        opcions =lector.nextInt(); 
                        switch(opcions) {
                            case 1:
                                System.out.println("Has selecionado la opcion 1");
                                listaEmp.listIterator();
                                e1.mostrarAtributos();
                                break;
                            case 2:
                                System.out.println("Has selecionado la opcion 2");
                                listaEmp.listIterator();
                                c1.mostrarAtributos();
                                break;
                            case 3:
                                System.out.println("Has selecionado la opcion 3");
                                listaEmp.listIterator();
                                r1.mostrarAtributos();
                                break;
                            case 4:
                                System.out.println("Has selecionado opcion de volver a menu principal");
                                exit= true;
                                break;
                        }
                    }
                    
                    break;
                case 8:
                    salir = true;
                    break;
                
            }
        }
    }
    
}
