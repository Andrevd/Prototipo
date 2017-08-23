/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.dto.Estado;

/**
 *
 * @author SENA
 */
public class DTOEstado {
    
    String Estado;
    String fecha;
    String detalle;
    String hora;

    public void setDni_usuario(String Estado)
    {this.Estado=Estado;
    }
    
    public String getEstado(){
    return Estado;
} 
   
    public void setFecha(String fecha)
    {this.fecha=fecha;}
    
    public String getFecha(){
    return fecha;
} 
    
     
    public void setDetalle(String detalle)
    {this.detalle=detalle;}
    
    public String getDetalle(){
    return detalle;
    }
    
 
    public void setHora(String hora)
    {this.hora=hora;}
    
    public String getHora(){
    return hora;
    }

    
    }

    

