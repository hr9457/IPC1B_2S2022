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
    
    // cree un listado de cuentas asociadas
    // a partir de mi clase CuentaAsociada 
    CuentaAsociada[] listadoCuentasAsociadas = {new CuentaAsociada(), new CuentaAsociada()};
    CuentaAsociada a1;
    CuentaAsociada a2;
    CuentaAsociada a3;
    CuentaAsociada a4;
    CuentaAsociada a5;
    
    
    // constructores vacio
    Clientes(){}
    
    // constructor con parametros
    Clientes(int cui, String nombre, String apellido){
        this.documentoIdentificacion = cui;
        this.nombre = nombre;
        this.apellido = apellido;
        //vector 4
    }
    
    
    
    //funcion para agregar cuentas asociadas
    public void AsociarCuenta(int saldo){
        for(int i=0; i< this.listadoCuentasAsociadas.length ;i++){
            
            if (this.listadoCuentasAsociadas[i].isDiponibilidad() == true){
                
                System.out.println("Espacio Libre");
                this.listadoCuentasAsociadas[i].setSaldo(saldo);
                this.listadoCuentasAsociadas[i].setDiponibilidad(false);
                break;
                
            } else {
                
                System.out.println(" Espacio Ocupado");
                
            }
            
        }
    }
    
    
    
    // ver cuentas asociadas o trear cuentas asociadas
    public void verCuentasAsocidas(){
        
        for(int i=0; i< this.listadoCuentasAsociadas.length ;i++){
            
            if (this.listadoCuentasAsociadas[i].isDiponibilidad() == false){
                
                System.out.println("Espacio Libre");
                System.out.println(this.listadoCuentasAsociadas[i].getNumeroCuentaAsociada());
                System.out.println(this.listadoCuentasAsociadas[i].getSaldo());
            }            
        }
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
