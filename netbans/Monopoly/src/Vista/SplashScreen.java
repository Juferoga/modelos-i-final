/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javax.swing.*;
import java.awt.*;

public class SplashScreen {
    JFrame frame;
    JLabel image = new JLabel(new ImageIcon("/home/brayan/Imágenes/Carga2.jpeg"));
    JLabel text = new JLabel("Monopoly Game");
    JProgressBar progressBar = new JProgressBar();
    JLabel message = new JLabel();

    SplashScreen() {
        createGUI();
        addImage();
        addText();
        addProgressBar();
        addMessage();
        runningPBar();
    }

    public void createGUI() {
        frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(true);
        frame.setSize(780, 480);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.white);
        frame.setVisible(true);

    }

    public void addImage() {
        image.setSize(780, 480);
        frame.add(image);
    }

    public void addText() {
        text.setFont(new Font("URW GOTHIC", Font.BOLD, 30));
        text.setBounds(170, 220, 600, 40);
        text.setForeground(Color.BLUE);
        frame.add(text);
    }

    public void addMessage() {
        message.setBounds(250, 320, 200, 40);
        message.setForeground(Color.black);
        message.setFont(new Font("URW GOTHIC", Font.BOLD, 15));
        frame.add(message);
    }

    public void addProgressBar() {
        progressBar.setBounds(5, 450, 760, 20);
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(Color.BLACK);
        progressBar.setValue(0);
        frame.add(progressBar);
    }

    public void runningPBar() {
        int i = 0;

        while (i <= 100) {
            try {
                Thread.sleep(70);
                progressBar.setValue(i);
                message.setText("Cargando " + Integer.toString(i) + "%");
                i++;
                if (i == 100){
                    Mesa m = new Mesa();
                    m.frame.setVisible(true);
                    frame.dispose();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
