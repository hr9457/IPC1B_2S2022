/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

/**
 *
 * @author joshu
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int filas = 3;
        int columnas =4;
        int[][] matriz = new int[filas][columnas];
         
        
//        variables para los for anidados
        int fila=0;
        int columna=0;

        
        for(fila=0; fila<=filas; fila++){            
//          guardo la primer posicion de la primera fila
            int a = matriz[fila][columna];
                
            for(columna=0; columna<= columnas; columna++){
                int w = matriz[fila][columna];
                int resultado = w/a;
                matriz[fila][columna] = resultado;         
                
                int h = matriz[fila][columna];
                int f = matriz[fila-1][columna];
                int r = h - f * h;
                matriz[fila][columna] = r;               
            }
        }
         
         
    }
    
}
