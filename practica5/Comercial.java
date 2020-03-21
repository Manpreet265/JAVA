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
public class Comercial extends Empleado{
    double ventasRealizadas;
    double comision;

    public Comercial() {
    }

    public Comercial(double ventasRealizadas, double comision) {
        this.ventasRealizadas = ventasRealizadas;
        this.comision = comision;
    }

    public Comercial(double ventasRealizadas, double comision, String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.ventasRealizadas = ventasRealizadas;
        this.comision = comision;
    }

    public Comercial(double ventasRealizadas, double comision, Empleado copia) {
        super(copia);
        this.ventasRealizadas = ventasRealizadas;
        this.comision = comision;
    }

    public double getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(double ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Las ventas relaizadas son : "+this.getVentasRealizadas());
        System.out.println("La comision es : "+this.getComision());
    }
    
    @Override
    public void pedirAlta(){
        
        super.pedirAlta();
        Scanner lector = new Scanner(System.in);
        System.out.println("Las ventas realizadas son : ");
        this.setVentasRealizadas(lector.nextDouble());
        System.out.println("La comision es : ");
        this.setComision(lector.nextDouble());
    }
    
}

    
    

