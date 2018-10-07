/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.DCongresistas;
import Modelo.DCongresos;
import Modelo.DParticipantes;
import Modelo.Usuarios;
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
  
    
    public void Registrar_Participante(DParticipantes par , DCongresos Congre){
                
                Connection cn=con.conectar();
           
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO PARTICIPANTES(NOMBRE_PARTICIPANTE,CI_PARTICIPANTE,"  
                    + "EDAD_PARTICIPANTE,TITULO_PARTICIPANTE) VALUES(?,?,?,?)");
            pps.setString(1,par.getNombre_participante());
            pps.setInt(2,par.getCi_participante());
            pps.setInt(3,par.getEdad_participante());
            pps.setString(4,par.getTitulo_participante());
            pps.executeUpdate();
            // para registrar en tabla participa 
           PreparedStatement ppsp = cn.prepareStatement("INSERT INTO PARTICIPA(CI_PARTICIPANTE,ID_CONGRESO) VALUES(?,?)");
           ppsp.setInt(1,par.getCi_participante());
            ppsp.setString(2,Congre.getId_congreso());
            JOptionPane.showMessageDialog(null,"Participante registrado");
        } catch (SQLException ex) {
            Logger.getLogger(Insertores.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public void Registrar_Congresista(DCongresistas Cong){
                Connection cn=con.conectar();
                try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO CONGRESISTAS (NOMBRE_CONGRESISTA,CI_CONGRESISTA,"  
                    + "EDAD_CONGRESISTA,TITULO_CONGRESISTA) VALUES(?,?,?,?)");
            pps.setString(1,Cong.getNombre_congresista());
            pps.setInt(2,Cong.getCi_congresista());
            pps.setInt(3,Cong.getEdad_congresista());
            pps.setString(4,Cong.getTitulo_congresista());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Congresista registrado");
        } catch (SQLException ex) {
            Logger.getLogger(Insertores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Registrar_Congreso(DCongresos Congreso){
        Connection cn=con.conectar();
                try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO CONGRESOS (NOMBRE_CONGRESO,AULA_CONGRESO,"  
                    + "FECHA_CONGRESO,HORA_INICIO_CONGRESO,TEMA_CONGRESO,COSTO_CONGRESO) VALUES(?,?,?,?,?,?)");
            pps.setString(1,Congreso.getNombre_congreso());
            pps.setString(2,Congreso.getAula_congreso());
            pps.setString(3,Congreso.getFecha_congreso());
            pps.setString(4,Congreso.getHora_inicio_congreso());
            pps.setString(4,Congreso.getTema_congreso());
            pps.setFloat(4,Congreso.getCosto_congreso());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Congreso registrado");
        } catch (SQLException ex) {
            Logger.getLogger(Insertores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Registrar_Usuario(Usuarios usua){
         Connection cn=con.conectar();
          try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO USUARIOS (NOMBRE_USUARIO,CONTRASEÑA,"
                    + "TIPO_USUARIO) VALUES(?,?)");
            pps.setString(1,usua.getNombre_usuario());
            pps.setString(2,usua.getContraseña());
            pps.setString(2,usua.getTipo_usuario());
            
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Usuario registrado");
        } catch (SQLException ex) {
            Logger.getLogger(Insertores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    }

