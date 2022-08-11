/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;
//import poo.Clientes;

/**
 *
 * @author joshu
 */
public class Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                
        Clientes usuario1 = new Clientes(123,"hector","orozco");
        usuario1.setIdentificador(0);
        
        Clientes usuario2 = new Clientes(234,"Daniel","orozco");
        int suma = usuario1.getIdentificador() + 1;
        usuario2.setIdentificador(suma);

        
        Clientes usuario3 = new Clientes(983,"Jostin","orozco");
        int suma2 = usuario2.getIdentificador() + 1;
        usuario2.setIdentificador(suma);   
        
        
//        usuario1.presentarme();        
//        usuario1.setNombre("josue");        
//        usuario1.presentarme();
        
        
        Aritmetica operaciones = new Aritmetica(2, 2);        
        System.out.println(operaciones.suma(30,20));
      
        operaciones.resta();
        operaciones.multiplicacion();
        
        String administrador = "administrador";
        int pass = 2021032542;

        Login ventana1 = new Login();
        ventana1.setVisible(true);
        
        
    }
    
}
