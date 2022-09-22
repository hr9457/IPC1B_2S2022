/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author joshu
 */
public class Persona {
    
    // caracteristicas
    // public , private, proteted
    private String nombre;
    private int edad;
    private int saldo;
    
    
    // contructor sin parametros
    Persona(){}
    
    
    // constructro con parametros

    public Persona(String nombre, int edad, int saldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    // funciones y metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
