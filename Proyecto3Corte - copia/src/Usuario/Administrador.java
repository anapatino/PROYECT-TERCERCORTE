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
public class Administrador extends UsuarioNormal {
  

    public Administrador() {
    }

    public Administrador( String Correo, String Contrasena) {
        super(Correo, Contrasena);
     
    }
   

   
    @Override
    public String getEstructuraTexto() {
        return super.getEstructuraTexto();
    }
}
