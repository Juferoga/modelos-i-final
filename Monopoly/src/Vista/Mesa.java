/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista; 
//package negocio.Jugadores.Jugador;
import negocio.Jugadores.Jugador;
import negocio.Tablero.Dado.Dado;
import negocio.Tablero.Esquinas.*;
import negocio.Tablero.Ficha.Ficha;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Mesa {

    // Juferoga :)
    
    String dir = "/home/brayan/repos/modelos-i-final/Monopoly/src/assets/";

    private JPanel Imagenes;
    String nom1;
    JFrame frame;
    JLabel tablero = new JLabel(new ImageIcon(dir+"TableroF.png"));
    JLabel F1 = new JLabel(new ImageIcon(dir+"fichaAzul.png"));
    JLabel F2 = new JLabel(new ImageIcon(dir+"fichaRoja.png"));
    JLabel Titulo = new JLabel("Jugadores");
    JLabel Ju1 = new JLabel("Jugador 1 :");
    JLabel Ju1_nom = new JLabel("Nombre");
    JLabel Ju1_sal = new JLabel("Saldo :");
    JLabel Ju1_sal_n = new JLabel("50000");
    JLabel Ju2 = new JLabel("Jugador 2 :");
    JLabel Ju2_nom = new JLabel("Nombre");
    JLabel Ju2_sal = new JLabel("Saldo :");
    JLabel Ju2_sal_n = new JLabel("50000");
    JLabel Tur = new JLabel("Turno");
    JLabel Turn = new JLabel("Jugador..");
    JLabel Dado = new JLabel("Dado");
    JLabel Dadon = new JLabel("Dado numero..");
    JButton Lanzar = new JButton("Lanzar");
    JLabel Dado2 = new JLabel("Dado2");
    JLabel Dadon2 = new JLabel("Dado número 2..");
    String Nombre;
    String Nombre2;
    int saldo1;
    int saldo2;
    int Dado_1;
    int Dado_2;
    int Dadosuma;
    int fposicion=0;
    int fposicion2=0;
    int x,y;
    boolean pares;

    Image img= new ImageIcon(dir+"TableroF.png").getImage();
    ImageIcon img2=new ImageIcon(img.getScaledInstance(600, 600, Image.SCALE_SMOOTH));
    //Image img3= new ImageIcon(dir+"fichaAzul.png").getImage();
    //ImageIcon img4=new ImageIcon(img3.getScaledInstance(50, 50, Image.SCALE_SMOOTH));           
    
    Mesa(){
        
        Imagenes= new JPanel();
        //Imagenes.setLayout(new GridLayout(1,2));
        Jugador j1 = new Jugador("Rodolfo", 0);
        Nombre=j1.getNombre();
        saldo1=j1.getSaldo();
        Jugador j2 = new Jugador("Antonio", 0);
        Nombre2=j2.getNombre();
        saldo2=j2.getSaldo();
        createGUI();
        addImage();
        addF1();
        addF2();
        addPanel();
        addTitulo();
        addJu1();
        addJu1_sal();
        addJu1_nom();
        addJu1_sal_n();
        addJu2();
        addJu2_sal();
        addJu2_nom();
        addJu2_sal_n();
        addTur();
        addTurn();
        addDado();
        addDadon();
        addButton_Lanzar();
        addDado2();
        addDadon2();
        frame.setVisible(true);
    }
        
    public void createGUI(){    
        frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(false);
        frame.setSize(980, 680);
        frame.setLocationRelativeTo(null);
        //frame.getContentPane().setBackground(tablero);
    }

    private void addTitulo() {    
        Titulo.setFont(new Font("URW GOTHIC", Font.BOLD, 30));
        Titulo.setBounds(780, 50, 200, 200);
        Titulo.setForeground(Color.BLACK);
        frame.add(Titulo);

    }

    private void addJu1() {    
        Ju1.setFont(new Font("URW GOTHIC", Font.BOLD, 15));
        Ju1.setBounds(780, 100, 200, 200);
        Ju1.setForeground(Color.BLACK);
        frame.add(Ju1);

    }
    
    private void addJu1_sal() {    
        Ju1_sal.setFont(new Font("URW GOTHIC", Font.BOLD, 15));
        Ju1_sal.setBounds(780, 140, 200, 200);
        Ju1_sal.setForeground(Color.BLACK);
        frame.add(Ju1_sal);

    }
        
    private void addJu1_nom() {    
        Ju1_nom.setFont(new Font("URW GOTHIC", Font.BOLD, 15));
        Ju1_nom.setBounds(880, 100, 200, 200);
        Ju1_nom.setForeground(Color.BLACK);
        Ju1_nom.setText(Nombre);
        frame.add(Ju1_nom);

}
    
    private void addJu1_sal_n() {    
        Ju1_sal_n.setFont(new Font("URW GOTHIC", Font.BOLD, 15));
        Ju1_sal_n.setBounds(880, 140, 200, 200);
        Ju1_sal_n.setForeground(Color.BLACK);
        Ju1_sal_n.setText(String.valueOf(saldo1));
        frame.add(Ju1_sal_n);

    }
        
    private void addJu2() {    
        Ju2.setFont(new Font("URW GOTHIC", Font.BOLD, 15));
        Ju2.setBounds(780, 180, 200, 200);
        Ju2.setForeground(Color.BLACK);
        frame.add(Ju2);

    }
    
    private void addJu2_sal() {    
        Ju2_sal.setFont(new Font("URW GOTHIC", Font.BOLD, 15));
        Ju2_sal.setBounds(780, 220, 200, 200);
        Ju2_sal.setForeground(Color.BLACK);
        frame.add(Ju2_sal);

    }
        
    private void addJu2_nom() {    
        Ju2_nom.setFont(new Font("URW GOTHIC", Font.BOLD, 15));
        Ju2_nom.setBounds(880, 180, 200, 200);
        Ju2_nom.setForeground(Color.BLACK);
        Ju2_nom.setText(Nombre2);
        frame.add(Ju2_nom);

    }
    
    private void addJu2_sal_n() {    
        Ju2_sal_n.setFont(new Font("URW GOTHIC", Font.BOLD, 15));
        Ju2_sal_n.setBounds(880, 220, 200, 200);
        Ju2_sal_n.setForeground(Color.BLACK);
        Ju2_sal_n.setText(String.valueOf(saldo2));
        frame.add(Ju2_sal_n);

    }
    
    private void addTur() {    
        Tur.setFont(new Font("URW GOTHIC", Font.BOLD, 30));
        Tur.setBounds(820, 280, 200, 200);
        Tur.setForeground(Color.BLACK);
        frame.add(Tur);
    }
    
    private void addTurn() {    
        Turn.setFont(new Font("URW GOTHIC", Font.BOLD, 15));
        Turn.setBounds(820, 320, 200, 200);
        Turn.setForeground(Color.BLACK);
        //Turn.setText(Nombre);
        frame.add(Turn);
    }
    
    private void addDado() {    
        Dado.setFont(new Font("URW GOTHIC", Font.BOLD, 35));
        Dado.setBounds(820, 360, 200, 200);
        Dado.setForeground(Color.BLACK);
        frame.add(Dado);
    }
    
    private void addDadon() {    
        Dadon.setFont(new Font("URW GOTHIC", Font.BOLD, 15));
        Dadon.setBounds(820, 390, 200, 200);
        Dadon.setForeground(Color.BLACK);
        frame.add(Dadon);
    }
    
    private void Mover_j1(){
    Ficha f = new Ficha();
    if(fposicion >=1 && fposicion<=11   ){
                x = f.calcPosicion_x(fposicion);
                F1.setBounds(x,560,41,41);
                x=0;
                }else{
                    if(fposicion >=12 && fposicion <=21 ){
                        y = f.calcPosicion_y(fposicion);F1.setBounds(45,y,41,41);}
                    else{
                        if(fposicion >=22 && fposicion <=31){
                        x = f.calcPosicion_x(fposicion); F1.setBounds(x,60,41,41);
                        }
                        else{
                            if(fposicion >=32 && fposicion <=40){
                            y = f.calcPosicion_y(fposicion);F1.setBounds(555,y,41,41);
                            }
                        }
                    }
                }
    }
    private void Mover_j2(){
    Ficha f = new Ficha();
    if(fposicion2 >=1 && fposicion2<=11   ){
                x = f.calcPosicion_x(fposicion2);
                F2.setBounds(x,560,41,41);
                x=0;
                }else{
                    if(fposicion2 >=12 && fposicion2 <=21 ){
                        y = f.calcPosicion_y(fposicion2);F2.setBounds(45,y,41,41);}
                    else{
                        if(fposicion2 >=22 && fposicion2 <=31){
                        x = f.calcPosicion_x(fposicion2); F2.setBounds(x,60,41,41);
                        }
                        else{
                            if(fposicion2 >=32 && fposicion2 <=40){
                            y = f.calcPosicion_y(fposicion2);F2.setBounds(555,y,41,41);
                            }
                        }
                    }
                }
    }
    private void addButton_Lanzar(){
        Lanzar.setBounds(640,470, 100, 50);
        Lanzar.setBackground(Color.WHITE);
        frame.add(Lanzar);
        Lanzar.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){        
                if (pares==false){
                    cambiarturno();
                    lanzar_Dados();
                }else{
                    JOptionPane.showMessageDialog(frame, "Pares");
                    lanzar_Dados();
                }
            }  
        });  
        frame.add(Lanzar);
    }
    
    private void cambiarturno(){
        
        if(Turn.getText()== Nombre){
            Turn.setText(Nombre2);
        }
        else{
            Turn.setText(Nombre);
        }
    }
    
    private void lanzar_Dados(){
        Dado d = new Dado();
        Dadosuma = d.TirarDado();
        Dado_1 = d.getD1();
        Dadon.setText(String.valueOf(Dado_1));
        Dado_2 = d.getD2();
        Dadon2.setText(String.valueOf(Dado_2));
        pares = d.getEstado();
        if(Turn.getText()== Nombre){
        fposicion=fposicion+Dadosuma;
        Mover_j1();
        if(fposicion>40){
            int r= 0;
            fposicion=r;
        }
        }else{
            if(Turn.getText()== Nombre2){      
                fposicion2=fposicion2+Dadosuma;
                Mover_j2();
                if(fposicion2>40){
                    int r= 0;
                    fposicion2=r;
                }
            }
        }
        if(fposicion ==31 ){
            fposicion = 11;
            JOptionPane.showMessageDialog(frame, "Ve a la carcel");
            Mover_j1();
        }
        
        if(fposicion2 ==31 ){
            fposicion2 = 11;
            JOptionPane.showMessageDialog(frame, "Ve a la carcel");
            Mover_j2();
        }      
    }
    
    private void addImage() {
        tablero.setBounds(20,20,600,600);
        tablero.setIcon(img2);
        frame.add(tablero);
    }
    
    private void addPanel(){
        Imagenes.add(tablero);
        Imagenes.setBounds(20,20,600,600);
        frame.add(Imagenes);
    }
    
    private void addF1() {
        F1.setBounds(555,560,41,41);
        frame.add(F1);

    }
    private void addF2() {
        F2.setBounds(555,570,41,41);
        frame.add(F2);

    }
    
    private void addDado2() {    
        Dado2.setFont(new Font("URW GOTHIC", Font.BOLD, 35));
        Dado2.setBounds(820, 420, 200, 200);
        Dado2.setForeground(Color.BLACK);
        frame.add(Dado2);

    }
    
    private void addDadon2() {    
        Dadon2.setFont(new Font("URW GOTHIC", Font.BOLD, 15));
        Dadon2.setBounds(820, 450, 200, 200);
        Dadon2.setForeground(Color.BLACK);
        frame.add(Dadon2);

    }
    
}