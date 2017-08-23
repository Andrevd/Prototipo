/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.modelo.Usuario;

import co.edu.sena.dto.Usuario.DTOUsuario;

/**
 *
 * @author SENA
 */
public class DAOUsuario {
    
    DTOUsuario dtoUsuario = new DTOUsuario ();
    
      public boolean registrarusuario (DTOUsuario dtoUsuario){
    this.dtoUsuario = dtoUsuario;
   return true;
    }
       public boolean modificarusuario (DTOUsuario dtoUsuario){
    this.dtoUsuario = dtoUsuario;
   return true;
    }
       
        public boolean deshabilitarusuario (DTOUsuario dtoUsuario){
    this.dtoUsuario = dtoUsuario;
   return true;
    }
        
        public DTOUsuario mostrarUsuario (int codUsuario){
        return this.dtoUsuario;
        }
     
     
}