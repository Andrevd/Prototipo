/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.control.Validacion;


import co.edu.sena.dto.Validacion.DTOValidacion;
import co.edu.sena.modelo.Validacion.DAOValidacion;

/**
 *
 * @author SENA
 */
public class controlValidacion {
    
    DAOValidacion daoValidacion1 = new DAOValidacion();
   

    public boolean guardarValidacion(DTOValidacion dtoValidacion1)
    {
        return daoValidacion1.guardarValidacion(dtoValidacion1);
    }
    
      public boolean validarIngreso(DTOValidacion dtoValidacion1)
    {
        return daoValidacion1.validarIngreso(dtoValidacion1);
    }
      
      public boolean verificarDatosUsuario(DTOValidacion dtoValidacion1)
    {
        return daoValidacion1.verificarDatosUsuario(dtoValidacion1);
    }  
}

