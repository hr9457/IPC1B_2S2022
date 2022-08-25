/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author joshu
 */
public class CuentaAsociada {
    
    int saldo;
    int numeroCuentaAsociada;
    boolean diponibilidad=true;
    

    CuentaAsociada(){}
    
    
    CuentaAsociada(int saldo, int numeroCuentaAsociada){
        this.saldo = saldo;
        this.numeroCuentaAsociada = numeroCuentaAsociada;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuentaAsociada() {
        return numeroCuentaAsociada;
    }

    public void setNumeroCuentaAsociada(int numeroCuentaAsociada) {
        this.numeroCuentaAsociada = numeroCuentaAsociada;
    }

    public boolean isDiponibilidad() {
        return diponibilidad;
    }

    public void setDiponibilidad(boolean diponibilidad) {
        this.diponibilidad = diponibilidad;
    }
    
    
    
}
