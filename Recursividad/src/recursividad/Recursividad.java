/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author joshu
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos recursivos = new Metodos();
        
//        recursivos.imprimir(0);
        
        int resultado = recursivos.factorial(5);
        System.out.println(resultado);
        
    }
    
}
