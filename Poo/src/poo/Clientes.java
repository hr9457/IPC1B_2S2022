/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author joshu
 */
public class Clientes {
    
    // atributos o caracteristicas
    int identificador;
    int documentoIdentificacion;
    String nombre;
    String apellido;
    
    
    // constructores vacio
    Clientes(){}
    
    // constructor con parametros
    Clientes(int cui, String nombre, String apellido){
        this.documentoIdentificacion = cui;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    // metodos o funciones
    public void presentarme(){
        System.out.println("Mi nombre es: "+this.nombre + ", "+this.apellido);
    }
    
    
    //get y set
    public int getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    public void setDocumentoIdentificacion(int documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    
    
}
