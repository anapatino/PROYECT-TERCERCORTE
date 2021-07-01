/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaPrincipal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author sofia
 */
public class VentanaPrincipal extends JFrame implements ActionListener{
   private JMenuBar barraMenu;
   private JMenu menu;
   private JMenuItem menuUsuario,mConsulta,mGestionAdmi;
   private JPanel panelImg;
   private JLabel lImg;
   
   public  VentanaPrincipal (){
       this("Transportes Star ");
   }

    public VentanaPrincipal(String string) {
        super(string);
        this.iniciarComponentes();
    }
   
   public void iniciarComponentes(){
       Image img=new ImageIcon("src/Imagenes/transporteStark.jpg").getImage();
       this.setIconImage(img);
       this.iniciarBarraMenu();
       this.crearPanelImg();
       this.setLocationRelativeTo(null);
       this.setExtendedState(JFrame.MAXIMIZED_BOTH);
       this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       this.setVisible(true);
            
   } 
   
   public void iniciarBarraMenu(){
        
        this.barraMenu=new JMenuBar();
        
        this.menu=new JMenu("Menu de opciones");
        this.menu.setIcon(new ImageIcon(""));
        
//        this.menuUsuario=new JMenuItem("Ingresar");
//        this.menuUsuario.addActionListener(this);
//        this.menuUsuario.setIcon(new ImageIcon(""));//src/Imagenes/Usuario.png

        this.mConsulta=new JMenuItem("Catalogos");
        this.mConsulta.addActionListener(this);
        
        this.mGestionAdmi=new JMenuItem("Gestion Admininistrador");
        this.mGestionAdmi.addActionListener(this);
        
        
         this.menu.add(this.mGestionAdmi);         
//        this.menu.add(this.menuUsuario);
        this.menu.add(this.mConsulta);
       

        
        this.barraMenu.add(this.menu);
        
        this.setJMenuBar(this.barraMenu);
    }
   
     public void crearPanelImg(){
        this.panelImg = new JPanel();
         this.panelImg.setLayout(new FlowLayout(FlowLayout.RIGHT));
         this.lImg = new JLabel();
         this.lImg.setIcon(new ImageIcon(""));
         this.panelImg.add(this.lImg);
         
         this.getContentPane().setLayout(new BorderLayout());
         this.getContentPane().add(this.panelImg, BorderLayout.SOUTH);
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
//        if(ae.getSource()==this.menuUsuario){
//           VentanaUsuario Ingresar =new VentanaUsuario(this,true);
//       }
        if(ae.getSource()==this.mConsulta){
           VentanaCatalogo catalogo=new VentanaCatalogo(this,true);
       }
        if(ae.getSource()==this.mGestionAdmi){
           VentanaAdministrador admi =new VentanaAdministrador(this,true);
       }
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
