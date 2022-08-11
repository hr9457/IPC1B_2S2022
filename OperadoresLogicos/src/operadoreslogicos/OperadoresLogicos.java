/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

/**
 *
 * @author joshu
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean izquierda = true;
        boolean derecha = false;
        
//        System.out.println(true && false);
//        System.out.println(true || false);
//          System.out.println(!true);
          
          int edad = 10;
          System.out.println(edad >= 18);
          System.out.println(edad <= 25);
          if(edad >= 18 && edad <= 25 || edad == 20){
              System.out.println("sos mayor de edad");
          } else {
              System.out.println("no cumples con los resquisitos");
          }
    }
    
}
