/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author joshu
 */
public class Aritmetica {
    
    int valor1;
    int valor2;
    
    Aritmetica(int valor1, int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    //funciones y metodo
    public int suma(int v1, int v2){
        return v1 + v2;
    }
    
    
    public void resta(){
        System.out.println("la suma es: " + (this.valor1 - this.valor2));
    }
    
    public void multiplicacion(){
        System.out.println("la suma es: " + (this.valor1 * this.valor2));
    }
    
    
    public void division(){
        System.out.println("la suma es: " + (this.valor1 / this.valor2));
    }
}
