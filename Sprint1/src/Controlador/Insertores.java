/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Congresista;
import Modelo.Participante;
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
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO PARTICIPANTES(NOMBRE_PARTICIPANTE,CI_PARTICIPANTE,"  
                    + "EDAD_PARTICIPANTE,TITULO_PARTICIPANTE) VALUES(?,?,?,?)");
            pps.setString(1,par.getNombParticipante());
            pps.setString(2,par.getCi());
            pps.setInt(3,par.getEdadParticipante());
            pps.setString(4,par.getTitParticipante());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Participante registrado");
        } catch (SQLException ex) {
            Logger.getLogger(Insertores.class.getName()).log(Level.SEVERE, null, ex);
        }
    
