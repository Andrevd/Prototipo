/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.modelo.Asignacion;

import co.edu.sena.dto.Asignacion.DTOAsignacion;

/**
 *
 * @author SENA
 */
public class DAOAsignacion {
    
     DTOAsignacion[] dtoAsignacion = new DTOAsignacion[10];
    int contador = 0;
    
    public boolean guardarAsignacion(DTOAsignacion Asignacion)
    {
    dtoAsignacion[contador] = new DTOAsignacion();
    dtoAsignacion[contador] = Asignacion;
    contador++;
    return true;
    }
    
    public boolean asignarClave(DTOAsignacion Asignacion)
    {
    dtoAsignacion[contador] = new DTOAsignacion();
    dtoAsignacion[contador] = Asignacion;
    contador++;
    return true;
    }
    
    public boolean modificarAsignacion(DTOAsignacion Asignacion)
    {
    dtoAsignacion[contador] = new DTOAsignacion();
    dtoAsignacion[contador] = Asignacion;
    contador++;
    return true; 
    }
}
