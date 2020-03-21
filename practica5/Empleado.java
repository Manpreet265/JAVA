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
public class Empleado {

    String nombre;
    String apellido1;
    String apellido2;
    String nif;
    int edad;
    double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado(Empleado copia) {
        this.nombre = copia.nombre;
        this.apellido1 = copia.apellido1;
        this.apellido2 = copia.apellido2;
        this.nif = copia.nif;
        this.edad = copia.edad;
        this.salario = copia.salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarAtributos() {
        System.out.println("El nombre es : " + this.getNombre());
        System.out.println("El primero apellido es : " + this.getApellido1());
        System.out.println("El segundo apellido es : " + this.getApellido2());
        System.out.println("El nif es : " + this.getNif());
        System.out.println("La edad es : " + this.getEdad());
        System.out.println("El salario es : " + this.getSalario());
    }

    public void pedirAlta() {
        Scanner lector = new Scanner(System.in);

        System.out.println("El nombre es : ");
        this.setNombre(lector.next());

        if (nombre.charAt(0) == (nombre.toUpperCase().charAt(0))) {
            System.out.println("Ok");
        } else {
            while (!(nombre.charAt(0) == (nombre.toUpperCase().charAt(0)))) {
                System.out.println("Introduce el nombre otra vez con primera letra mayuscula:");
                this.setNombre(lector.next());
            }
        }
        System.out.println("El primero apellido es : ");
        this.setApellido1(lector.next());

        if (apellido1.charAt(0) == (apellido1.toUpperCase().charAt(0))) {
            System.out.println("Ok");
        } else {
            while (!(apellido1.charAt(0) == (apellido1.toUpperCase().charAt(0)))) {
                System.out.println("Introduce el nombre otra vez con primera letra mayuscula:");
                this.setApellido1(lector.next());
            }
        }
        System.out.println("El segundo apellido es : ");
        this.setApellido2(lector.next());

        if (apellido2.charAt(0) == (apellido2.toUpperCase().charAt(0))) {
            System.out.println("Ok");
        } else {
            while (!(apellido2.charAt(0) == (apellido2.toUpperCase().charAt(0)))) {
                System.out.println("Introduce el nombre otra vez con primera letra mayuscula:");
                this.setApellido2(lector.next());
            }
        }
        System.out.println("El nif es : ");
        this.setNif(lector.next());

        System.out.println("La edad es : ");
        this.setEdad(lector.nextInt());
        //edad<16
        if (edad < 16) {
            System.out.println("OK");
        } else {
            while (edad < 16) {
                System.out.println("Introduce la edad otra vez menor que 16");
                this.setEdad(lector.nextInt());
            }

            System.out.println("El salario es : ");
            this.setSalario(lector.nextDouble());

        }
    }
}
