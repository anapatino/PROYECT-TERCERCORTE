/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author sofia patiño
 */
public class VehiculoTransporte extends Vehiculo{
    private int Capacidad,Puertas;

    public VehiculoTransporte(String Matricula) {
        super(Matricula);
    }

    public VehiculoTransporte(int Capacidad, int Puertas, String Matricula, String Marca, String Certificado, String Observaciones, String Disponible, int Codigo, int Modelo, double Kms, double Valor) {
        super(Matricula, Marca, Certificado, Observaciones, Disponible, Codigo, Modelo, Kms, Valor);
        this.Capacidad = Capacidad;
        this.Puertas = Puertas;
    }

    public VehiculoTransporte() {
        
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public int getPuertas() {
        return Puertas;
    }

    public void setPuertas(int Puertas) {
        this.Puertas = Puertas;
    }
    
     @Override
    public String getInfo() {
     return this.Capacidad+";"+this.Puertas;
    }

    public String getTipo(){
       return "Transporte";
   }  
    
     @Override
    public String getEstructuraTexto(){
        return super.getEstructuraTexto()+ this.Capacidad+";"+this.Puertas;
    }
    
}
