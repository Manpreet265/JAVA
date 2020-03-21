/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.util.Scanner;

/**
 *
 * @author luban
 */
public class Repartidor extends Empleado{
    double horasTrabajadas;
    String zona;

    //constructor vacio
    public Repartidor() {
    }

    //constructor 
    public Repartidor(double horasTrabajadas, String zona, String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.zona = zona;
    }

    // constructor copia
    public Repartidor(Repartidor r1){
        super(r1);
        this.horasTrabajadas = r1.horasTrabajadas;
        this.zona = r1.zona;
    }
    
    //getters & setters
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    //metodo mostrar atributos
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Las horas trabajadas son : "+this.getHorasTrabajadas());
        System.out.println("La zona es : "+this.getZona());
    }
    
    //metodo pedir alta
    @Override
    public void pedirAlta(){
        Scanner lector = new Scanner(System.in);
        super.pedirAlta();
        System.out.println("Las horas trabajadas son : ");
        this.setHorasTrabajadas(lector.nextDouble());
        System.out.println("La zona es : ");
        this.setZona(lector.next());
    }
}
