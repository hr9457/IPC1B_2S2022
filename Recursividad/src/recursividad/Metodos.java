/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author joshu
 */
public class Metodos {
    
    
    public void imprimir(int x){
        if(x<=5){
            System.out.println(x);
            imprimir(x+1);
        }
    }
    
    
    
    public int factorial(int num){
        
        if(num == 0){
            return 1;
        } else {
           return num * factorial(num -1);
        }
    }
    
}
