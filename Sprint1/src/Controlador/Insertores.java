/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

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
    
    public void Registrar_participante(String nombre, Integer CI,Integer Edad,String Titulo){
       
                
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO PARTICIPANTES(NOMBRE_PARTICIPANTE,CI_PARTICIPANTE,"  
                    + "EDAD_PARTICIPANTE,TITULO_PARTICIPANTE) VALUES(?,?,?,?)");
            pps.setString(1,nombre);
            pps.setInt(2,CI);
            pps.setInt(3,Edad);
            pps.setString(4,Titulo);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Participante registrado");
        } catch (SQLException ex) {
            Logger.getLogger(Insertores.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
