/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author UCA40427
 */
public class VentanaBase extends JFrame implements ActionListener
{
    //controles
    private JLabel titulo;
    private JTextField caja;
    private JButton ver;
    
    
    public VentanaBase() //lo colocamos en el constructor para inicializa
    {//ctrl+espacio para ayuda
        inicializarControles();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cierra el programa
        setSize(400,500);// Damos forma(Ancho y alto)
        setLocationRelativeTo(null);//null=centrar 
        setLayout(null);//posicionamiento
        setResizable(true);//false=permite redimensionar
        setVisible(true);//hace visible la ventana
        setTitle("Ventana Base");
    }
    public void inicializarControles()
    {
        //crear intancia del control
        titulo = new JLabel();
        titulo.setBounds(110, 50, 180, 25);
        titulo.setText("MENSAJE");
        add(titulo);
        
        caja = new JTextField();
        caja.setBounds(110, 70, 180, 25);
        caja.setText("");
        add(caja);
        
        ver = new JButton();
        ver.setBounds(110, 100, 180, 25);
        ver.setText("VER");
        ver.addActionListener(this);
        add(ver);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource().equals(ver)) 
        {
            caja.setText("Hola mundo swing");
        }
    }
    
    
}
