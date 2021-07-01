/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


import Dominio.Vehiculo;
import java.io.*;
import java.util.List;

/**
 *
 * @author sofia
 */
public class ImpArchivoObjeto implements IAccesoDatos{
    private File archivo;
    private FileInputStream aLectura;
    private FileOutputStream aEscritura;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;

    public ImpArchivoObjeto(String name) {
        this.archivo = new File(name);
    }

    public ImpArchivoObjeto() {
        this("CatalogoVehiculo.obj");
    }

    private void guardar(ListaVehiculo lista) throws IOException{
        
        this.oos=null;
        try{
            this.aEscritura = new FileOutputStream(this.archivo, false);
            this.oos = new ObjectOutputStream(this.aEscritura);
            this.oos.writeObject(lista);
        }catch(IOException ioe){
            throw ioe;
        }
        finally{
            if(this.oos!=null)
                this.oos.close();
            
            if(this.aEscritura!=null)
                this.aEscritura.close();
        }
    
    }
    
    private ListaVehiculo leer() throws IOException{
        
        ListaVehiculo lista = null;
        if(this.archivo.exists()){
            
            this.ois=null;
            try{
                this.aLectura = new FileInputStream(this.archivo);
                this.ois= new ObjectInputStream(this.aLectura);
                lista = ( ListaVehiculo ) this.ois.readObject();
                return lista;
            }catch(IOException ioe){
                throw ioe;
            } catch (ClassNotFoundException ex) {
                throw new IOException("La clase Lista Motocicleta no existe");
            } 
            finally{
                if(this.ois!=null)
                    this.ois.close();
                
                if(this.aLectura!=null)
                    this.aLectura.close();
            }
        }
        else{
            lista = new  ListaVehiculo ();
            return lista;
        }
        
    }
    
    
    @Override
    public void registrarVehiculo(Vehiculo p) throws IOException {
        ListaVehiculo lista = this.leer();
        lista.registrarVehiculo(p);
        this.guardar(lista);
    }

    @Override
    public List<Vehiculo> leerVehiculo() throws IOException {
        ListaVehiculo lista = this.leer();
        return lista.leerVehiculo();

    }

    @Override
    public Vehiculo buscarVehiculo(String Matricula) throws IOException {
        ListaVehiculo lista = this.leer();
         return lista.buscarVehiculo(Matricula);
    }

    @Override
    public List<Vehiculo> consultarVehiculo(String Texto) throws IOException {
        ListaVehiculo lista = this.leer();
        return lista.consultarVehiculo(Texto);
    }

    @Override
    public void eliminarVehiculo(String Matricula) throws IOException {
        ListaVehiculo lista = this.leer();
         lista.eliminarVehiculo(Matricula);
         this.guardar(lista);
    }

    @Override
    public int eliminarVehiculo(int kms) throws IOException {
        ListaVehiculo lista = this.leer();
         int cont=lista.eliminarVehiculo(kms);
         this.guardar(lista);
         return cont;
    }
}
