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
import negocio.Jugadores.Jugador;
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
    Jugador jg;

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
    
    private void getbPropiedad() {
    
    Propiedades_Fabrica p_fabrica = new Propiedades_Fabrica();
    Tren tren = new TrenCreador();
    ServicioFabrica fabrica = new ServicioFabrica();

    switch (this.posicion) {
        case 2:
            Propiedad cafeArabe = p_fabrica.getTipo("marron",60,"cafeArabe");
            nPropiedad.setText(cafeArabe.getNombre());
            nprecio.setText(String.valueOf(cafeArabe.getPrecio()));    
            break;
        case 3:
            FlyweightSuerte suerte1 = FabricaSuerte.getSuerte( "Suerte" );
            JOptionPane.showMessageDialog(frame, suerte1.ObtenerSuerte());
            break;
        case 4:
            Propiedad cafeOmg = p_fabrica.getTipo("marron",60,"cafeOmg");
            System.out.println( cafeOmg.getNombre()+" precioo " + cafeOmg.getPrecio());
            nPropiedad.setText(cafeOmg.getNombre());
            nprecio.setText(String.valueOf(cafeOmg.getPrecio()));        
            break;
        case 5:
            JOptionPane.showMessageDialog(frame, "paga 200");        
            break;
        case 6:
            tren.setNombre("Transmileni 1");
            nPropiedad.setText(tren.getNombre());
            nprecio.setText(String.valueOf(tren.getPrecio()));    
            break;
        case 7:
            Propiedad amarilloCCTV = p_fabrica.getTipo("azul",100 , "amarilloCCTV");
            nPropiedad.setText(amarilloCCTV.getNombre());
            nprecio.setText(String.valueOf(amarilloCCTV.getPrecio()));    
            break;
        case 8:
            FlyweightSuerte Fortuna1 = FabricaSuerte.getFortuna( "FORTUNA" );;    
            JOptionPane.showMessageDialog(frame, Fortuna1.ObtenerSuerte());
            break;
        case 9:
            Propiedad amarilloNoticias = p_fabrica.getTipo("azul",100,"amarilloNoticias");
            nPropiedad.setText(amarilloNoticias.getNombre());
            nprecio.setText(String.valueOf(amarilloNoticias.getPrecio()));
            break;
        case 10:
            Propiedad amarilloRadio = p_fabrica.getTipo("azul",120,"amarilloRadio");
            nPropiedad.setText(amarilloRadio.getNombre());
            nprecio.setText(String.valueOf(amarilloRadio.getPrecio()));
            break;
        case 11:
            JOptionPane.showMessageDialog(frame,"Solo de paseo en la carcel");
            break;    
        case 12:
                Propiedad rinhoMail = p_fabrica.getTipo("morado",140 , "rinhoMail");
                nPropiedad.setText(rinhoMail.getNombre());
                nprecio.setText(String.valueOf(rinhoMail.getPrecio()));
            break;                
        case 13:
            Servicio luz = fabrica.getServicio("Electricidad",150 ,"Planta nuclear");
            nPropiedad.setText(luz.getNombre());
            nprecio.setText(String.valueOf(luz.getPrecio()));
            break;    
        case 14:
            Propiedad almacenesPiloto = p_fabrica.getTipo("morado",140 , "almacenesPiloto");
            nPropiedad.setText(almacenesPiloto.getNombre());
            nprecio.setText(String.valueOf(almacenesPiloto.getPrecio()));
            break;
        case 15:
            Propiedad tiendasArgo = p_fabrica.getTipo("morado",160,"tiendasArgo");
            nPropiedad.setText(tiendasArgo.getNombre());
            nprecio.setText(String.valueOf(tiendasArgo.getPrecio()));
            break;
        case 16:
            Tren tren2 = new TrenCreador();
            tren2.setNombre("Transmilenio 2");
            nPropiedad.setText(tren2.getNombre());
            nprecio.setText(String.valueOf(tren2.getPrecio()));
            break;
        case 17:
            Propiedad calleBachue = p_fabrica.getTipo("naranja",160,"calleBachue");
            nPropiedad.setText(calleBachue.getNombre());
            nprecio.setText(String.valueOf(calleBachue.getPrecio()));    
            break;
        case 18:
            FlyweightSuerte suerte2 = FabricaSuerte.getSuerte( "Suerte" );
            JOptionPane.showMessageDialog(frame, suerte2.ObtenerSuerte());
            break;
        case 19:
            Propiedad calleIguaque = p_fabrica.getTipo("naranja",180,"calleIguaque");
            nPropiedad.setText(calleIguaque.getNombre());
            nprecio.setText(String.valueOf(calleIguaque.getPrecio()));
            break;
        case 20:
            Propiedad calleBague = p_fabrica.getTipo("naranja",200,"calleBague");
            nPropiedad.setText(calleBague.getNombre());
            nprecio.setText(String.valueOf(calleBague.getPrecio()));    
            break;
        case 21:
            JOptionPane.showMessageDialog(frame,"Parqueadero libre");    
            break;
        case 22:
            Propiedad Zapateria = p_fabrica.getTipo("rojo",220,"Zapateria");
            nPropiedad.setText(Zapateria.getNombre());
            nprecio.setText(String.valueOf(Zapateria.getPrecio()));    
            break;
        case 23:
            FlyweightSuerte Fortuna2 = FabricaSuerte.getFortuna( "FORTUNA" );;    
            JOptionPane.showMessageDialog(frame, Fortuna2.ObtenerSuerte());    
            break;
        case 24:
            Propiedad BolsosYmochilas = p_fabrica.getTipo("rojo",220,"Bolsos y mochilas");
            nPropiedad.setText(BolsosYmochilas.getNombre());
            nprecio.setText(String.valueOf(BolsosYmochilas.getPrecio()));
            break;
        case 25:
            Propiedad  Accesorios= p_fabrica.getTipo("rojo",240,"Accesorios");
            nPropiedad.setText(Accesorios.getNombre());
            nprecio.setText(String.valueOf(Accesorios.getPrecio()));
            break;
        case 26:
            Tren tren3 = new TrenCreador();
            tren3.setNombre("Trasmilenio 3");
            nPropiedad.setText(tren3.getNombre());
            nprecio.setText(String.valueOf(tren3.getPrecio()));    
            break;
        case 27:
            Propiedad almacenesTriunfo = p_fabrica.getTipo("amarillo", 260 ,"almacenesTriunfo");
            nPropiedad.setText(almacenesTriunfo.getNombre());
            nprecio.setText(String.valueOf(almacenesTriunfo.getPrecio()));
            break;
        case 28:
            Propiedad almacenesLa18 = p_fabrica.getTipo("amarillo",260 ,"almacenesLa18");
            nPropiedad.setText(almacenesLa18.getNombre());
            nprecio.setText(String.valueOf(almacenesLa18.getPrecio()));
            break;
        case 29:
            Servicio agua = fabrica.getServicio("Acueducto",150,"Planta de agua");
            nPropiedad.setText(agua.getNombre());
            nprecio.setText(String.valueOf(agua.getPrecio()));
            break;
        case 30:
            Propiedad almacenesMiCasa = p_fabrica.getTipo("amarillo", 280, "almacenesMiCasa");
            nPropiedad.setText(almacenesMiCasa.getNombre());
            nprecio.setText(String.valueOf(almacenesMiCasa.getPrecio()));
            break;
        case 31:
            System.out.println((char)27 + "[31m CARCEL"+ (char)27 + "[0m");
            break;
        case 32:
            Propiedad saludSMS = p_fabrica.getTipo("verde", 300, "Salud SMS");
            nPropiedad.setText(saludSMS.getNombre());
            nprecio.setText(String.valueOf(saludSMS.getPrecio()));
            break;
        case 33:
            Propiedad saludCTR = p_fabrica.getTipo("verde", 300, "Salud CTR");
            nPropiedad.setText(saludCTR.getNombre());
            nprecio.setText(String.valueOf(saludCTR.getPrecio()));
            break;
        case 34:
            FlyweightSuerte Fortuna3 = FabricaSuerte.getFortuna( "FORTUNA" );
            JOptionPane.showMessageDialog(frame, Fortuna3.ObtenerSuerte());
            break;
        case 35:
            Propiedad saludINT = p_fabrica.getTipo("verde", 320, "Sslud INT");
            nPropiedad.setText(saludINT.getNombre());
            nprecio.setText(String.valueOf(saludINT.getPrecio()));
            break;
        case 36:
            Tren tren4 = new TrenCreador();
            tren4.setNombre("Trasmilenio 4");
            nPropiedad.setText(tren4.getNombre());
            nprecio.setText(String.valueOf(tren4.getPrecio()));    
            break;
        case 37:
            FlyweightSuerte Fortuna4 = FabricaSuerte.getFortuna( "FORTUNA" );    
            JOptionPane.showMessageDialog(frame, Fortuna4.ObtenerSuerte());
            break;
        case 38:
            Propiedad zonaRosa = p_fabrica.getTipo("violeta", 320, "Zona Rosa");
            nPropiedad.setText(zonaRosa.getNombre());
            nprecio.setText(String.valueOf(zonaRosa.getPrecio()));
            break;
        case 39:
            JOptionPane.showMessageDialog(frame, "paga 200");        
            break;
        case 40:
            Propiedad calleSeptima = p_fabrica.getTipo("violeta", 320, "calleSeptima");
            nPropiedad.setText(calleSeptima.getNombre());
            nprecio.setText(String.valueOf(calleSeptima.getPrecio()));
            break;
        default:
            JOptionPane.showMessageDialog(frame,"Vea pues");
            break;
        }
    
    }
    
    public int getPrecioPropiedad() {
        
        int price = 0;
    
        switch (this.posicion) {
            case 2:
                price = 60;
                break;
            case 3:
                price = 0;
                break;
            case 4:
                price = 60;
                break;
            case 5:
                price = 200;
                break;
            case 6:
                price = 200;
                break;
            case 7:
                price = 100;
                break;
            case 8:
                price = -20;
                break;
            case 9:
                price = 100;
                break;
            case 10:
                price = 120;
                break;
            case 11:
                JOptionPane.showMessageDialog(frame,"Solo de paseo en la carcel");
                break;    
            case 12:
                price = 140 ;
                break;                
            case 13:
                price = 150;
                break;    
            case 14:
                price =140 ;
                break;
            case 15:
                price = 160;
                break;
            case 16:
                price = 200;
                break;
            case 17:
                price = 160;
                break;
            case 18:
                price  =-20;
                break;
            case 19:
                price = 180;
                break;
            case 20:
                price = 200;
                break;
            case 21:
                JOptionPane.showMessageDialog(frame,"Parqueadero libre");    
                break;
            case 22:
                price = 220;
                break;
            case 23:
                price = 20;
                break;
            case 24:
                price = 220;
                break;
            case 25:
                price = 240;
                break;
            case 26:
                price = 200;
                break;
            case 27:
                price = 260;
                break;
            case 28:
                price = 260;
                break;
            case 29:
                price = 150;
                break;
            case 30:
                price = 280;
                break;
            case 31:
                System.out.println((char)27 + "[31m CARCEL"+ (char)27 + "[0m");
                break;
            case 32:
                price = 300;
                break;
            case 33:
                price = 300;
                break;
            case 34:
                price = -300;
                break;
            case 35:
                price = 320;
                break;
            case 36:
                price = 200;
                break;
            case 37:
                price = -200;
                break;
            case 38:
                price = 320;
                break;
            case 39:
                price = 200;
                break;
            case 40:
                price = 320;
                break;
            default:
                price = 0;
                break;
        }
        
        return price;
    
    }
}
