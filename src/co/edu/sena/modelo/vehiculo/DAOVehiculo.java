/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.modelo.vehiculo;

import co.edu.sena.dto.vehiculo.DTOVehiculo;

/**
 *
 * @author sena
 */
public class DAOVehiculo {
    
     DTOVehiculo[] dtoVehiculo=new DTOVehiculo[10];
     int contador=0;
     
     public boolean ingresarVehiculo(DTOVehiculo vehiculo1){
    dtoVehiculo[contador]=new DTOVehiculo();
    dtoVehiculo[contador]=vehiculo1;
    contador++;
    return true;
    }
    
     public boolean eliminarVehiculo(DTOVehiculo vehiculo1){
         
      if(contador<=0){
            contador=0;}
        else{
        contador--;
        }
        dtoVehiculo[contador]=new DTOVehiculo();
        dtoVehiculo[contador]=vehiculo1;
        return true;
        
    }
     
     public boolean buscarVehiculo(DTOVehiculo vehiculo1){
     dtoVehiculo[contador]=new DTOVehiculo();
     dtoVehiculo[contador]=vehiculo1;
     contador++;
     return true;
    }
}
