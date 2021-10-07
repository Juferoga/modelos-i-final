import javax.swing.*;
import java.awt.*;

public class Menu {
    JFrame frame;
    JLabel image = new JLabel(new ImageIcon("/home/juferoga/repos/ud/modelos-i-final/src/Assets/card-splash.png"));
    JLabel text = new JLabel("Menú principal");

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
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    private void addText() {

    }

    private void addImage() {
    }

}
