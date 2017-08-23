/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.modelo.Estado;

import co.edu.sena.dto.Estado.DTOEstado;

/**
 *
 * @author SENA
 */
public class DAOEstado {
    
   
     
    DTOEstado [] dtoEstado = new DTOEstado[10];
    int contador = 0;
     
    
   public boolean guardarEstado (DTOEstado Estado1)
   {
   dtoEstado  [contador] = new DTOEstado(); 
   dtoEstado [contador] = Estado1;
    contador++;
    return true;
  
    }
 
   public boolean mostrarEstado (DTOEstado Estado1){
    dtoEstado  [contador] = new DTOEstado(); 
   dtoEstado [contador] = Estado1;
    contador++;
    return true;
   }
    
   public boolean actualizarEstado(DTOEstado Estado1){
   dtoEstado  [contador] = new DTOEstado(); 
   dtoEstado [contador] = Estado1;
    contador++;
    return true;
    }
   
   
   
    public boolean eliminarEstado(DTOEstado Estado1){
  if(contador<=0){
      contador=0;}
  
  else {
      contador--;}
  dtoEstado[contador]=new DTOEstado();
   dtoEstado[contador] = Estado1;
   return true;
  }
 }

