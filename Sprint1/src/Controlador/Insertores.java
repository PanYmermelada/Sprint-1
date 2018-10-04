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
  
    
    public void Registrar_Participante(Participante par){
                
                Connection cn=con.conectar();
           
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
    
    }
    public void Registrar_Congresista(Congresista Cong){
                Connection cn=con.conectar();
                try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO CONGRESISTAS (NOMBRE_CONGRESISTA,CI_CONGRESISTA,"  
                    + "EDAD_CONGRESISTA,TITULO_CONGRESISTA) VALUES(?,?,?,?)");
            pps.setString(1,Cong.getNombCongresista());
            pps.setString(2,Cong.getCiCongresista());
            pps.setInt(3,Cong.getEdadCongresista());
            pps.setString(4,Cong.getTitCongresista());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Congresista registrado");
        } catch (SQLException ex) {
            Logger.getLogger(Insertores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Registrar_Congreso(String nom_cong, String Aula,String Fecha,Integer hora,String tema,Float costo){
        Connection cn=con.conectar();
                try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO CONGRESOS (NOMBRE_CONGRESO,AULA_CONGRESO,"  
                    + "FECHA_CONGRESO,HORA_INICIO_CONGRESO,TEMA_CONGRESO,COSTO_CONGRESO) VALUES(?,?,?,?,?,?)");
            pps.setString(1,nom_cong);
            pps.setString(2,Aula);
            pps.setString(3,Fecha);
            pps.setInt(4,hora);
            pps.setString(4,tema);
            pps.setFloat(4,costo);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Congreso registrado");
        } catch (SQLException ex) {
            Logger.getLogger(Insertores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    }

