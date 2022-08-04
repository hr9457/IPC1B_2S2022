/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

/**
 *
 * @author joshu
 */
public class Repaso {

    // esto son funciones
    public static String Saludo(){
        return "saludo desde una funcion";
    }
    
    
    // el numero base y el numero de elevacion
    public static int Potencia(int base, int elevacion){
        int resultado = 0;
        resultado = base * elevacion;
        return resultado;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int nombre = 3;
        int precioGalletas = 5;
        int resultado_operacion;
        int op = 4;
        String nombreUsuario = "hector";
        
        boolean estado = true;
        boolean estado2 = false;
        
//        0, 1, 2, 3, 4 
        // ingresame la cantidad de datos;
        int cantidadDatos = 10;
        int[] estadistica = new int[cantidadDatos];
        estadistica[0] = 3;
        estadistica[3] = 1;
        
        
       
        
//        System.out.println(estadistica.length);
        
        for(int i=0; i<estadistica.length; i++ ){
            // scanner 
            estadistica[i] = i;
        }
        
        int sumatoria= 0;
        for(int i=0; i<estadistica.length; i++ ){
            // scanner 
            int valor = estadistica[i];
            sumatoria = sumatoria + valor;
        }
        
        System.out.println(sumatoria/estadistica.length);
        
        
        System.out.println(Saludo());
        System.out.println(Potencia(2,2));
        
//        
//        asd09p8231nr-09uf -as09dfj po pj;sadkfj
        
//        System.out.println(3<2);
//        if(true){
//            System.out.println("hola mundo");
//        } else {
//            System.out.println("no es cierto");
//        }
//        
//        do{
//            System.out.println("1. Aritmetica");
//            System.out.println("2. estadistica");
//            System.out.println("3. salir");
//            
////            ingrese el valor -> 1,2,3 = libreria scanner
//            
//            switch (op) {
//                case 1: 
//                    int opAritemtica=4;
//                    do{
//                        System.out.println("suma");
//                        
//                    }while(opAritemtica != 4);
//                    
//                    break;
//                case 2:
//                    break;
//            }
//            
//        }while(op != 4 );
//        
//        
////        i = i + 2;
////        i = i - 1;
//        
//        for(int i=0; i <= 5; i++){
//            System.out.println(i);
//            int suma = i;
//            if(suma==3){
//                System.out.println("la suma vale 3");
//            }
//            while(suma <= 3){
//                System.out.println("este es while");
//                break;
//            }
//        }
//        
        
    }
    
}
