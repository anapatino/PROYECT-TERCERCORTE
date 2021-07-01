/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Dominio.Vehiculo;
import java.io.*;
import java.util.*;

/**
 *
 * @author sofia
 */
public class ListaVehiculo implements IAccesoDatos, Serializable{
     private List<Vehiculo> lista;

    public ListaVehiculo() {
        this.lista = new ArrayList();
    }

    @Override
    public void registrarVehiculo(Vehiculo p) throws IOException {
       this.lista.add(p);
    }

    @Override
    public List<Vehiculo> leerVehiculo() throws IOException {
          return this.lista;
    }

    @Override
    public Vehiculo buscarVehiculo(String Matricula) throws IOException {
       for(Vehiculo m: this.lista){
            if(m.getMatricula().equalsIgnoreCase(Matricula)){
                return m;
            }
        }
        return null;
    }

    @Override
    public List<Vehiculo> consultarVehiculo(String Texto) throws IOException {
        List<Vehiculo> consulta= new ArrayList();
        for(Vehiculo m: this.lista){
           if(m.getMatricula().toUpperCase().contains(Texto.toUpperCase()) || m.getMarca().toUpperCase().contains(Texto.toUpperCase())){
                consulta.add(m);
            }
        }
        return consulta;
    }

    @Override
    public void eliminarVehiculo(String Matricula) throws IOException {
       Iterator<Vehiculo> i = this.lista.iterator();
        int contador=0;
        while(i.hasNext()){
            Vehiculo moto = (Vehiculo)i.next();
            if(moto.getMatricula().equalsIgnoreCase(Matricula)){
                i.remove();
            }
        }
    }

    @Override
    public int eliminarVehiculo(int kms) throws IOException {
        Iterator<Vehiculo> i = this.lista.iterator();
        int contador=0;
        while(i.hasNext()){
            Vehiculo m = (Vehiculo)i.next();
            if(m.getKms()>kms){
                i.remove();
                contador ++;
            }
        }
        return contador;
    }
    
    
}
