/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edad;


import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Pc
 */
public class CLIENTE {
    
    String Nombre;
    String Apellido;
    String Fecha;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }    
    
    public String Edad() throws ParseException{
        
        String Fecha = this.getFecha();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(Fecha, fmt);
        LocalDate ahora = LocalDate.now();
        
        Period periodo = Period.between(fechaNac, ahora);       
        int resul = periodo.getYears();        
        String ed = Integer.toString(resul);
        return ed;
    }
    
    public String MenServe() throws ParseException{
    
        String Nombre = this.getNombre();
        String Apellido = this.getApellido();
        String old = this.Edad();
                
        String Mensaje = " El señor(a) " + Nombre + " " + Apellido + " tiene " + old +" años";
        
        return Mensaje;
    }
   
    
    
    
}
