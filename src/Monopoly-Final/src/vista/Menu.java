import javax.swing.*;
import java.awt.*;

public class Menu {
    JFrame frame;
    JLabel image = new JLabel(new ImageIcon("modelos-i-final/src/Assets/card-splash.png"));
    JLabel text = new JLabel("Menú principal");
    JButton cargar = new JButton("Cargar partida", new ImageIcon("modelos-i-final/src/Assets/editables/flag.svg"));

    Menu(){
        createGUI();
        addImage();
        addText();
    }

    public void createGUI(){    
        frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(false);
        frame.setSize(780, 480);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.white);
    }

    private void addText() {

    }

    private void addButton(){
        cargar.setBounds(210, 70, 80, 80);
        cargar.setBackground(Color.GREEN);
        frame.add(cargar);
    }

    private void addImage() {
        image.setSize(780, 480);
        frame.add(image);
    }

}
