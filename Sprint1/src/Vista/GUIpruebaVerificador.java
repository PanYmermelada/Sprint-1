/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.Conexion;
import Controlador.Verificador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author Piter Molina Chacón (pjmolina2012@gmail.com)
 */
public class GUIpruebaVerificador extends JFrame implements ActionListener {
    private JLabel textNomConf;
    private JLabel labelConex;
    private JTextField cajaNomConf;
    private JButton botonVerificar;
    final Conexion conex;
    
    public GUIpruebaVerificador(){
        super();
        configurarVentana();
        inicializarComponentes();
        conex=new Conexion();
        conex.conectar(); 
    }
    
    public void configurarVentana(){
        //Se da los parametros y caracteristicas a la ventana
        this.setTitle("Verificando Conferencias");
        this.setSize(500,300);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void inicializarComponentes(){
        
        textNomConf=new JLabel();
        labelConex=new JLabel();
        cajaNomConf=new JTextField();
        botonVerificar=new JButton();
        
        textNomConf.setText("Conferencia");
        textNomConf.setBounds(50,50,200,25);
        cajaNomConf.setBounds(180, 50, 200, 25);
        botonVerificar.setText("VERIFICAR si Existe");
        botonVerificar.setBounds(150, 100, 200, 25);
        labelConex.setText("....");
        labelConex.setBounds(400, 200, 200, 25);
        botonVerificar.addActionListener(this);
        
        this.add(textNomConf);
        this.add(cajaNomConf);
        this.add(botonVerificar);
        this.add(labelConex);
    }
    
    public static void main(String[] args){
        GUIpruebaVerificador v=new GUIpruebaVerificador();
        v.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Verificador vc=new Verificador();
        String buscar=cajaNomConf.getText();
        try {
            vc.verificarParticipante(buscar, conex);
        } catch (SQLException ex){
            Logger.getLogger(GUIpruebaVerificador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
