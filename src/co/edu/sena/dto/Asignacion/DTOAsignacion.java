/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.dto.Asignacion;

/**
 *
 * @author SENA
 */
public class DTOAsignacion {
    
    String nombreconductor;
    String clave;
    String placa;
    
   
    public void setNombreconductor(String nombreconductor)
    {
        this.nombreconductor = nombreconductor;
   }
    
    public String getNombreconductor(){
        return nombreconductor;
    }
    
      
    public void setClave(String clave)
    {
        this.clave = clave;
   }
    
    public String getClave(){
        return clave;
    }
    
   
    public void setPlaca(String placa)
    {
        this.placa = placa;
   }
    
    public String getPlaca(){
        return placa;
    }
    
}
