/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.edad;

import java.net.*; 
import java.io.*;


/**
 *
 * @author Pc
 */
public class ServidorEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        ServerSocket socket;
        
         boolean fin = false;

        
         try {

        

         socket = new ServerSocket(6000);

        
         Socket socket_cli = socket.accept();

        

         DataInputStream in =
         new DataInputStream(socket_cli.getInputStream());

        

         do {
         String mensaje ="";
         mensaje = in.readUTF();
         System.out.println(mensaje);
         } while (1>0);
         }
        
         catch (Exception e) {

       
         System.err.println(e.getMessage());
         System.exit(1);
         }
    }
    
}
