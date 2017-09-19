/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.modelo.conductor;

import co.edu.sena.dto.conductor.DTOConductor;

/**
 *
 * @author sena
 */
public class DAOConductor {
    
    DTOConductor[] dtoConductor=new DTOConductor[10];
    int contador=0;
    
    public boolean ingresarConductor(DTOConductor conductor1){
    dtoConductor[contador]=new DTOConductor();
    dtoConductor[contador]=conductor1;
    contador++;
    return true;
    }
    
     public boolean eliminarConductor(DTOConductor conductor1){
         
      if(contador<=0){
            contador=0;}
        else{
        contador--;
        }
        dtoConductor[contador]=new DTOConductor();
        dtoConductor[contador]=conductor1;
        return true;
        
    }
     
     public boolean buscarConductor(DTOConductor conductor1){
     dtoConductor[contador]=new DTOConductor();
     dtoConductor[contador]=conductor1;
     contador++;
     return true;
    }

    
}
