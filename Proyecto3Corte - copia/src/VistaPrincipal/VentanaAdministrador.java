/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaPrincipal;


import Dominio.*;
import Excepciones.ExcepcionAccesoDatos;
import Negocio.GestionVehiculo;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author sofia
 */
public class VentanaAdministrador extends JDialog{
    
  private JLabel lTipo,lMatricula,lMarca,lCertificado,lModelo,lCodigo,lDisponible,lObservaciones,lValor,lKms,lCarga,lVolumen,lCapacidad,lPuertas;  
  private JTextField tMatricula,tMarca,tCertificado,tModelo,tCodigo,tObservaciones,tValor,tKms,tCarga,tVolumen,tCapacidad,tPuertas;    
  private JComboBox cTipo,cDisponible;
  private JPanel panelImg;
  private JLabel lImg;
    
   private JButton bGuardar,bRegistrar,bBuscar,bEliminar,bCatalogo;
   
   private JPanel panelDatos,panelBotones;
   private Container contenedor;  
    
  private GestionVehiculo negocio;

 
    
   public VentanaAdministrador(JFrame frame, boolean bln) {
        super(frame, bln);
        this.setTitle("Portal de Administradores");
        this.negocio = new  GestionVehiculo();
       this.iniciarComponentes();
       //this.setSize(600, 400);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);
      
    }  
    
     public void iniciarComponentes(){
        Image img = new ImageIcon("src/Imagenes/iconoadmi.jpg").getImage();
        this.setIconImage(img);
        this.contenedor=this.getContentPane();
        this.contenedor.setLayout(new BorderLayout());
        this.panelDatos();
        this.panelBotones();
    }
    
    public void panelDatos(){
       this.panelDatos=new JPanel();
       this.panelDatos.setLayout(new GridLayout(15,3,5,5) );  
      //Creando etiquetas 
      
      this.lTipo=new JLabel("   Tipo Vehiculo: ");
      this.lMatricula=new JLabel("   Matricula: ");
      this.lMarca=new JLabel("   Marca: ");
      this.lCertificado=new JLabel("   Certificado: ");
      this.lModelo=new JLabel("   Modelo: ");
      this.lCodigo=new JLabel("   Codigo: ");
      this.lDisponible=new JLabel("   Disponible: ");
      this.lObservaciones=new JLabel("   Observaciones: ");
      this.lValor=new JLabel("   Valor: ");
      this.lKms=new JLabel("   Kilometraje: ");
      this.lCarga=new JLabel("   Carga: ");
      this.lVolumen=new JLabel("   Volumen: ");
      this.lCapacidad=new JLabel("   Capacidad: ");
      this.lPuertas=new JLabel("   Puertas: ");
      
      //creando los cuadros de textos
     
      this.tMatricula=new JTextField(null);
      this.tMatricula.setEnabled(false);/////        
      this.tMarca=new JTextField(null);
      this.tMarca.setEnabled(false);/////         
      this.tCertificado=new JTextField(null);
      this.tCertificado.setEnabled(false);/////         
      this.tModelo=new JTextField(null);
      this.tModelo.setEnabled(false);/////         
      this.tCodigo=new JTextField(null);
      this.tCodigo.setEnabled(false);/////           
      this.tObservaciones=new JTextField(null);
      this.tObservaciones.setEnabled(false);/////        
      this.tValor=new JTextField(null);
      this.tValor.setEnabled(false);/////      
      this.tKms=new JTextField(null);
      this.tKms.setEnabled(false);/////        
      this.tCarga=new JTextField(null);
      this.tCarga.setEnabled(false);/////        
      this.tVolumen=new JTextField(null);
      this.tVolumen.setEnabled(false);/////        
      this.tCapacidad=new JTextField(null);
      this.tCapacidad.setEnabled(false);/////       
      this.tPuertas=new JTextField(null);
      this.tPuertas.setEnabled(false);/////
      
      
      this.cTipo=new JComboBox();
      this.cTipo.setEnabled(false);/////        
      this.cTipo.addItem("Carga");
      this.cTipo.addItem("Transporte");
      this.cTipo.addActionListener(new EventoClickComboTipo());
      
      this.cDisponible=new JComboBox();
      this.cDisponible.setEnabled(false);/////        
      this.cDisponible.addItem("Si");
      this.cDisponible.addItem("No");
      
     this.bGuardar=new JButton("Guardar");
     this.bGuardar.addActionListener(new EventoClickBotonGuardar());
     this.bGuardar.setEnabled(false);///
       
     this.panelDatos.add(this.lTipo);
     this.panelDatos.add(this.cTipo);
     
     this.panelDatos.add(this.lMatricula);
     this.panelDatos.add(this.tMatricula);
     
     this.panelDatos.add(this.lMarca);
     this.panelDatos.add(this.tMarca);
     
     this.panelDatos.add(this.lModelo);
     this.panelDatos.add(this.tModelo);
     
     this.panelDatos.add(this.lCodigo);
     this.panelDatos.add(this.tCodigo);
     
     this.panelDatos.add(this.lCertificado);
     this.panelDatos.add(this.tCertificado);
     
     this.panelDatos.add(this.lDisponible);
     this.panelDatos.add(this.cDisponible);
     
     this.panelDatos.add(this.lValor);
     this.panelDatos.add(this.tValor);
     
     this.panelDatos.add(this.lKms);
     this.panelDatos.add(this.tKms);
     
     this.panelDatos.add(this.lObservaciones);
     this.panelDatos.add(this.tObservaciones);
     
     this.panelDatos.add(this.lCarga);
     this.panelDatos.add(this.tCarga);
     
     this.panelDatos.add(this.lVolumen);
     this.panelDatos.add(this.tVolumen);
     
     this.panelDatos.add( this.lCapacidad);
     this.panelDatos.add( this.tCapacidad);
     
     this.panelDatos.add( this.lPuertas);
     this.panelDatos.add( this.tPuertas);
     
     this.panelDatos.add(this.bGuardar);
     this.contenedor.add(this.panelDatos,BorderLayout.CENTER); 
      
      
    }
    
    
     public void panelBotones(){
        this.panelBotones=new JPanel();
        
        this.bRegistrar=new JButton("Nuevo");
        this.bRegistrar.addActionListener(new EventoClikBotonNuevo());
        this.bBuscar=new JButton("Buscar");
        this.bBuscar.addActionListener(new EventoClikBotonBuscar());
        this.bBuscar.setEnabled(false);////
        this.bEliminar=new JButton("Eliminar");
        this.bEliminar.addActionListener(new EventoClickBotonEliminar());
        this.bEliminar.setEnabled(false);///
//        this.bCatalogo=new JButton("Catalogo");
//        this.bCatalogo.addActionListener(new EventoClickBotonCatalogo());
//        this.bCatalogo.setEnabled(false);///
////        
        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(1,3,8,8));
        
        panel.add(this.bRegistrar);
        panel.add(this.bBuscar);
        panel.add(this.bEliminar);
//        panel.add(this.bCatalogo);
        
        this.panelBotones.add(panel);
        
        this.contenedor.add(this.panelBotones,BorderLayout.EAST);
        
    }

    
    
   //escuchador de eventos para el click
    class EventoClikBotonNuevo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
          activarComponentes();  
        }
    
}  
    
    class EventoClickBotonGuardar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            guardar();
        }
    }
    
    
     class EventoClickBotonEliminar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
             eliminarVehiculo();
    }
        
     }
     
//   class EventoClickBotonCatalogo implements ActionListener{
//
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//            //VentanaCatalogo cata=new VentanaCatalogo(this,true);
//        }
//        
//        }  
   
   class EventoClikBotonBuscar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
           buscarVehiculo();
        }
        
    }
   
    class EventoClickComboTipo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            ocultarComponentes();
        }
    }
   
    //clase para habilitar los componentes 
    
    
        
    public void activarComponentes(){
       
      this.tMatricula.setEnabled(true);       
      this.tMarca.setEnabled(true);    
      this.tCertificado.setEnabled(true);
      this.tModelo.setEnabled(true);   
      this.tCodigo.setEnabled(true);          
      this.tObservaciones.setEnabled(true);     
      this.tValor.setEnabled(true);    
      this.tKms.setEnabled(true);        
      this.tCarga.setEnabled(true);       
      this.tVolumen.setEnabled(true);      
      this.tCapacidad.setEnabled(true);     
      this.tPuertas.setEnabled(true);
      this.cTipo.setEnabled(true);        
      this.cDisponible.setEnabled(true);  
      
      
       this.bGuardar.setEnabled(true);
       //this.bCatalogo.setEnabled(true);
       this.bBuscar.setEnabled(true);
       this.bEliminar.setEnabled(true); 
       
       this.tMatricula.grabFocus();
    }
    
    public void ocultarComponentes(){
      String tipo = this.cTipo.getSelectedItem().toString();

        if(tipo.equalsIgnoreCase("Carga")){
            this.tMatricula.setVisible(true);       
            this.tMarca.setVisible(true);   
            this.tCertificado.setVisible(true);
            this.tModelo.setVisible(true);  
            this.tCodigo.setVisible(true);        
            this.tObservaciones.setVisible(true);    
            this.tValor.setVisible(true);   
            this.tKms.setVisible(true);       
            this.tCarga.setVisible(true);      
            this.tVolumen.setVisible(true);  
            this.tCapacidad.setVisible(false);    
            this.tPuertas.setVisible(false); 
            this.lCapacidad.setVisible(false);    
            this.lPuertas.setVisible(false); 
            this.cDisponible.setVisible(true); 
            this.lCarga.setVisible(true);      
            this.lVolumen.setVisible(true);  
            
            
      
        }  else{
            
            this.lCarga.setVisible(false);      
            this.lVolumen.setVisible(false);   
            this.tCarga.setVisible(false);      
            this.tVolumen.setVisible(false);   
            this.tCapacidad.setVisible(true);    
            this.tPuertas.setVisible(true);
            this.lCapacidad.setVisible(true);    
            this.lPuertas.setVisible(true);
        }
    }
    
     public void mostrarMsg(String titulo, String msg, int tipo) {
        JOptionPane.showMessageDialog(this, msg, titulo, tipo);
    }
     
      public void guardar() {

        try {
              Vehiculo pub = this.leerDatos();
            this.negocio.registrarVehiculo(pub);
            this.mostrarMsg("Exito", "Registro almacenado con exito", JOptionPane.INFORMATION_MESSAGE);
            this.limpiarComponentes();
        } catch (IOException | NullPointerException ex) {
            ex.printStackTrace();
            this.mostrarMsg("Error", ex.getMessage(), JOptionPane.ERROR_MESSAGE);

        }
        
    }
      
      public Vehiculo leerDatos(){
      String matri= this.tMatricula.getText();    
      String marca=this.tMarca.getText();   
      String certi=this.tCertificado.getText();
      int modelo=Integer.parseInt( this.tModelo.getText());        
      int codigo=Integer.parseInt( this.tCodigo.getText());       
      String obse=this.tObservaciones.getText();    
      double valor=Double.parseDouble(this.tValor.getText());    
      double kms=Double.parseDouble(this.tKms.getText());    
      double carga=Double.parseDouble(this.tCarga.getText()); 
      double volu=Double.parseDouble(this.tVolumen.getText());   
      int capa=Integer.parseInt(this.tCapacidad.getText());   
      int puer=Integer.parseInt(this.tPuertas.getText());
      String tipo=this.cTipo.getSelectedItem().toString();        
      String dispo=this.cDisponible.getSelectedItem().toString(); 
      
      
      
      if(tipo.equalsIgnoreCase("Carga")){
          return new VehiculoCarga(carga,volu,matri,marca,certi,obse,dispo,codigo,modelo,kms,valor);
      
      }else{
          return new VehiculoTransporte(capa,puer,matri,marca,certi,obse,dispo,codigo,modelo,kms,valor);
          
      }
      
      }
      
      
      public void limpiarComponentes(){
      this.tMatricula.setText(null);      
      this.tMarca.setText(null);    
      this.tCertificado.setText(null);
      this.tModelo.setText(null);  
      this.tCodigo.setText(null);          
      this.tObservaciones.setText(null);    
      this.tValor.setText(null);   
      this.tKms.setText(null);        
      this.tCarga.setText(null);      
      this.tVolumen.setText(null);      
      this.tCapacidad.setText(null);    
      this.tPuertas.setText(null);
      this.cTipo.grabFocus();       
    
      
      }
    
    
    
    public void buscarVehiculo(){
        
       try{
           String matri=this.tMatricula.getText();
           Vehiculo p=this.negocio.buscarVehiculo(matri);
           
           if(p==null){
            throw new NullPointerException("La matricula no se encuentra registrado");  
           }
           
          this.tMatricula.setText(p.getMatricula());      
          this.tMarca.setText(p.getMarca());   
          this.tModelo.setText(p.getModelo()+"");
          this.tCodigo.setText(p.getCodigo()+""); 
          this.tCertificado.setText(p.getCertificado()+"");
          this.cDisponible.setSelectedItem(p.getDisponible());  
          this.tValor.setText(p.getValor()+"");       
          this.tKms.setText(p.getKms()+""); 
          this.tObservaciones.setText(p.getObservaciones());    
  
       if(p instanceof VehiculoCarga ){
             this.cTipo.setSelectedItem("Carga");
             VehiculoCarga c=(VehiculoCarga)p;
              this.tCarga.setText(c.getCarga()+""); 
              this.tVolumen.setText(c.getVolumen()+"");
             
         }else {
             if( p instanceof VehiculoTransporte){
               this.cTipo.setSelectedItem("Transporte"); 
               VehiculoTransporte t=(VehiculoTransporte)p;
               this.tCapacidad.setText(t.getCapacidad()+"");
               this.tPuertas.setText(t.getPuertas()+"");
               }     
            }
           
           
       }catch(IOException | NullPointerException ex) {
         this.mostrarMsg("Error", ex.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
       }
    
    
 
    public void eliminarVehiculo(){
       String matri=this.tMatricula.getText();
      int confirmacion = JOptionPane.showConfirmDialog(this, "Desea eliminar el elemento", "Confirmacion", JOptionPane.OK_CANCEL_OPTION); 
      if (confirmacion == 0) {
            try {
               this.negocio.eliminarVehiculo(matri);
               this.mostrarMsg("Exito", "Elemento eliminado con exito", JOptionPane.INFORMATION_MESSAGE);
               this.limpiarComponentes();
            } catch (IOException | NullPointerException ex) {
                this.mostrarMsg("Error", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
        }      
    }
     
     
        
}
    
    

