/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Insertores {
    Conexion con = new Conexion();
    Connection cn=con.conectar();
    
    //Piter: modificacion del metodo para que reciba como parametro un objeto con sus
    // atributos que seran registrados en la DB
    public void Registrar_participante(DParticipante p){
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO PARTICIPANTES(NOMBRE_PARTICIPANTE,CI_PARTICIPANTE,"  
                    + "EDAD_PARTICIPANTE,TITULO_PARTICIPANTE) VALUES(?,?,?,?)");
            pps.setString(1,p.getNombre_participante());
            pps.setInt(2,p.getCi_participante());
            pps.setInt(3,p.getEdad_participante());
            pps.setString(4,p.getTitulo_participante());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Participante registrado");
        } catch (SQLException ex) {
            Logger.getLogger(Insertores.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
