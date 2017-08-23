/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.control.Estado;


import co.edu.sena.dto.Estado.DTOEstado;

import co.edu.sena.modelo.Estado.DAOEstado;


/**
 *
 * @author SENA
 */
public class controlEstado {
    DAOEstado daoEstado = new DAOEstado();

   
   public boolean guardarEstado(DTOEstado dtoEstado)
   {
   return daoEstado.guardarEstado(dtoEstado);
   }
   
   
    public boolean eliminarEstado1(DTOEstado dtoEstado)
    {
   return daoEstado.guardarEstado(dtoEstado);
   }
   
   public boolean mostrarEstado(DTOEstado dtoEstado)
   {
   return daoEstado.mostrarEstado(dtoEstado);
   }
   
    public boolean actualizarEstado(DTOEstado dtoEstado)
    {
   return daoEstado.actualizarEstado(dtoEstado);
   }
}