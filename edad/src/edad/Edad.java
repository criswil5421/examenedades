/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edad;

import java.time.LocalDate;
import java.util.*;
import java.util.Date;
import edad.CLIENTE.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
/**
 *
 * @author Pc
 */
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CLIENTE cli = new CLIENTE();
        Scanner entrada = new Scanner(System.in);
               
            
        System.out.print("Ingrese su nombre: ");
        cli.Nombre = entrada.nextLine();
        System.out.print("Ingrese su apellido: ");
        cli.Apellido = entrada.nextLine();
        System.out.print("Ingrese Ingrese su año de nacimiento: ");
        cli.Fecha = entrada.nextLine();

        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

         Socket socket;

         byte[] mensaje_bytes = new byte[256];


         try {

         socket = new Socket("127.0.0.1",6000);
         
         DataOutputStream out =
         new DataOutputStream(socket.getOutputStream());
         
        out.writeUTF(cli.MenServe());
        
         }
         catch (Exception e) {

         System.err.println(e.getMessage());
         System.exit(1);
         }
        
    }     
    
}
