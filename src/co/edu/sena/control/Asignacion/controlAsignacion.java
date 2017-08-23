/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.control.Asignacion;

import co.edu.sena.dto.Asignacion.DTOAsignacion;
import co.edu.sena.modelo.Asignacion.DAOAsignacion;

/**
 *
 * @author SENA
 */
public class controlAsignacion {
    
    
    DAOAsignacion daoAsignacion1 = new DAOAsignacion();

    
    public boolean guardarAsignacion(DTOAsignacion dtoAsignacion1)
    {
        return daoAsignacion1.guardarAsignacion(dtoAsignacion1);
    }
    
     public boolean asignarClave(DTOAsignacion dtoAsignacion1)
    {
        return daoAsignacion1.asignarClave(dtoAsignacion1);
    }
     
        public boolean modificarAsignacion(DTOAsignacion dtoAsignacion1)
    {
     return daoAsignacion1.modificarAsignacion(dtoAsignacion1); 
    }
}

