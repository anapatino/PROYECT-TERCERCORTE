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
public class VehiculoCarga extends Vehiculo {
  
    private double Carga,Volumen;

    public VehiculoCarga() {
    }

    public VehiculoCarga(String Matricula) {
        super(Matricula);
    }

    public VehiculoCarga(double Carga, double Volumen, String Matricula, String Marca, String Certificado, String Observaciones, String Disponible, int Codigo, int Modelo, double Kms, double Valor) {
        super(Matricula, Marca, Certificado, Observaciones, Disponible, Codigo, Modelo, Kms, Valor);
        this.Carga = Carga;
        this.Volumen = Volumen;
    }

    public double getCarga() {
        return Carga;
    }

    public void setCarga(double Carga) {
        this.Carga = Carga;
    }

    public double getVolumen() {
        return Volumen;
    }

    public void setVolumen(double Volumen) {
        this.Volumen = Volumen;
    }

    @Override
    public String getInfo() {
     return this.Carga+";"+this.Volumen;
    }

    public String getTipo(){
       return "Carga";
   }  
    
     @Override
    public String getEstructuraTexto(){
        return super.getEstructuraTexto()+this.Carga+";"+this.Volumen;
    }
}
