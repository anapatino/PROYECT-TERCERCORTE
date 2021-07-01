/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

/**
 *
 * @author sofia patiño
 */
public abstract class UsuarioNormal {
    private String Correo,Contrasena;

    public UsuarioNormal() {
    }

    public UsuarioNormal(String Correo) {
        this.Correo = Correo;
    }

    public UsuarioNormal(String Correo, String Contrasena) {
        this.Correo = Correo;
        this.Contrasena = Contrasena;
      
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContraseña(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    


    @Override
    public String toString() {
        return  Correo + "," + Contrasena;
    }
   
    public String getEstructuraTexto() {
        return  Correo + "," + Contrasena+";" ;
    }
}
