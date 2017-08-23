  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.dto.Validacion;



/**
 *
 * @author SENA
 */
public class DTOValidacion {
    
    String perfil = "";
    String usuario = "";
    String contraseña = "";
    
    public void setPerfil(String perfil)
    {
        this.perfil = perfil;
   }
    
    public String getPerfil(){
        return perfil;
    }
    
    public void setUsuario(String usuario)
    {
        this.usuario = usuario;
   }
    
    public String getUsuario(){
        return usuario;
    }
   
    public void setContraseña(String contraseña)
    {
        this.contraseña = contraseña;
   }
    
    public String getContraseña(){
        return contraseña;
    }
    
}

