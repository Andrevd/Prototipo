/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.control.Usuario;

import co.edu.sena.dto.Usuario.DTOUsuario;
import co.edu.sena.modelo.Usuario.DAOUsuario;

/**
 *
 * @author SENA
 */
public class controlUsuario {
     DAOUsuario daoUsuario = new DAOUsuario();
   DTOUsuario dtoUsuario = new DTOUsuario();
 
     public boolean registrarusuario(DTOUsuario dtoUsuario){
   return daoUsuario.registrarusuario(dtoUsuario);
   }
       public boolean modificarusuario(DTOUsuario dtoUsuario){
   return daoUsuario.modificarusuario(dtoUsuario);
   }
     public boolean deshabilitarusuario(DTOUsuario dtoUsuario){
   return daoUsuario.deshabilitarusuario(dtoUsuario);
   }
     
     public DTOUsuario mostrarUsuario (int codUsuario){
     return daoUsuario.mostrarUsuario(codUsuario);
     }
     
     
     
}
