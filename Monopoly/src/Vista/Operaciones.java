/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    JLabel nPropiedad = new JLabel("nombre de la propiedad..");
    JLabel Propiedad = new JLabel("Propiedad:");
    JLabel precio = new JLabel("Precio :");
    JLabel nprecio = new JLabel("Precio de la propiedad..");
    JLabel Ju = new JLabel("Jugador :");
    JLabel Ju_nom = new JLabel("Nombre..");
    JButton Comprar = new JButton("Comprar");
    JButton Embargar = new JButton("Embargar");

    public Operaciones() {
     createGUI();
     addTitulo();
     addPropiedad();
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
    
}
