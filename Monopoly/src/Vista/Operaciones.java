/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import negocio.Tablero.FabricaPropiedades.Fabrica.Propiedades_Fabrica;
import negocio.Tablero.FabricaPropiedades.Productos.Propiedad;
import negocio.Tablero.FactoryMethod.Servicio;
import negocio.Tablero.FactoryMethod.ServicioFabrica;
import negocio.Tablero.Flyweight.FabricaSuerte;
import negocio.Tablero.Flyweight.FlyweightSuerte;
import negocio.Tablero.Prototype.Tren;
import negocio.Tablero.Prototype.TrenCreador;


/**
 *
 * @author juferoga
 */
public class Operaciones {
    
    JFrame frame;
    JLabel Titulo = new JLabel("Propiedades");
    JLabel nPropiedad = new JLabel("propiedad...");
    JLabel Propiedad = new JLabel("Propiedad:");
    JLabel precio = new JLabel("Precio :");
    JLabel nprecio = new JLabel("Precio..");
    JLabel Ju = new JLabel("Jugador :");
    JLabel Ju_nom = new JLabel("Nombre..");
    JButton Comprar = new JButton("Comprar");
    JButton Embargar = new JButton("Embargar");
    int posicion;

    public Operaciones(int p) {
     this.posicion = p;
     createGUI();
     addTitulo();
     addPropiedad();
     addnPropiedad();
     addPrecio();
     addnPrecio();
     addComprar();
     addbEmbargar();
     getbPropiedad();
     frame.setVisible(true);
     
    
    }    
    
    public void createGUI(){    
        frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(false);
        frame.setSize(400, 500);
        frame.setLocationRelativeTo(null);
        //frame.getContentPane().setBackground(tablero);
    }

    private void addTitulo() {    
        Titulo.setFont(new Font("URW GOTHIC", Font.BOLD, 20));
        Titulo.setBounds(140,0, 200, 100);
        Titulo.setForeground(Color.BLACK);
        frame.add(Titulo);

    }
    
    private void addPropiedad() {    
        Propiedad.setFont(new Font("URW GOTHIC", Font.BOLD, 15));
        Propiedad.setBounds(20,50, 200, 100);
        Propiedad.setForeground(Color.BLACK);
        frame.add(Propiedad);
    }
    
    private void addnPropiedad() {    
        nPropiedad.setFont(new Font("URW GOTHIC", Font.BOLD, 15));
        nPropiedad.setBounds(150,50, 200, 100);
        nPropiedad.setForeground(Color.BLACK);
        frame.add(nPropiedad);
    }
    
    private void addPrecio() {    
        precio.setFont(new Font("URW GOTHIC", Font.BOLD, 15));
        precio.setBounds(20,100, 200, 100);
        precio.setForeground(Color.BLACK);
        frame.add(precio);
    }
    
    private void addnPrecio() {    
        nprecio.setFont(new Font("URW GOTHIC", Font.BOLD, 15));
        nprecio.setBounds(150,100, 200, 100);
        nprecio.setForeground(Color.BLACK);
        frame.add(nprecio);
    }
    
    private void addComprar(){
        Comprar.setBounds(20,300, 100, 50);
        Comprar.setBackground(Color.WHITE);
        frame.add(Comprar);
        Comprar.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
            }  
        });  
        frame.add(Comprar);
    }
    
    private void addbEmbargar(){
        Embargar.setBounds(200,300, 100, 50);
        Embargar.setBackground(Color.WHITE);
        frame.add(Embargar);
        Embargar.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
            }  
        });  
        frame.add(Embargar);
    }
    
    private void getbPropiedad(){
    Propiedades_Fabrica p_fabrica = new Propiedades_Fabrica();
    if (this.posicion ==1){
        Propiedad cafeArabe = p_fabrica.getTipo("marron",60,"cafeArabe");
        nPropiedad.setText(cafeArabe.getNombre());
        nprecio.setText(String.valueOf(cafeArabe.getPrecio()));
    }else{
        if(this.posicion ==3){
        Propiedad cafeOmg = p_fabrica.getTipo("marron",60,"cafeOmg");
        System.out.println( cafeOmg.getNombre()+" precioo " + cafeOmg.getPrecio());
        nPropiedad.setText(cafeOmg.getNombre());
        nprecio.setText(String.valueOf(cafeOmg.getPrecio()));
        }else{
            if(this.posicion ==2){
                FlyweightSuerte suerte1 = FabricaSuerte.getSuerte( "Suerte" );
                JOptionPane.showMessageDialog(frame, suerte1.ObtenerSuerte());
                frame.setVisible(false);          
            }
            else {
                if(this.posicion ==4){
                JOptionPane.showMessageDialog(frame, "paga 200");
                frame.setVisible(false);
                }
                else{
                    if(this.posicion ==5){
                            Propiedad amarilloRadio = p_fabrica.getTipo("azul",100 , "amarilloRadio");
                            nPropiedad.setText(amarilloRadio.getNombre());
                            nprecio.setText(String.valueOf(amarilloRadio.getPrecio()));
        
        
                    }
                    else{
                        if(this.posicion ==6){
                        FlyweightSuerte suerte2 = FabricaSuerte.getSuerte( "Suerte" );    
                        JOptionPane.showMessageDialog(frame, suerte2.ObtenerSuerte());
                        frame.setVisible(false);
                        }
                        else{
                            if(this.posicion ==7){
                            Propiedad amarilloNoticias = p_fabrica.getTipo("azul",100,"amarilloNoticias");
                            nPropiedad.setText(amarilloNoticias.getNombre());
                            nprecio.setText(String.valueOf(amarilloNoticias.getPrecio()));
                            }
                        }
                    }
                }
            }
        }
    }
    
    }
    
    
}
