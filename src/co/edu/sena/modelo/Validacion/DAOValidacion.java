/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.modelo.Validacion;

import co.edu.sena.dto.Validacion.DTOValidacion;

/**
 *
 * @author SENA
 */

public class DAOValidacion {
  
    
    DTOValidacion[] dtoValidacion = new DTOValidacion[10];
    int contador = 0;
    
    public boolean guardarValidacion(DTOValidacion Validacion)
    {
    dtoValidacion[contador] = new DTOValidacion();
    dtoValidacion[contador] = Validacion;
    contador++;
    return true;
    }
  
   
    public boolean validarIngreso(DTOValidacion Validacion)
    {
    dtoValidacion[contador] = new DTOValidacion();
    dtoValidacion[contador] = Validacion;
    contador++;
    return true; 
    }
    
    public boolean verificarDatosUsuario(DTOValidacion Validacion)
    {
    dtoValidacion[contador] = new DTOValidacion();
    dtoValidacion[contador] = Validacion;
    contador++;
    return true; 
    }
}
