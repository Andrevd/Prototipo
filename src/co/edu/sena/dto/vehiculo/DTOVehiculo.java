/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.dto.vehiculo;



/**
 *
 * @author sena
 */
public class DTOVehiculo {
     
     
     private int codVehiculo;
     public void setCodVehiculo(int codVehiculo1)
     {this.codVehiculo=codVehiculo1;}
     
     public int getCodVehiculo(){
     return codVehiculo;
     }
     
     private String placa;
     public void setPlaca(String placa1)
     {this.placa=placa1;}
     
     public String getPlaca(){
     return placa;
     }
     
     private String ruta;
     public void setRuta(String ruta1)
     {this.ruta=ruta1;}
     
     public String getRuta(){
     return ruta;
     }
     
     private String marca;
     public void setMarca(String marca1)
     {this.marca=marca1;}
     
     public String getMarca(){
     return marca;
     }
     
     private String empresa;
     public void setEmpresa(String empresa1)
     {this.empresa=empresa1;}
     
     public String getEmpresa(){
     return empresa;
     }
}
