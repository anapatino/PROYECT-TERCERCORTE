/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaPrincipal;

import Dominio.*;
import Negocio.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sofia
 */
public class VentanaCatalogo extends JDialog {
  private JPanel paneFiltro;
    private JScrollPane panelTabla;
    private Container contenedor;
   
    private JPanel panelBase;
    
    private JLabel lFiltro;
    private JTextField tFiltro;
    
    private JTable tabla;
    private DefaultTableModel modelo;
    private String titulos[]={"Matricula", "Marca", "Modelo", "Codigo", "Certificado","Disponible","Valor","Kms","Carga","Volumen","Capacidad","Puertas"};
    
    private GestionVehiculo negocio;
    
     public VentanaCatalogo(JFrame frame, boolean bln) {
        super(frame, bln);
        this.setTitle("Consulta de Motocicletas - V1");
        this.negocio = new  GestionVehiculo();
        this.iniciarComponentes();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
     
     public void iniciarComponentes(){
        this.contenedor = this.getContentPane();
        this.panelBase = new JPanel();
        this.panelBase.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.panelBase.setLayout(new BorderLayout());
        
        //this.iniciarPanelFiltro();
        this.iniciarPanelTabla();
        
        try{
            java.util.List<Vehiculo> lista = this.negocio.leerVehiculo();
            this.actualizarTabla(lista);
            
        }catch(IOException ioe){
            ioe.printStackTrace();
        }    
        
        this.contenedor.add(this.panelBase);
    }
     
    public void iniciarPanelFiltro(){
        
        this.paneFiltro = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        this.lFiltro = new JLabel(" Texto de Filtro: ");
        this.tFiltro = new JTextField(10);
        this.tFiltro.addKeyListener(new eventoTeclado());
        
        this.paneFiltro.add(this.lFiltro);
        this.paneFiltro.add(this.tFiltro);
        
        this.panelBase.add(this.paneFiltro, BorderLayout.NORTH);
        
    }  
     
      public void iniciarPanelTabla(){
    
        this.panelTabla = new JScrollPane();
        this.tabla = new JTable();
        this.modelo = new DefaultTableModel(null, this.titulos);
        this.tabla.setModel(this.modelo);
        this.panelTabla.setViewportView(this.tabla);
        
        this.panelBase.add(this.panelTabla, BorderLayout.CENTER);
        
    }
     
     public void actualizarTabla(java.util.List<Vehiculo> lista){
       
            this.modelo.setNumRows(0);
            for(Vehiculo m: lista){
                VehiculoCarga c=(VehiculoCarga)m;
                VehiculoTransporte t=(VehiculoTransporte)m;
                String fila[] = {m.getMatricula(),m.getMarca(),""+m.getModelo(),""+m.getCodigo(),m.getCertificado(),m.getDisponible(),""+m.getValor(),""+m.getKms(),""+c.getCarga(),""+c.getVolumen(),""+t.getCapacidad(),""+t.getPuertas()};
                this.modelo.addRow(fila);
            }
       
    } 
     
  public void filtrarDatosTabla(){
        try {
            String texto = this.tFiltro.getText();
            java.util.List<Vehiculo> listaFiltrada = this.negocio.consultarVehiculo(texto);
            this.actualizarTabla(listaFiltrada);
        } catch (IOException ex) {
            this.mostrarMsg("Error", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    
    }  
     
   public void mostrarMsg(String titulo, String msg, int tipo){
        JOptionPane.showMessageDialog(this, msg, titulo, tipo);
    }  
 
    class eventoTeclado extends KeyAdapter{

        @Override
        public void keyReleased(KeyEvent ke) {
            filtrarDatosTabla();
        }
    
    } 
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
