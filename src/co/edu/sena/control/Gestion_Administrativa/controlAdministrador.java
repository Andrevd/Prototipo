/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.control.Gestion_Administrativa;

import co.edu.sena.dto.Gestion_Administrativa.DTOAdministrador;
import co.edu.sena.modelo.Gestion_Administrativa.DAOAdministrador;

/**
 *
 * @author SENA
 */
public class controlAdministrador {
   DAOAdministrador daoAdministrador = new DAOAdministrador();
   DTOAdministrador dtoAdministrador = new DTOAdministrador();
   
   public boolean guardarAdministrador(DTOAdministrador dtoAdministador){
   return daoAdministrador.guardarAdministrador(dtoAdministrador);
   }
   
   public boolean asignarclave(DTOAdministrador dtoAdministador){
   return daoAdministrador.asignarclave(dtoAdministrador);
   }
   
    public boolean registraconductor(DTOAdministrador dtoAdministador){
   return daoAdministrador.registrarconductores(dtoAdministrador);
   }
    
    public boolean registrarvehiculo(DTOAdministrador dtoAdministador){
   return daoAdministrador.registrarvehiculos(dtoAdministrador);
   }
     public boolean registrarse(DTOAdministrador dtoAdministador){
   return daoAdministrador.registrarse(dtoAdministrador);
   }
    
    public boolean borraradministrador(DTOAdministrador dtoAdministrador)
    {
   return daoAdministrador.borraradministrador(dtoAdministrador);
   }
   
}
