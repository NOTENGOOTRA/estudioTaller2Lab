package gui;

import com.sun.tools.jconsole.JConsoleContext;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ventanaMain extends JFrame {


    private JButton bienvenidButton;
    private JPanel panel1;

    public ventanaMain (String title) {
        super(title);

        setBounds(100,100,450,300);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
        bienvenidButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroCliente1 frame2 = new RegistroCliente1("Registro Cliente");
                frame2.setVisible(true);
                dispose();
            }
        });
    }




        public static void main (String[]args){
            JFrame frame = new ventanaMain("Bienvenida");
            frame.setVisible(true);
        }
    }
