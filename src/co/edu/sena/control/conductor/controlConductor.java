/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.control.conductor;

import co.edu.sena.dto.conductor.DTOConductor;
import co.edu.sena.modelo.conductor.DAOConductor;

/**
 *
 * @author sena
 */
public class controlConductor {
    
    DAOConductor daoConductor1 = new DAOConductor();
  
    
    public boolean ingresarConductor(DTOConductor dtoConductor1){
        
        
    return daoConductor1.ingresarConductor(dtoConductor1);
    }
    
     public boolean buscarConductor(DTOConductor dtoConductor1){
         
    return daoConductor1.buscarConductor(dtoConductor1);
    }
    
    public boolean eliminarConductor(DTOConductor dtoConductor1){
    
    return daoConductor1.eliminarConductor(dtoConductor1);
 }

 
}
