/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.dto.Gestion_Administrativa;


/**
 *
 * @author SENA
 */
public class DTOAdministrador {

    
    private String nombreUsuario;
    public void setNombreUsuario(String nombreUsuario)
    {this.nombreUsuario=nombreUsuario;}
    
    public String getNombreUsuario(){
    return nombreUsuario;
}
    
         private String contraseña;
    public void setContraseña(String Contraseña)
    {this.contraseña=Contraseña;}
    
    public String getContraseña(){
    return contraseña;
}

}
