/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclos;

/**
 *
 * @author joshu
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // hacemos uso de un ciclo for para que la variable numero
        // llegue hasta el numero 10 que es el limite que le pusimos        
        int numero;
        for(numero=0; numero<10; numero++){
            
            System.out.println("NUMERO:  "+numero);       
            
            // dentro del ciclo utilizamos una sentencia de control 
            if(numero%2==0){
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }
        }
        
        // ciclo anidados o conocidos como for anidados
        // ejemplo utilizo 2 for
        // un for dentro de otro 2 o conocidos como for anidados
        // el primer for imprimi un *
        // el segundo for imprime un @
        // el @ se imprime 5 por cada * que imprime el primer for
        for(int i=0; i<5; i++){
            System.out.print("*");
            for(int j=0; j<5; j++){
                System.out.print("@");
            }
            System.out.println("");
        }
        
        
    }
    
}
