/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.control.vehiculo;

import co.edu.sena.dto.vehiculo.DTOVehiculo;
import co.edu.sena.modelo.vehiculo.DAOVehiculo;

/**
 *
 * @author sena
 */
public class controlVehiculo {
    DAOVehiculo daoVehiculo1 = new DAOVehiculo();
    
    public boolean ingresarVehiculo(DTOVehiculo dtoVehiculo1){
        
    return daoVehiculo1.ingresarVehiculo(dtoVehiculo1);
    }
    
     public boolean buscarVehiculo(DTOVehiculo dtoVehiculo1){
         
    return daoVehiculo1.buscarVehiculo(dtoVehiculo1);
    }
    
    public boolean eliminarVehiculo(DTOVehiculo dtoVehiculo1){
    
    return daoVehiculo1.eliminarVehiculo(dtoVehiculo1);
 }
}
