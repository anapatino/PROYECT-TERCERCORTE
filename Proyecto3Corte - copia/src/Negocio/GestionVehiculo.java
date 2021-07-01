/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.*;
import Dominio.*;

import java.io.*;
import java.util.List;

/**
 *
 * @author sofia
 */
public class GestionVehiculo {
   private IAccesoDatos datos;
      
  public GestionVehiculo() {
        
        this.datos = new ImpArchivoObjeto();
       
    }    
      
   public void registrarVehiculo(Vehiculo ve) throws IOException {
        
        if(ve==null)
            throw new NullPointerException("Debe registrar una motocicleta");
        
        if(ve.getMatricula()==null || ve.getMatricula().isEmpty())
            throw new NullPointerException("Debe registrar la Matricula del vehiculo");
        
        if(ve.getMarca()==null || ve.getMarca().isEmpty())
            throw new NullPointerException("Debe registrar la marca del vehiculo");
        
        if(ve.getModelo()<0)
            throw new NullPointerException("Debe registrar un Modelo valido del vehiculo ");
        
        if(ve.getCodigo()<0)
            throw new NullPointerException("Debe registrar un Codigo valido del vehiculo");
        
         if(ve.getValor()<0)
            throw new NullPointerException("Debe registrar un valor valido del vehiculo ");
        
        if(ve.getKms()<0)
            throw new NullPointerException("Debe registrar un Km valido del vehiculo");
        
        if(this.buscarVehiculo(ve.getMatricula())!=null)
            throw new NullPointerException("El vehiculo ya se encuentra Registrada");
        
        this.datos.registrarVehiculo(ve);
    }    
      
    public List<Vehiculo> leerVehiculo() throws IOException {
        return this.datos.leerVehiculo();
    }  
      
     public Vehiculo buscarVehiculo(String Matricula) throws IOException {
        if( Matricula==null ||  Matricula.isEmpty())
            throw new NullPointerException("Se reqiere un valor valido para la matricula");
        
        return this.datos.buscarVehiculo( Matricula);
    }  
      
    public int eliminarVehiculo(int kms) throws IOException {
        return this.datos.eliminarVehiculo(kms);
    }  
      
   public void eliminarVehiculo(String  Matricula) throws IOException {
        if( Matricula==null ||  Matricula.isEmpty())
            throw new NullPointerException("Se reqiere un valor valido para la Matricula");
        
        this.datos.eliminarVehiculo( Matricula);
    }   
      
   public List<Vehiculo> consultarVehiculo(String texto) throws IOException {
        return this.datos.consultarVehiculo(texto);
    }   
      
      
      
      
      
}
