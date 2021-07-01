/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Dominio.*;
import Excepciones.ExcepcionAccesoDatos;
import Usuario.*;
import java.io.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author sofia
 */
public class ArchivoObjetoVehiculo {
   private File archivo;
    private FileInputStream aLectura;
    private FileOutputStream aEscritura;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;

    public ArchivoObjetoVehiculo(String name) {
        this.archivo = new File(name);
    }
    
     public void abrirArchivo()throws IOException{
        
        this.oos = null;
        this.aEscritura = new FileOutputStream(this.archivo, true);
        this.oos = new ObjectOutputStream(this.aEscritura);
         
    }
     
     public void cerrarArchivo()throws IOException{
       if(this.oos!=null)   
           this.oos.close();
       
       if(this.aEscritura!=null)
           this.aEscritura.close();
    }
    
     public void guardar(Vehiculo ve) throws IOException{
        
            this.oos.writeObject(ve);
        
    }
     
     public List<Vehiculo> leer()throws IOException{
        
        this.ois=null;
        List<Vehiculo> lista = new ArrayList();
        
        try{
            this.aLectura= new FileInputStream(this.archivo);
            this.ois = new ObjectInputStream(this.aLectura);
            while(true){
                try{
                    Vehiculo moto = (Vehiculo)this.ois.readObject();
                    lista.add(moto);
                }catch(EOFException eoe){
                    break;
                }    
            }
            return lista;
        }
        catch(FileNotFoundException fne){
            throw new IOException("El archivo no existe");
            
        } catch (ClassNotFoundException ex) {
            throw new IOException("La clase Vehiculo no existe");
        }
        finally{
            if(this.ois!=null)
                this.ois.close();
            
            if(this.aLectura!=null)
                this.aLectura.close();
        }
        
    }
    
    
}
