/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


import Dominio.*;
import Usuario.*;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author sofia patiño
 */
public interface IAccesoDatos {
    void registrarVehiculo(Vehiculo p)throws IOException;
    List<Vehiculo>leerVehiculo()throws IOException;
    Vehiculo buscarVehiculo( String Matricula)throws IOException;
    List<Vehiculo> consultarVehiculo(String Texto) throws IOException;
    void eliminarVehiculo(String Matricula)throws IOException;
    int eliminarVehiculo(int kms)throws IOException;
    
//    void insertarUsuario(UsuarioNormal p)throws ExcepcionAccesoDatos;
//    List<UsuarioNormal>leerUsuario()throws ExcepcionAccesoDatos;
//    UsuarioNormal buscarUsuario(String Correo)throws ExcepcionAccesoDatos;
//    void eliminarUsuario(String Correo )throws ExcepcionAccesoDatos;
//     public  UsuarioNormal eliminarUsuario( UsuarioNormal us) throws ExcepcionAccesoDatos;
//     public UsuarioNormal buscarUsuario(UsuarioNormal us) throws ExcepcionAccesoDatos ;
}
