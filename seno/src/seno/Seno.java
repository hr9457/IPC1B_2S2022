/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seno;

import java.math.BigDecimal;

/**
 *
 * @author joshu
 */
public class Seno {

    /**
     * @param args the command line arguments
     */
    
    
    public static int factorial(int number){
        if ( number == 1){
            return 1;
        } else {
            int factorial = number;
            int i = number -1;
            do{
                factorial = factorial * i ;
                i--;
            }while( i > 0);
            return factorial;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
                
        int numero=-6;
        double respuesta = Math.sin(numero);
        System.out.println("SIN CON MATH: "+ respuesta);        
        
        double formula=0;
        for(int i=0; i<6; i++){
            if(i>4){
                int resultFactorial = factorial(2*i+1);
                double calculo = Math.pow(-1,i)* (Math.pow(numero,(2*i+1)));
                System.out.println("LONG: "+calculo);
                long otro = (long) calculo;
                double calculo2 = otro/resultFactorial;
                formula = formula + calculo2;                
            } else {
                int resultFactorial = factorial(2*i+1);
                double calculo = (Math.pow(-1,i)*(Math.pow(numero,(2*i+1))));
                double calculo2 = calculo/resultFactorial;
                formula = formula + calculo2;
            }           
        }
        System.out.println(formula); 
    }
    
}
