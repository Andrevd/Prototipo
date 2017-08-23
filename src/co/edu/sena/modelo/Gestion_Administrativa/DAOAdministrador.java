/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.modelo.Gestion_Administrativa;

import co.edu.sena.dto.Gestion_Administrativa.DTOAdministrador;

/**
 *
 * @author SENA
 */
public class DAOAdministrador {
    
    DTOAdministrador[] dtoAdministrador = new DTOAdministrador[10];
    int contador = 0;
    
    public boolean guardarAdministrador (DTOAdministrador Administrador)
    {
    dtoAdministrador[contador] = new DTOAdministrador();
    dtoAdministrador[contador]= Administrador;
    contador ++;
   return true;
    }
    public boolean asignarclave (DTOAdministrador Administrador)
    {
    dtoAdministrador[contador] = new DTOAdministrador();
    dtoAdministrador[contador]= Administrador;
    contador ++;
   return true;
    }
    public boolean registrarconductores (DTOAdministrador Administrador){
    dtoAdministrador[contador] = new DTOAdministrador();
    dtoAdministrador[contador]= Administrador;
    contador ++;
   return true;
    }
    
    public boolean registrarvehiculos (DTOAdministrador Administrador){
    dtoAdministrador[contador] = new DTOAdministrador();
    dtoAdministrador[contador]= Administrador;
    contador ++;
   return true;
    }
    
    public boolean registrarse (DTOAdministrador Administrador){
    dtoAdministrador[contador] = new DTOAdministrador();
    dtoAdministrador[contador]= Administrador;
    contador ++;
   return true;
    }
    public boolean borraradministrador (DTOAdministrador Administrador)
    {
    dtoAdministrador[contador] = new DTOAdministrador();
    dtoAdministrador[contador]= Administrador;
    contador ++;
   return true;
    
    
    
    }
}
