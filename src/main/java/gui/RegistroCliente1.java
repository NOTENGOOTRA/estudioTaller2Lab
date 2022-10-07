package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.*;

public class RegistroCliente1 extends ventanaMain {
    private JTextField textoNombre;
    private JTextField textoDireccion;
    private JTextField textoCorreo;
    private JTextField textoRut;
    private JTextField textoNumero;

    private JPanel panel2;
    private JButton botonRegistro;



    public RegistroCliente1 (String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel2);
        this.pack();


        botonRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre, direccion, correo, rut, numero;
                nombre = textoNombre.getText().toString();
                direccion = textoDireccion.getText().toString();
                correo = textoCorreo.getText().toString();
                rut = textoRut.getText().toString();
                numero = textoNumero.getText().toString();
                if (nombre.equals("") && direccion.equals("") && correo.equals("") && rut.equals("") && numero.equals(""))
                    JOptionPane.showMessageDialog(null, "Insertar datos en todos los campos porfavor");
            else{
                    JOptionPane.showMessageDialog(null, "Datos agregados");
                }

             dispose();
            }
        });
    }


    public static void main (String[]args){
        RegistroCliente1 frame2 = new RegistroCliente1("Registro Cliente");
        frame2.setVisible(true);

    }


}