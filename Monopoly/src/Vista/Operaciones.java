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
public class Operaciones  {
    
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
               posicion = posicion + 1;
               getbPropiedad();
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
    
    private void getbPropiedad() {
    Propiedades_Fabrica p_fabrica = new Propiedades_Fabrica();
    Tren tren = new TrenCreador();
    ServicioFabrica fabrica = new ServicioFabrica();
    
    if (this.posicion ==2){
        Propiedad cafeArabe = p_fabrica.getTipo("marron",60,"cafeArabe");
        nPropiedad.setText(cafeArabe.getNombre());
        nprecio.setText(String.valueOf(cafeArabe.getPrecio()));
    }else{
        if(this.posicion ==4){
        Propiedad cafeOmg = p_fabrica.getTipo("marron",60,"cafeOmg");
        System.out.println( cafeOmg.getNombre()+" precioo " + cafeOmg.getPrecio());
        nPropiedad.setText(cafeOmg.getNombre());
        nprecio.setText(String.valueOf(cafeOmg.getPrecio()));
        }else{
            if(this.posicion ==3){
                FlyweightSuerte suerte1 = FabricaSuerte.getSuerte( "Suerte" );
                JOptionPane.showMessageDialog(frame, suerte1.ObtenerSuerte());
                //frame.setVisible(false);          
            }
            else {
                if(this.posicion ==5){
                JOptionPane.showMessageDialog(frame, "paga 200");
                //frame.setVisible(false);
                }
                else{
                    if(this.posicion ==6){
                        
                        tren.setNombre("Transmileni 1");
                        nPropiedad.setText(tren.getNombre());
                        nprecio.setText(String.valueOf(tren.getPrecio()));
                    }
                    else{
                        if(this.posicion ==7){
                        Propiedad amarilloCCTV = p_fabrica.getTipo("azul",100 , "amarilloCCTV");
                        nPropiedad.setText(amarilloCCTV.getNombre());
                        nprecio.setText(String.valueOf(amarilloCCTV.getPrecio()));    
                        }
                        else{
                            if(this.posicion ==8){
                            FlyweightSuerte Fortuna1 = FabricaSuerte.getFortuna( "FORTUNA" );;    
                            JOptionPane.showMessageDialog(frame, Fortuna1.ObtenerSuerte());
                            //frame.setVisible(false);    
                            }
                            else{
                                if(this.posicion ==9){
                                Propiedad amarilloNoticias = p_fabrica.getTipo("azul",100,"amarilloNoticias");
                                nPropiedad.setText(amarilloNoticias.getNombre());
                                nprecio.setText(String.valueOf(amarilloNoticias.getPrecio()));
                                }
                                else{
                                    if(this.posicion ==10){
                                    Propiedad amarilloRadio = p_fabrica.getTipo("azul",120,"amarilloRadio");
                                    nPropiedad.setText(amarilloRadio.getNombre());
                                    nprecio.setText(String.valueOf(amarilloRadio.getPrecio()));
                                    }
                                    else{
                                        if (this.posicion ==11){
                                            JOptionPane.showMessageDialog(frame,"Solo de paseo en la carcel");
                                        }
                                        else{
                                            if(this.posicion ==12){
                                            Propiedad rinhoMail = p_fabrica.getTipo("morado",140 , "rinhoMail");
                                            nPropiedad.setText(rinhoMail.getNombre());
                                            nprecio.setText(String.valueOf(rinhoMail.getPrecio()));
                                            }
                                            else{
                                                if(this.posicion ==13){
                                                Servicio luz = fabrica.getServicio("Electricidad",150 ,"Planta nuclear");
                                                nPropiedad.setText(luz.getNombre());
                                                nprecio.setText(String.valueOf(luz.getPrecio()));
                                                }
                                                else{
                                                    if(this.posicion ==14){
                                                    Propiedad almacenesPiloto = p_fabrica.getTipo("morado",140 , "almacenesPiloto");
                                                    nPropiedad.setText(almacenesPiloto.getNombre());
                                                    nprecio.setText(String.valueOf(almacenesPiloto.getPrecio()));
                                                    }
                                                    else{
                                                        if(this.posicion ==15){
                                                        Propiedad tiendasArgo = p_fabrica.getTipo("morado",160,"tiendasArgo");
                                                        nPropiedad.setText(tiendasArgo.getNombre());
                                                        nprecio.setText(String.valueOf(tiendasArgo.getPrecio()));
                                                        }
                                                        else{
                                                            if(this.posicion ==16){
                                                            Tren tren2 = new TrenCreador();
                                                            tren2.setNombre("Transmilenio 2");
                                                            nPropiedad.setText(tren2.getNombre());
                                                            nprecio.setText(String.valueOf(tren2.getPrecio()));
                                                            }
                                                            else{
                                                                if(this.posicion ==17){
                                                                Propiedad calleBachue = p_fabrica.getTipo("naranja",160,"calleBachue");
                                                                nPropiedad.setText(calleBachue.getNombre());
                                                                nprecio.setText(String.valueOf(calleBachue.getPrecio()));    
                                                                }
                                                                else{
                                                                    if(this.posicion ==18){
                                                                    FlyweightSuerte suerte2 = FabricaSuerte.getSuerte( "Suerte" );
                                                                    JOptionPane.showMessageDialog(frame, suerte2.ObtenerSuerte());
                                                                    }
                                                                    else {
                                                                        if(this.posicion ==19){
                                                                        Propiedad calleIguaque = p_fabrica.getTipo("naranja",180,"calleIguaque");
                                                                        nPropiedad.setText(calleIguaque.getNombre());
                                                                        nprecio.setText(String.valueOf(calleIguaque.getPrecio()));
                                                                        }
                                                                        else{
                                                                            if(posicion ==20){
                                                                            Propiedad calleBague = p_fabrica.getTipo("naranja",200,"calleBague");
                                                                            nPropiedad.setText(calleBague.getNombre());
                                                                            nprecio.setText(String.valueOf(calleBague.getPrecio()));    
                                                                            }
                                                                            else{
                                                                                if(posicion ==21){
                                                                                JOptionPane.showMessageDialog(frame,"Parqueadero libre");    
                                                                                }
                                                                                else{
                                                                                    if(posicion ==22){
                                                                                    Propiedad Zapateria = p_fabrica.getTipo("rojo",220,"Zapateria");
                                                                                    nPropiedad.setText(Zapateria.getNombre());
                                                                                    nprecio.setText(String.valueOf(Zapateria.getPrecio()));    
                                                                                    }
                                                                                    else{
                                                                                        if(posicion ==23){
                                                                                        FlyweightSuerte Fortuna2 = FabricaSuerte.getFortuna( "FORTUNA" );;    
                                                                                        JOptionPane.showMessageDialog(frame, Fortuna2.ObtenerSuerte());    
                                                                                        }
                                                                                        else{
                                                                                            if(posicion ==24){
                                                                                                Propiedad BolsosYmochilas = p_fabrica.getTipo("rojo",220,"Bolsos y mochilas");
                                                                                                nPropiedad.setText(BolsosYmochilas.getNombre());
                                                                                                nprecio.setText(String.valueOf(BolsosYmochilas.getPrecio()));
                                                                                            }
                                                                                            else{
                                                                                                if(posicion ==25){
                                                                                                Propiedad  Accesorios= p_fabrica.getTipo("rojo",240,"Accesorios");
                                                                                                nPropiedad.setText(Accesorios.getNombre());
                                                                                                nprecio.setText(String.valueOf(Accesorios.getPrecio()));
                                                                                                }
                                                                                                else{
                                                                                                    if(posicion ==26){
                                                                                                    Tren tren3 = new TrenCreador();
                                                                                                    tren3.setNombre("Trasmilenio 3");
                                                                                                    nPropiedad.setText(tren3.getNombre());
                                                                                                    nprecio.setText(String.valueOf(tren3.getPrecio()));    
                                                                                                    }
                                                                                                    else{
                                                                                                        if(posicion ==27){
                                                                                                        Propiedad almacenesTriunfo = p_fabrica.getTipo("amarillo", 260 ,"almacenesTriunfo");
                                                                                                        nPropiedad.setText(almacenesTriunfo.getNombre());
                                                                                                        nprecio.setText(String.valueOf(almacenesTriunfo.getPrecio()));
                                                                                                        }
                                                                                                        else{
                                                                                                            if(posicion ==28){
                                                                                                            Propiedad almacenesLa18 = p_fabrica.getTipo("amarillo",260 ,"almacenesLa18");
                                                                                                            nPropiedad.setText(almacenesLa18.getNombre());
                                                                                                            nprecio.setText(String.valueOf(almacenesLa18.getPrecio()));
                                                                                                            }
                                                                                                            else{
                                                                                                                if(posicion ==29){
                                                                                                                Servicio agua = fabrica.getServicio("Acueducto",150,"Planta de agua");
                                                                                                                nPropiedad.setText(agua.getNombre());
                                                                                                                nprecio.setText(String.valueOf(agua.getPrecio()));
                                                                                                                }
                                                                                                                else{
                                                                                                                    if(posicion ==30){
                                                                                                                        Propiedad almacenesMiCasa = p_fabrica.getTipo("amarillo", 280, "almacenesMiCasa");
                                                                                                                        nPropiedad.setText(almacenesMiCasa.getNombre());
                                                                                                                        nprecio.setText(String.valueOf(almacenesMiCasa.getPrecio()));
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }                                                
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    }
    
    
}
