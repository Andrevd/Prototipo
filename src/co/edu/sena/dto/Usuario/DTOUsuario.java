/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.dto.Usuario;

/**
 *
 * @author SENA
 */
public class DTOUsuario {
     private int dni_usuario;

    public int getDni_usuario() {
        return dni_usuario;
    }

    public void setDni_usuario(int dni_usuario) {
        this.dni_usuario = dni_usuario;
    }
     private String nom_usuario;
    public void setNom_usuario(String nom_usuario)
    {this.nom_usuario=nom_usuario;}
    
    public String getNom_Usuario(){
    return nom_usuario;
}
     private String perfil;
    public void setPerfil(String perfil)
    {this.perfil=perfil;}
    
    public String getPerfil(){
    return perfil;
    
    }
     private String cedula;
    public void setCedula(String cedula)
    {this.cedula=cedula;}
    
    public String getCedula(){
    return cedula;
    }
     private String nombre;
    public void setNombre(String nombre)
    {this.nombre=nombre;}
    
    public String getNombre(){
    return nombre;
    }
    private String apellido;
    public void setApellido(String apellido)
    {this.apellido=apellido;}
    
    public String getApellido(){
    return apellido;
    }
    private String telefono;
    public void setTelefono(String telefono)
    {this.telefono=telefono;}
    
    public String getTelefono(){
    return telefono;
    }
    private String movil;
    public void setMovil(String movil)
    {this.movil=movil;}
    
    public String getMovil(){
    return movil;
    }
    
    private String correo;
    public void setcorreo(String correo)
    {this.correo=correo;}
    
    public String getCorreo(){
    return correo;
    }
    private String direccion;
    public void setDireccion(String direccion)
    {this.direccion=direccion;}
    
    public String getDireccion(){
    return direccion;
    }
    private String fechaN;
    public void setFechaN(String Fechan)
    {this.fechaN=Fechan;}
    
    public String getFechaN(){
    return fechaN;
    }
     private String Contraseña;
    public void setContraseña(String contraseña)
    {this.Contraseña=contraseña;}
    
    public String getContraseña(){
    return Contraseña;
    }
    

}
