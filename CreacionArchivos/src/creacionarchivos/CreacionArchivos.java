/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creacionarchivos;

//libreria para la creacion de archivos
import java.io.*;


/**
 *
 * @author joshu
 */
public class CreacionArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //variables de informacion del  juego
        String nombre = "hector";
        int puntacion = 500;
        int movimientos = 20;
        
        // tener creada la ruta para la ubicar mi archivo
        // crear el archivo
        File archivo = new File("Reportes\\snake.html");
        
        //para aperturar el archivo
        FileWriter escribir;
        
        // para crear nuevas lienas dentro del archivo
        PrintWriter nuevaLinea;
        
        //verifico si mi archivo existe o no existe
        // SI EL ARCHIVO NO EXISTE PRIMER CASO 
        // SI EL ARCHIVO YA EXISTE SOLO ES DE SOBRE ESCIRBIR
        if(!archivo.exists()){
            try {
                //crear mi archivo
                archivo.createNewFile();
                // le pasao el archivo donde quiero escribir, true 
                escribir = new FileWriter(archivo,true);
                // escribiendo dentro de mi archivo
                nuevaLinea = new PrintWriter(escribir);
                nuevaLinea.println("<!DOCTYPE html>\n" +
                                    "<html lang=\"en\">\n" +
                                    "<head>\n" +
                                    "    <meta charset=\"UTF-8\">\n" +
                                    "    <title>Document</title>\n" +
                                    "</head>\n" +
                                    "<body>");
                
                nuevaLinea.println("<h1>REPORTE</h1>");
                nuevaLinea.println("<table>");
                
                nuevaLinea.println("<tr>");
                nuevaLinea.println("<th> Jugador </th>");
                nuevaLinea.println("<th> Puntuacion </th>");
                nuevaLinea.println("<th> Movimientos </th>");
                nuevaLinea.println("</tr>");
                
                nuevaLinea.println("<tr>");
                nuevaLinea.println("<td>"+nombre+"</td>");
                nuevaLinea.println("<td>"+puntacion+"</td>");
                nuevaLinea.println("<td>"+movimientos+"</td>");
                nuevaLinea.println("</tr>");
                
                nuevaLinea.println("</table>");
                
                // ---------------------------
                nuevaLinea.println("</body>\n" +
                                   "</html>");
                // me cierra mi archivo
                escribir.close();
                
                
            } catch (Exception e) {
                
            }
        }else{
            try {
                // para vaciar el contenido anterior
                BufferedWriter bw = new BufferedWriter(new FileWriter("Reportes\\snake.html"));
                bw.write("");
                
                
                // le pasao el archivo donde quiero escribir, true 
                escribir = new FileWriter(archivo,true);
                // escribiendo dentro de mi archivo
                nuevaLinea = new PrintWriter(escribir);
                nuevaLinea.println("<!DOCTYPE html>\n" +
                                    "<html lang=\"en\">\n" +
                                    "<head>\n" +
                                    "    <meta charset=\"UTF-8\">\n" +
                                    "    <title>Document</title>\n" +
                                    "</head>\n" +
                                    "<body>");
                
                nuevaLinea.println("<h1>REPORTE</h1>");
                nuevaLinea.println("<table>");
                
                nuevaLinea.println("<tr>");
                nuevaLinea.println("<th> Jugador </th>");
                nuevaLinea.println("<th> Puntuacion </th>");
                nuevaLinea.println("<th> Movimientos </th>");
                nuevaLinea.println("</tr>");
                
                
                nuevaLinea.println("<tr>");
                nuevaLinea.println("<td>"+nombre+"</td>");
                nuevaLinea.println("<td>"+puntacion+"</td>");
                nuevaLinea.println("<td>"+movimientos+"</td>");
                nuevaLinea.println("</tr>");
                
                
                nuevaLinea.println("</table>");
                
                // ---------------------------
                nuevaLinea.println("</body>\n" +
                                   "</html>");
                // me cierra mi archivo
                escribir.close();
            } catch (Exception e) {
            }
        }
        
    }
    
}
