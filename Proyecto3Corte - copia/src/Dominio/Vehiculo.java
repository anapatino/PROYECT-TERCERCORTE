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
public abstract class Vehiculo {
    private String Matricula,Marca,Certificado,Observaciones,Disponible;
    private int Codigo,Modelo;
    private double Kms,Valor;                                                                                                                          

    public Vehiculo() {
    }

    public Vehiculo(String Matricula) {
        this.Matricula = Matricula;
    }

   
    public Vehiculo(double Kms) {
        this.Kms = Kms;
    }

    public Vehiculo(String Matricula, String Marca, String Certificado, String Observaciones, String Disponible, int Codigo, int Modelo, double Kms, double Valor) {
        this.Matricula = Matricula;
        this.Marca = Marca;
        this.Certificado = Certificado;
        this.Observaciones = Observaciones;
        this.Disponible = Disponible;
        this.Codigo = Codigo;
        this.Modelo = Modelo;
        this.Kms = Kms;
        this.Valor = Valor;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getCertificado() {
        return Certificado;
    }

    public void setCertificado(String Certificado) {
        this.Certificado = Certificado;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public String getDisponible() {
        return Disponible;
    }

    public void setDisponible(String Disponible) {
        this.Disponible = Disponible;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public double getKms() {
        return Kms;
    }

    public void setKms(double Kms) {
        this.Kms = Kms;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }
    
    public abstract String getInfo() ;
    
    @Override
    public String toString() {
        return Matricula + "," + Marca + "," + Certificado + "," + Observaciones + "," + Disponible + "," + Codigo + "," + Modelo + "," + Kms + "," + Valor + getInfo();
    }
    
     public String getEstructuraTexto() {
        return  getInfo()+";"+ Matricula + ";" + Marca + ";" + Certificado + ";" + Observaciones + ";" + Disponible + ";" + Codigo + ";" + Modelo + ";" + Kms + ";" + Valor + ';';
    }
  
}
